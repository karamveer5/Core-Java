import java.util.Scanner;
class AgeException extends Exception
{
AgeException(String s)
{
super(s);
}
}

class student
{

static int rollno,age;
static String name,course;

student(int rollno, int age,String name,String course)
{
this.rollno = rollno;
this.age = age;
this.name = name;
this.course = course;
}

public static void main(String[] args)
{
try
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter Student Roll no.: ");
rollno = sc.nextInt();

System.out.print("Enter Age Of The Student: ");
age = sc.nextInt();

System.out.print("Enter Name Of The Student: ");
name = sc.next();

System.out.print("Enter Course Of The Student: ");
course = sc.next();

if(age>=15 && age<=21)
{
System.out.println("Student Details Is:");
System.out.println("The Name Of The Student IS "+name);
System.out.println("The Age Of The Student IS "+age);
System.out.println("The Roll No. Of The Student IS "+rollno);
System.out.println("The Course Of The Student IS "+course);
}
else
{
throw new AgeException("Age not within the range");
}
}

catch(AgeException ae)
{
System.out.print(ae);
}
}
}
