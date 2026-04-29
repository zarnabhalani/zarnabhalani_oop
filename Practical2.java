import java.util.Scanner;

public class LinearEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        System.out.print("Enter d: ");
        double d = sc.nextDouble();
        System.out.print("Enter e: ");
        double e = sc.nextDouble();
        System.out.print("Enter f: ");
        double f = sc.nextDouble();

        double D = a * d - b * c;

        if (D == 0) {
            System.out.println("No unique solution");
        } else {
            double Dx = e * d - b * f;
            double Dy = a * f - e * c;

            double x = Dx / D;
            double y = Dy / D;

            System.out.printf("x = %.2f\n", x);
            System.out.printf("y = %.2f", y);
        }
    }
}
