import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = scanner.nextInt();
        int[] marks = new int[n];
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        System.out.println("Enter marks for " + n + " students:");
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
            if (marks[i] >= 81 && marks[i] <= 100) {
                count1++;
            } else if (marks[i] >= 61 && marks[i] <= 80) { 
                count2++;
            } else if (marks[i] >= 41 && marks[i] <= 60) { 
                count3++;
            } else {
                count4++;
            }
        }
        System.out.println("\n Numbers of students in each range:");
        System.out.println("81 to 100:" + count1);
        System.out.println("61 to 80:" + count2); 
        System.out.println("41 to 60:" + count3);
        System.out.println("0 to 40:" + count4);
        scanner.close();
    }
}