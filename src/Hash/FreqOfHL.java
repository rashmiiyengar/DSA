package Hash;


// brute force
// element that occurs highest and lower number of times

public class FreqOfHL {
    
    public static void main(String[] args) {
        
        int arr[]={10,5,10,15,10,5};
        boolean visited[]=new boolean[arr.length];
        int count =1,maxFreq=0,maxElement=0,minFreq=0,minElement=0;

        for(int i=0;i<arr.length;i++){

            if(visited[i]==true)
                continue;
            for(int j=i+1;i<arr.length;j++){

                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count>maxFreq){
                maxFreq=count;
                maxElement=arr[i];
            }
            if(count<minFreq){
                minFreq = count;
                minElement =arr[i];
            }
        }





    }
}
