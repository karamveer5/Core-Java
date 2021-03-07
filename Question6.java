import java.util.Scanner;
class Question6 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int s = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int k = sc.nextInt();

        System.out.printf("Sum of two Number: %d%n", s + k);
        System.out.printf("Difference of two Number: %d%n", s - k);
        System.out.printf("Product of two Number: %d%n", s * k);
        System.out.printf("Average of two Number: %.2f%n", (double) (s + k) / 2);
        System.out.printf("Max Number: %d%n", Math.max(s, k));
        System.out.printf("Min Number: %d%n", Math.min(s, k));
    }
}