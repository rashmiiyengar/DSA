package LinkedList;

import java.lang.reflect.Method;

//Memory allocated - non contiguous
//Variable size
//use whenever insert or delete at index , Time complexity O(1)
//search time complexity is O(N) 

//

public class P1 {

    class Node{

        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next= null;
        }
    }
    // head of the list
    private static Node head;

    // Method to print the linked list
    public static void printList() {
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
   

    //add - first,last
    public void addFirst(String data){
        Node newNode = new Node(data);
       
        if(head== null){
             head=  newNode;
             return;
        }
        newNode.next = head;
        head= newNode;
    
    }

    //add -last
    public void addLast(String data){

        Node newNode = new Node(data);
       
        if(head== null){
             head=  newNode;
             return;
        }

        Node currNode = head;
        while (currNode.next!= null) {
            
            currNode = currNode.next;

        }

        currNode.next= newNode;

    }

    public static void main(String[] args) {

        P1 list = new P1();
            list.addFirst("a");
            list.addFirst("b");

            printList();
    }
    
}
