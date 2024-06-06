package Advanced;

public class P1 {
    String s = "hello";

    public static void m (){


        try{
            throw new MyOwnException("my msg");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        
        m();
    }
        
     
       

    }

