class Student
{
int rollno;
String name;
Student()
{
rollno=0;
Student name=null;
}
Student(int r,String n)
{
rollno=r;
name=n;
}
void displayInformation()
{
System.out.println(rollno+" "+name);
}
}
class TestStudent5
{
public static void main(String args[])
{
Student s1;
 s1=new Student();
Student s2=new Student(101,"damu");
s1.displayInformation();
s2.displayInformation();
}
}
