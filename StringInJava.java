public class StringInJava {
    public static void main(String[] args) {
        System.out.println("Here All String operation Performed");
        String str = "Vijaykumar";
        System.out.println(str);
        // Other declaration method.
        String str1 = new String("Akshay");
        System.out.println(str1);
        // Find the string length.
        int len = str.length();
        System.out.println(len);
        // lower case of str
        System.out.println(str.toLowerCase());
        // upper case of str1
        System.out.println(str1.toUpperCase());

        // now triming of the string
        String str2 = "  Onkar  ";
        // without trimmed
        System.out.println(str2);
        // trimmed
        System.out.println(str2.trim());

    }
}
