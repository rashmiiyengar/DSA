package Hash;

public class P5 {
    
    public static void main(String[] args) {
        

        int arr[]={1,2,2,4,7,4,9,1,7,4};

        int count[]=new int[11];

        for(int e:arr){
                count[e]++;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]>0)
            System.out.println(i+ " occured " +count[i]);
        }
    }
}
