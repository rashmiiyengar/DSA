package Hash;

public class P1 {
    public static void main(String[] args) {
        

        int a[]= {1,2,1,9,10,4,9};

        int count[]= new int[11];

        for(int e:a){
            count[e]++;
        }

       // Print the frequency of each element
       System.out.println("Element : Frequency");
       for(int i = 0; i < count.length; i++) {
           if (count[i] > 0) {
               System.out.println(i + " : " + count[i]);
           }
       }
    }
}
