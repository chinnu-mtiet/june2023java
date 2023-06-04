import java.util.Scanner;
class StringFrequency
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int i=sc.nextint();
System.out.println(str.count(i));
}
}