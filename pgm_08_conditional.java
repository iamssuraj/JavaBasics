import java.util.Scanner;

public class pgm_08_conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Please enter your age : ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.print("Congratulations, " + name + "! You're eligible to vote!");
        } else {
            System.out.print("Sorry, " + name + "! You're not eligible to vote!");
        }
        sc.close();
    }
}
