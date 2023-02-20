/*
* Write a program to check if a given String is anagram of another String
*
* SOLUTION: This solution uses an array of integers charCounts with a size of 128 (assuming ASCII characters). 
* The first loop increments the count for each character in str1 and decrements the count for each character in str2. 
* The second loop checks if all counts in the charCounts array are zero, indicating that the two strings are anagrams. 
* If any count is not zero, the method returns false.
*/
public class Main {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCounts = new int[128];
        for (int i = 0; i < str1.length(); i++) {
            charCounts[(int) str1.charAt(i)]++;
            charCounts[(int) str2.charAt(i)]--;
        }
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
