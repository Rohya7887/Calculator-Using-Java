import java.util.Scanner;

public class SimpleCalculator
{
    public static double add(double a, double b)
    {
        return a + b;
    }
    public static double subtract(double a, double b)
    {
        return a - b;
    }
    public static double multiply(double a, double b)
    {
        return a * b;
    }
    public static double divide(double a, double b)
    {
        if(b == 0)
        {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take input from the user
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        //Perform all operations
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Substraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }
}