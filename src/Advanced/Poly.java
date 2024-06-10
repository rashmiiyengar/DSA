package Advanced;

public class Poly  extends P1{
    
    void display(String a) {
        System.out.println("int method");
    }

    void display(Object o) {
        System.out.println("varargs method");
    }

    static void d(){
        System.out.println("child class");
    }
    public static void main(String[] args) {
        
        P1 obj = new Poly();
        //obj.display(null);
        obj.d();

    }
}
