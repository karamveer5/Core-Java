import java.util.Scanner;
class areaofrectangle
{
public static void main(String[] args)
{
	int s,k;
	Scanner n = new Scanner(System.in);
	System.out.print("Enter a length ");
	s = n.nextInt();

	Scanner n1 = new Scanner(System.in);
	System.out.print("Enter a breadth ");
	k = n1.nextInt();

	int re = Area(s,k);
	//int r = Area(5,8);
	System.out.println("Area of rectangle is "+re);

}


public static int Area (int a,int b)
{
	return (a*b);
}
}