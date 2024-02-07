import java.util.*;

public class String_Question {
    public static void main(String arg[]) {
        // Question No. (1) : Count how many times lower case vowels occurred in a
        // String entered by the user.
        // Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // int count = 0;
        // for (int i = 0; i < str.length(); i++) {
        // char ch = str.charAt(i);
        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        // count++;
        // }
        // }
        // System.out.println("count of vowels is :" + count);

        // Question No. (2) :
        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));

        // Question No. (3) :
        // String str = "ApnaCollege".replace("l","");
        // System.out.println(str);

        // Question no. (4) : Determine if 2 Strings areanagramsof each other.What are
        // anagrams? If two strings contain the same characters but i na different
        // order,they can be said to be an agrams.Consider race and
        // care.Inthiscase,race's characters can be formed in to a study,or care's
        // character scan be formed in to race.Below is a java program to check if two
        // strings are
        // anagrams or not.
        String str1 = "earth";
        String str2 = "heart";

        //  Convert str1 and str2 to lowercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            // Convert str1 and str2 to character arrays.
            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // Compare the sorted character arrays.
            boolean result = Arrays.equals(str1charArray, str2charArray);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        }

        else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
}
