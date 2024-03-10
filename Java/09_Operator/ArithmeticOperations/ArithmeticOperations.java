import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scan.nextInt();
        System.out.printf("a * 2 = %d\n", a * 2);
        System.out.println("a / 3 = " + (a / 3));
        System.out.print("a - 5 = " + (a - 5));
        scan.close();
    }
}
