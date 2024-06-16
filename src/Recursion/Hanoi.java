package Recursion;

// Tower of Hanoi //Recursion //Y
// Rules
// Only one disk transferred at one time
// Smaller disk should be on top of larger disk

public class Hanoi {

    public static void towerOfHanoi(int n, String src, String helper, String destination) {

        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, src, destination, helper);
        System.out.println("Transfer disk" + n + " from " + src + " to " + destination);
        towerOfHanoi(n-1, helper, src, destination);

    }

    public static void main(String[] args) {

        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }

}
