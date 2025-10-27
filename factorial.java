public class factorial {
    public static void main(String[] args) {

        int n = 10;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.print(i+"*");
        }
        System.out.println();
        System.out.print(n + "! = " + factorial);
    }
}
