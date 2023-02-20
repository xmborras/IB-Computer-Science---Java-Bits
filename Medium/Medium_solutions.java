/*
* Write a program to check if a given String is a palindrome
*
* SOLUTION
*/
public class Main {
    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
/*
* Write a program to find the second largest number in an array of integers
*
* SOLUTION
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 1};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("The second largest number is: " + secondMax);
    }
}
/* 
* Write a program to find the prime factors of a given number
*
* SOLUTION
*/
public class Main {
    public static void main(String[] args) {
        int num = 24;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
}
