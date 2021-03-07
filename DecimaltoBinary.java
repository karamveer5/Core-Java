import java.util.Scanner;
class DecimaltoBinary
{
public static void main(String[] args)
{
int num;
String num1;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number For Converting Decimal To Binary: ");
num = s.nextInt();
System.out.println("Decimal To Binary: "+Integer.toBinaryString(num));
System.out.println("Enter a number For Converting Binary To Decimal: ");
num1 = s.next();
System.out.println("Binary To Decimal: "+Integer.parseInt(num1,2));
}
}