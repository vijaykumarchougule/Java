import java.util.Scanner;


public class AdditonUserInput {
    public static void main(String[] args) {
        System.out.println("Additon by Using User Input");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Additon by Using User Input is "+sum);        
    
        sc.close();
    }
}
