import java.util.Scanner;
class maxoftwonum{
public static void main(String[] args){
Scanner Sc= new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=Sc.nextInt();
System.out.println("Enter the second number:");
int num2=Sc.nextInt();
int max=Math.max(num1,num2);
System.out.println("the maximum no. is"+max);
}
}