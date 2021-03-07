import java.util.Scanner;
class AreaOfCircle 
{
   public static void main(String args[])
   {
      int k;
      double s;
      Scanner sk = new Scanner(System.in);
      System.out.print("Enter the radius of the circle : ");
      k = sk.nextInt();
      s = (k*k)*3.141592653589793238462643;
      System.out.println("Area of the circle is : "+s);
   }
}