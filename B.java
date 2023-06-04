class B
{
public static void main(){
System.out.println("Main method without arguement called");
}
public static void main(String args[])
{
System.out.println("Anil is Typing");
main();
main(20);
}
public static void main(int x)
{
System.out.println("Main method with Arguement called "+x*2);
}
}
