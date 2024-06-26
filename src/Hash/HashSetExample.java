package Hash;
import java.util.HashSet;
import java.util.Iterator;

// working with iterator
//initially 'it' points to null
//it.next() -> returns next element value
//it.hasNext() -> returns boolean value

public class HashSetExample {
public static void main(String[] args) {
    
    //Creating
    HashSet<Integer> set = new HashSet<>();

    set.add(1);
    set.add(2);
    set.add(3);
    set.add(2);  //like list.add(2)

    //Search - contains
    if(set.contains(1)){
        System.out.println("Set contains 1");
    }
    if(!set.contains(8)){
        System.out.println("Set not contains 8");
    }

    //Delete
    set.remove(1);
    if(!set.contains(1)){
        System.out.println("1 removed succesfully");
    }

    //Size
    System.out.println("size of set is" +set.size());
    
    //Print all elements
    System.out.println(set);


    //Iterator

    Iterator it = set.iterator();

    while (it.hasNext()) {
            System.out.println(it.next());
    }

    //Hashset are unordered
}
}
