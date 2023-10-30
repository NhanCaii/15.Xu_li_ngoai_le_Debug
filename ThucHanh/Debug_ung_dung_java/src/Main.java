import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scan=new Scanner(System.in);
        System.out.print("a= ");
        double a=scan.nextDouble();

        System.out.print("b= ");
        double b = scan.nextDouble();


        if (a != 0) {
            double answer = - b/a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}