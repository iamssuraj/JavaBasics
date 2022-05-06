import java.util.Scanner;

public class pgm_12_functions {
    // functions
    public static int myFunction(int a[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println(myFunction(a, n));
        sc.close();
    }
}
