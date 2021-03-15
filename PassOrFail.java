import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        System.out.println("Here Enter Your PCMB marks System will Say you are Pass or Fail");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Physics Marks: ");
        float phy = sc.nextFloat();
        System.out.print("Enter the Chemistry Marks: ");
        float chem = sc.nextFloat();
        System.out.print("Enter the Biology Marks: ");
        float bio = sc.nextFloat();
        System.out.print("Enter the Maths Marks: ");
        float math = sc.nextFloat();
        float avg = (phy + chem + bio + math)*100 / 400;
        // System.out.println(avg);
        if ((avg > 40) && (phy > 33 && chem > 33 && bio > 33 && math > 33)) {
            System.out.println("Yes you are Pass");
        } else {
            System.out.println("YOu are Failed");
        }
        sc.close();

    }
}
