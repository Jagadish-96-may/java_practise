import java.util.Scanner ;
public class basic_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number : ");
        int a = sc.nextInt();
        System.out.print("enter the second number : ");
        int b = sc.nextInt();
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double remainder = a / b;
        System.out.println("sum : " + sum + "\n difference : " + difference + "\nproduct : " + product + "\n remainder : " + remainder);
    }

    }

