import java.util.Scanner;
class Input3
{
public static void main (String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number:");
Double num1;
num1=scob.nextDouble();
System.out.println("Enter a number:");
Double num2;
num2=scob.nextDouble();
System.out.println(num1+" +"+num2 +"="+ div(num1,num2));
System.out.println(num1+" -"+num2 +"="+ div(num1,num2));
System.out.println(num1+" *"+num2 +"="+ div(num1,num2));
System.out.println(num1+" /"+num2 +"="+ div(num1,num2));
System.out.println(num1+" %"+num2 +"="+ div(num1,num2))
}
}

