import java.util.Scanner;
class swapping{
public static void main(String[] args){
Scanner num= new Scanner(System.in);
int num1=90,num2=89;
System.out.println("Before swapping");
System.out.println("num1="+num1);
System.out.println("num2="+num2);
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("After swapping");
System.out.println("num1="+num1);
System.out.println("num2="+num2);
}
}

