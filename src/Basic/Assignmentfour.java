package Basic;
public class Assignmentfour {
    public static void main(String[] args) {
        
        int number=15;
        if(number%3==0 && number%5==0){
        System.out.println(number);
        }else if(number%5==0){
            System.out.println("number divisible by 5" +number);
        }
        else{
            System.out.println("number divisible by 3" +number);
        }

    }
}
