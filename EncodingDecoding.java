import java.util.Scanner;

public class EncodingDecoding {
    public static void main(String[] args) {
        System.out.println(" Alphabet is Encode Decode System");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Alphabet: ");
        char alpha = sc.next().charAt(0);
        System.out.print("ENter the Encode code: ");
        int encode = sc.nextInt();
        alpha = (char) (alpha + encode);
        System.out.println("Encoded alphabet is " + alpha);

        System.out.println("if You want to decode type y");
        char y = sc.next().charAt(0);
        if (y == 'y') {
            alpha = (char) (alpha - encode);
            System.out.println("Here is decoded alphabet " + alpha);
        }
        sc.close();

    }

}
