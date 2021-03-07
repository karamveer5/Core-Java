import java.util.*;
class card
{
public static void main(String[] args)
{
String s1,s2,s3;
int sk1,s,sk,dis;
Scanner sc = new Scanner(System.in);

System.out.println("For VISA Card Enter 1");
System.out.println("For XYZ  Card Enter 2");
System.out.println("For ABC  card Enter 3");
System.out.print("Enter Credit Card Name: ");
sk = sc.nextInt();
s1 = "VISA";
s2 = "XYZ";
s3 = "ABC";
if(sk==1)
{
	System.out.println("You Have Been Selected "+s1+ " Card");
	System.out.print("Enter Shopping Amount:");
	sk1 = sc.nextInt();
	if(sk1<5000)
	{
	 s = sk1*10/100;
	 dis = sk1-s;
	 System.out.println("Your Net Price Is: "+dis+"(You have 10% Discount)");
	}
	else
	{
	 s = sk1*20/100;
	 dis = sk1-s;
	 System.out.println("Your Net Price Is: "+dis+"(You have 20% Discount)");
	}
}
else if(sk==2)
{
	System.out.println("You Have Been Selected "+s2+ " Card");
	System.out.print("Enter Shopping Amount: ");
	sk1 = sc.nextInt();
	if(sk1<10000)
	{
	 s = sk1*15/100;
	 dis = sk1-s;
	 System.out.println("Your Net Price Is: "+dis+"(You have 15% Discount)");
	}
	else
	{
	 s = sk1*25/100;
	 dis = sk1-s;
	 System.out.println("Your Net Price Is: "+dis+"(You have 25% Discount)");
	}
}
else if(sk==3)
{
	System.out.println("You Have Been Selected "+s3+ " Card");
	System.out.print("Enter Shopping Amount: ");
	sk1 = sc.nextInt();
	if(sk1<8000)
	{
	 s = sk1*12/100;
	 dis = sk1-s;
	 System.out.println("Your Net Price Is: "+dis+"(You have 12% Discount)");
	}
	else
	{
	 s = sk1*15/100;
	 dis = sk1-s;
	 System.out.println("Your Net Price Is: "+dis+"(You have 15% Discount)");
	}
}
else
{
System.out.print("Please Enter The Number Between 1 to 3");
}
}
}
