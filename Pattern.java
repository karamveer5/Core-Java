import java.util.Scanner;
class Pattern
{
public static void main(String args[])
{
int k;
Scanner sk = new Scanner(System.in);
System.out.print("Enter a number ");
k = sk.nextInt();

for(int i=0; i<k; i++)   
{   
for(int j=0; j<=i; j++)   
{   
System.out.print("* ");   
}   
System.out.println();  
}
}
}