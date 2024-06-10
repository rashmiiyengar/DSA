package Advanced;

public class Test {
    
    private int a;

    public Test(int a) {
        this.a = a;
    }

    public void increment() {
        a++;
    }

    public void x() {
        System.out.println(a);
    }
    public static void main(String[] args) {
        Test obj = new Test(10);
        obj.increment();
        obj.x(); 
    }
}
