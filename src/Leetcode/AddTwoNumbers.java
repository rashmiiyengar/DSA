package Leetcode;

public class AddTwoNumbers {
     public static class ListNode {
            int val;
           ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
        {
            ListNode answer=new ListNode();
            ListNode temp=answer;
            int carry=0;
            while(l1!=null || l2!=null || carry==1)
            {
                int sum=0;
                if(l1!=null)
                {
                    sum+=l1.val;
                    l1=l1.next;
                }
                if(l2!=null)
                {
                    sum+=l2.val;
                    l2=l2.next;
                }
                sum+=carry;
                carry=sum/10;
                ListNode node=new ListNode(sum%10);
                temp.next=node;
                temp=temp.next;
            }      
            return answer.next;
        }

        public static void main(String[] args) {
            AddTwoNumbers solution = new AddTwoNumbers();
            // Create first number: 342 (represented as 2 -> 4 -> 3)
            ListNode l1 = new ListNode(2);
            l1.next = new ListNode(4);
            l1.next.next = new ListNode(3);

            // Create second number: 465 (represented as 5 -> 6 -> 4)
            ListNode l2 = new ListNode(5);
            l2.next = new ListNode(6);
            l2.next.next = new ListNode(4);

            // Add the two numbers
            ListNode result = solution.addTwoNumbers(l1, l2);

            // Print the result
            while (result != null) {
                System.out.print(result.val);
                if (result.next != null) {
                    System.out.print(" -> ");
                }
                result = result.next;
            }
        }
}
