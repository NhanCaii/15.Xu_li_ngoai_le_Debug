import java.util.Scanner;

class IllegalTriangle extends Exception {
    public IllegalTriangle(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc= new Scanner(System.in);

        try {
            System.out.print("Nhap canh 1:");
            int side1= sc.nextInt();
            System.out.print("Nhap canh 2:");
            int side2= sc.nextInt();
            System.out.print("Nhap canh 3:");
            int side3= sc.nextInt();
            checkTriangle(side1,side2,side3);
        } catch (IllegalTriangle e) {
            System.err.println("error side, " + e.getMessage());
        }

    }

    public static void checkTriangle(int side1, int side2, int side3) throws IllegalTriangle {
        if (side1<=0 || side2<=0 || side3<=0 || (side1+side2)<=side3 || (side2+side3)<=side1 || (side3+side1)<=side2 ){
            throw new IllegalTriangle("Value error");
        }
    }
}