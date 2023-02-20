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
/*
* Write a program to find the sum of all elements in a two-dimensional array
*
* SOLUTION
*/
public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = findSum(arr);
        System.out.println("The sum of all elements in the array is: " + sum);
    }

    public static int findSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
/*
* Write a program to remove all duplicates from an array of integers
*
* SOLUTION
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        int[] arrWithoutDuplicates = removeDuplicates(arr);
        for (int i = 0; i < arrWithoutDuplicates.length; i++) {
            System.out.print(arrWithoutDuplicates[i] + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] arrWithoutDuplicates = new int[arr.length];
        int currentIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < currentIndex; j++) {
                if (arr[i] == arrWithoutDuplicates[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arrWithoutDuplicates[currentIndex] = arr[i];
                currentIndex++;
            }
        }
        int[] result = new int[currentIndex];
        for (int i = 0; i < currentIndex; i++) {
            result[i] = arrWithoutDuplicates[i];
        }
        return result;
    }
}
