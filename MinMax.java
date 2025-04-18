import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
      
        int[] arr = new int[n];
        
       
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
      
        int min = arr[0];
        int max = arr[0];

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  
            }
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }

       
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        scanner.close();
    }
}
