import java.util.Scanner;

public class MarksToPercentage {
    public static void main(String[] args) {
        System.out.println("Covert Your 5 Subject Marks to Percentage");
        System.out.println("Enter Your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter the Marks of Marathi");
        float s1 = sc.nextFloat();
        System.out.println("Enter the Marks of English");
        float s2 = sc.nextFloat();
        System.out.println("Enter the Marks of History");
        float s3 = sc.nextFloat();
        System.out.println("Enter the Marks of Hindi");
        float s4 = sc.nextFloat();
        System.out.println("Enter the Marks of Maths");
        float s5 = sc.nextFloat();

        float sum = s1 + s2 + s3 + s4 + s5;
        float per = sum * 100 / 500;

        System.out.println("Hi " + name + " your percentage is " + per);
        sc.close();
    }
}
