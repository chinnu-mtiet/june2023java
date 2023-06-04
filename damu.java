class A
{
public void funA1()
{
System.out.println("\nFunA1 xcalled from class A");
}
public void funA2()
{
System.out.println("\nFunA2 called from class A");
}
}
class B
{
public static void main(String args[])
{
A ob=new A();
ob.funA1();
ob.funA2();
}
}

 