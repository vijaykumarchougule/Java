import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        boolean isInArray= false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key element for search: ");
        int key = sc.nextInt();
        for (int i : arr) {
            if (i == key) {
                isInArray= true;
                break;
            }
        }
        if(isInArray)
        {
            System.out.println("Element FOund");
        }else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}
