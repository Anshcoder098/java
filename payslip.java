import java.util.Scanner;

public class payslip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter basic pay:");
        double basicpay = scanner.nextDouble();
        double da = basicpay * 0.50;
        double hra = basicpay * 0.14;
        double grosspay = basicpay + da + hra;
        System.out.println("\n Payslip");
        System.out.println("Basic pay:" + basicpay);
        System.out.println("DA (50%):" + da);
        System.out.println("HRA (14%):" + hra);
        System.out.println("Gross pay:" + grosspay); 
        scanner.close(); 
    }
}