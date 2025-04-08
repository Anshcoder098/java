import java.util.Scanner;

public class car {
    String colour;

    car(String c) {
        colour = c;
        System.out.println("Car colour set using constructor.");
    }

    void displaycolour() {
        System.out.println("The colour of the car is: " + colour);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the desired colour for the car: ");
        String userColour = scanner.nextLine();

        car mycar = new car(userColour);
        mycar.displaycolour();

        scanner.close();
    }
}