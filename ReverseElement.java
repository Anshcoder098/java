import java.util.Scanner;

public class ReverseElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the target number to reverse: ");
        int target = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                arr[i] = reverseNumber(arr[i]);
                break; 
            }
        }
        System.out.println("Updated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        scanner.close(); 
    }
        public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
