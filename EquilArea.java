import java.util.Scanner;

public class EquilArea {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the length of the side of the equilateral triangle: ");
        double side = scanner.nextDouble();

        
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);

        
        System.out.println("The area of the equilateral triangle is: " + area);
        
        
        scanner.close();
    }
}
