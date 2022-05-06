import java.util.Scanner;

public class pgm_10_break_continue {
    public static void main(String[] args) {
        // prime number program
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long num = sc.nextLong();
        boolean z = true;
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if ((num % i) == 0) {
                z = false;
                System.out.println(num + " is a composite number.");
                break;
            }
        }
        if (z) {
            System.out.println(num + " is a prime number.");
        }
        sc.close();
    }
}
