import java.util.Scanner;
class InputSwap1
{
public static double add(double a,double b)
{
double c=a+b;
return c;
}
public static double sub(double a,double b)
{
double c=a-b;
return c;
}
public static double mul(double a,double b)
{
double c=a*b;
return c;
}
public static double div(double a,double b)
{
double c=a/b;
return c;
}
public static double mod(double a,double b)
{
double c=a%b;
return c;
}
public static void main (String args[])
{
Scanner scob=new Scanner(System.in);
int num1,num2;
num1=sc.nextInt();
num2=sc.nextInt();
int temp;
temp=num;
num1=num2;
num2=temp;
System.out.println(num + "\n"+num2);
}
}


