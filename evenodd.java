import java.util.Scanner;
class number{
public static void main(String[] args){
Scanner num= new Scanner(System.in);
System.out.println("Enter a number");
int number=num.nextInt();
int result=(number/2)*2;
if(result==number){
System.out.println("No. is even");
}
else{
System.out.println("No. is odd");
}
}
}