package Arrays.RemoveDuplicate;

//optimal

public class RemoveDuplicateBrute {

    static int removeDuplicate(int[] arr){

        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int arr[]= {1,1,2,2,3,3,3};

        int k=removeDuplicate(arr);
        System.out.println("the array after removing duplicates is ");
        for(int i=0;i<=k;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
