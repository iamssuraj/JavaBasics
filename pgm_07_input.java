import java.util.Scanner;

public class pgm_07_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int num = sc.nextInt(); // nextFloat etcc. can be used except for strings
        // System.out.println(num);

        // String input
        System.out.print("Enter your name : ");
        // String name = sc.next();// Not for lines
        String name = sc.nextLine();// For taking a line of input
        System.out.println(name);
        sc.close();
    }
}
