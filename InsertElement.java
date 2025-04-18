import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] arr = {10, 20, 30, 40, 50};

       
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter the position (0-based index): ");
        int position = sc.nextInt();

        
        int[] newArr = new int[arr.length + 1];

       
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = element;
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

       
        System.out.print("Array after insertion: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
