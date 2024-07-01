package Hash;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCode {

    static class InnerHashMapCode<K, V> { // generics K,V any type
        private class Node {

            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n - nodes
        private int N; // N - buckets

        private LinkedList<Node> buckets[]; // N = buckets.length

        @SuppressWarnings("unchecked")
        public InnerHashMapCode() {
            this.N = 4;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(); // empty linked list is created where the value stored is null
                // to store data
            }
        }

        private int hashFunction(K key) {
            // bi should be between 0 to N-1 thats y we are doing bi % N so that we can get
            // bi within n-1 value
            int bi = key.hashCode();
            return Math.abs(bi) % N;
            // bi = 234556 or -234254

        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i; // di
                }
            }
            return -1;

        }

        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];

            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];

                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            // O(lambda) - maximum
            // worst case O(N)
            // WHEN HASH FUNCTION RETURNS SAME BI
            // or when more rehashing
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            // data index is the index of nodes of the linked list stored in a bucket
            // di = 0+ means key exist //-1 key not exist

            if (di == -1) {
                // key doesnt exist
                buckets[bi].add(new Node(key, value));
                n++; // the number of nodes keep increasing after adding node
            } else {
                // key exist
                Node node = buckets[bi].get(di);
                node.value = value;
                // number of node will not increase as we are updating
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                // rehashing
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            // data index is the index of nodes of the linked list stored in a bucket
            // di = 0+ means key exist //-1 key not exist

            if (di == -1) {
                // key doesnt exist
                return false;
            } else {
                // key exist
                return true;
            }
        }

        public V get(K key) {
            // if key exist value returns else return null
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            // data index is the index of nodes of the linked list stored in a bucket
            // di = 0+ means key exist //-1 key not exist

            if (di == -1) {
                // key doesnt exist

                return null;
            } else {
                // key exist
                Node node = buckets[bi].get(di);
                return node.value;
                // number of node will not increase as we are updating
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            // data index is the index of nodes of the linked list stored in a bucket
            // di = 0+ means key exist //-1 key not exist

            if (di == -1) {
                // key doesnt exist
                return null;
            } else {
                // key exist
                Node node = buckets[bi].remove(di);
                return node.value;
            }
        }

        public boolean isEmpty() {

            return n == 0;
        }

        public ArrayList<K> keySet() {

            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) { // bi
                LinkedList<Node> ll = buckets[i];

                for (int j = 0; j < ll.size(); j++) { // di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }

    public static void main(String[] args) {

        InnerHashMapCode<String, Integer> map = new InnerHashMapCode<>();
        map.put("India", 190);
        map.put("US", 120);
        map.put("Italy", 90);

    }
}