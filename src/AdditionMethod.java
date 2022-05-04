import java.util.Scanner;

public class AdditionMethod
{
    public static void main (String[] args)
    {
        int num1, num2, add;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();
        add = sum(num1, num2);
        System.out.println("The sum of numbers is "+ add);
    }

    public static int sum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }

}
