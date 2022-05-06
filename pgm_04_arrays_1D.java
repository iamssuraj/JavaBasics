import java.util.Arrays;

public class pgm_04_arrays_1D {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 0;
        System.out.println("Before Sort : ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        Arrays.sort(arr);
        System.out.println("After Sort : ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}