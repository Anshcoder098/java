import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the element to find: ");
        int target = scanner.nextInt(); 
        System.out.print("Enter the target index to check: ");
        int targetIndex = scanner.nextInt(); 
        if (targetIndex < 0 || targetIndex >= arr.length) {
            System.out.println("Invalid index.");
            scanner.close();
            return;
}
        if (arr[targetIndex] == target) {
            System.out.println("Element found at index " + targetIndex + ": " + arr[targetIndex]);
        } else {
            System.out.println("Element not found at index " + targetIndex);
        }
        
        scanner.close(); 
    }
}
