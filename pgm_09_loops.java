import java.util.Scanner;

public class pgm_09_loops {
    public static void main(String[] args) {

        // for loop
        // for (int i = 0; i <= 10; i++)
        // System.out.println(i);

        // while loop
        // int i = 0;
        // while (i <= 10) {
        // System.out.println(i);
        // i++;
        // }

        // do-while loop
        Scanner sc = new Scanner(System.in);
        char c;
        int i = 0;
        do {
            System.out.println("Hey, I am " + i++);
            System.out.print("Continue? (y/n) : ");
            c = sc.next().charAt(0);
        } while (c == 'y' || c == 'Y');

        sc.close();
    }
}
