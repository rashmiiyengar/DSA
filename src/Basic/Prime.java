package Basic;

public class Prime {

    static boolean isPrime(int number) {

        if (number < 2) {
            System.out.println("Number is neither prime nor composite");
            return false;
        }

        if (number == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If number is divisible by any number in this range, it's not prime
            if (number % i == 0) {
                return false;
            }

        }
        // If no divisors are found return true
        return true;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 6, 7, 8 };

        for (int e : arr) {
            System.out.println("The number " + e + "is prime " + isPrime(e));
        }

    }
}