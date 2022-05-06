public class pgm_05_final {
    public static void main(String[] args)
    {
        final int k = 5;
        // k's values can't be changed
        // k = 45; ----->  error
        int i = k;
        i+=1;
        System.out.println(k);
        System.out.println(i);
    }
}
