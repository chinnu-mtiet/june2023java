import java.util.*;
public class Ascii
{
public static void main(String args[])
{
char ch;
System.out.println("enter a character");
Scanner sc=new Scanner(System.in);
ch =sc.next().charAt(0);
int ascii_var=(int)ch;
System.out.println("The ASCII value of" + ch +"is"+ascii_var);
}
}
