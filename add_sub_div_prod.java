import java.util.*;

public class add_sub_div_prod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int Sum = a + b;
        int Product = a * b;
        int Division = a / b;
        int Subtract = a - b;
        System.out.println("Subtract is : " + Subtract);
        System.out.println("Sum is : " + Sum);
        System.out.println("Product is : " + Product);
        System.out.println("Division is : " + Division);

        int side = sc.nextInt();
        double Area = 3.14 * side * side;
        System.out.println(Area);
        sc.close();
    }
}
