import java.util.Scanner;
class poweroftwo{
public static void main(String[] args){
Scanner Sc= new Scanner(System.in);
System.out.println("Enter a number:");
int num=Sc.nextInt();
boolean ispoweroftwo=(num>0)&&((num&(num-1))==0);
System.out.println("ispoweroftwo");
}
}
