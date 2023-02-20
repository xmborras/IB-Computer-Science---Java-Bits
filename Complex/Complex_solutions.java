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
/*
* Write an program to reproduce the Merge Sort algorithm
*
* SOLUTION: This implementation takes an integer array arr as an input and sorts it in non-decreasing order 
* using the Merge sort algorithm. The algorithm is recursive and splits the array into two halves until
* each subarray has length 1 or 0. It then merges the two subarrays in sorted order to produce a sorted array. 
* The merge operation is performed by a separate method merge, which takes three arrays as inputs:
* the original array arr, and the two subarrays left and right to be merged.
*
* The mergeSort method first checks whether the length of the array is greater than 1.
* If so, it calculates the middle index mid and uses the Arrays.copyOfRange method to create two new subarrays
* left and right consisting of the elements in the original array from index 0 to mid and from index
* mid to the end of the array, respectively. It then recursively calls mergeSort on left and right,
* and finally calls merge to merge the two sorted subarrays back into the original array.
*
* The merge method initializes three index variables i, j, and k to 0, and enters a loop that continues 
* as long as i is less than the length of left and j is less than the length of right.
* In each iteration of the loop, it compares the i-th element of left to the j-th element of right,
* and copies the smaller of the two to the k-th position of arr. It then increments i, j, and k as appropriate.
* After the loop completes, the algorithm copies any remaining elements from left or right to the end of arr.
* The resulting arr is a sorted array.
*/
public static void mergeSort(int[] arr) {
    if (arr.length > 1) {
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }
}

private static void merge(int[] arr, int[] left, int[] right) {
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) {
            arr[k] = left[i];
            i++;
        } else {
            arr[k] = right[j];
            j++;
        }
        k++;
    }
    while (i < left.length) {
        arr[k] = left[i];
        i++;
        k++;
    }
    while (j < right.length) {
        arr[k] = right[j];
        j++;
        k++;
    }
}
