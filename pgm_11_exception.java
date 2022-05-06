public class pgm_11_exception {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        try {
            System.out.println(a[6]);
        } catch (Exception exception) {
            System.out.println("Please be in your range!");
        }
    }
}
