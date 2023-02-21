/*
* Write a program to check if a given number is odd or even
*
* SOLUTION:
*/
public class Main {
    public static void main(String[] args) {
        int num = 9;
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
/*
* Write a program to find the largest number among 3 given numbers
*
* SOLUTION: 
*/
public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 2;
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("The largest number is: " + max);
    }
}
/*
* Write a program to check if a given String is a palindrome
*
* SOLUTION: 
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
* Write a program to sort an array of integers in ascendign order
*
* SOLUTION: 
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*
* Write a program to find the Fibonacci sequence up to a given number
*
* SOLUTION: 
*/
public class Main {
    public static void main(String[] args) {
        int num = 10;
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < num; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

/* 
* Write a program to reproduce the Linear Search algorithm
*
* SOLUTION
*/
public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}

/*
* Write a program to countdown to zero from a given integer
*
* SOLUTION
*/
public static void countdown(int startNumber) {
    for (int i=startNumber; i>=0; i--) {
        System.out.println(i);
    }
}
