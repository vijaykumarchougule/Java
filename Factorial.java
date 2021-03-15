import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of Given number");
        System.out.print("Enter the number to find factorail: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = n; i >= 1; i--) {

            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is " + fact);
        sc.close();
    }
}
