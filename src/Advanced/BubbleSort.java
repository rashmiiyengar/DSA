package Advanced;


//Youtube

public class BubbleSort {
    
    public static void printArray(int arr[]){
        System.out.println("Sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]= {7,8,3,1,2,9};

        int i,j;
        for(i=0;i<arr.length-1;i++){

            for(j=0;j<arr.length-i-1;j++){

               if(arr[j]>arr[j+1]){
                int temp= arr[j];

                arr[j] = arr[j+1];

                arr[j+1]= temp;

               }
            }
        }
    printArray(arr);

    }

}
