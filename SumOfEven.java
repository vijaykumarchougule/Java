import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        System.out.println("Sum of First n Even Number ");
        System.out.print("Enter the number of even number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int even = 2;
        for (int i = 1; i <= n; i++) {
            sum = sum + even;
            even+=2;
        }
        System.out.println("The Sum of first " + n + " Even number is " + sum);
        sc.close();
    }
}
