package BinaryTree;

public class Intro {

    class Node{

        Node left;
        Node right;
        //int val;
        int data;

        Node(int d){
            data= d;
            left=null;
            right=null;
        }

        public static void main(String[] args) {
            
            Intro intro = new Intro();

            Node firstNode = intro.new Node(10);
            Node secondNode = intro.new Node(20);
            Node thirdNode =intro.new Node(30);


            firstNode.left = secondNode;
            firstNode.right= thirdNode;


            int i=5;
            System.out.println((int)Math.pow(2, i-1));


        }




    }
    
}
