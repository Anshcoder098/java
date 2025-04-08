import java.util.Scanner;

class Students { 
    String name;
    int age;

   
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    public void displayDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the name of the student:");
        String nameInput = scanner.nextLine();

        System.out.println("Enter the age of the student:");
        int ageInput = scanner.nextInt();

        
        Students student = new Students(nameInput, ageInput);

       
        System.out.println("\nStudent Details:");
        student.displayDetails();

        scanner.close(); // Close the scanner
    }
}