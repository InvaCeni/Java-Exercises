import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a value for number a: ");
        int a = Integer.valueOf(scanner.nextLine());

        System.out.println("Write a value for number b: ");
        int b = Integer.valueOf(scanner.nextLine());

        System.out.println("Write a value for number c: ");
        int c = Integer.valueOf(scanner.nextLine());

        double d = b * b - 4.0 * a * b;

        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }
    }
}