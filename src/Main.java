import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first word ");
        String str1 = scanner.next().toLowerCase();
        //System.out.println(str1);
        System.out.print("Enter second word");
        String str2 = scanner.next().toLowerCase();
        //System.out.println(str2);


        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);


        return Arrays.equals(str1Array, str2Array);
    }
}
