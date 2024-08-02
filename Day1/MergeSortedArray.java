// package Day1;
// import java.io.*;

public class MergeSortedArray {
 
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        int[] result = new int[m + n];
        
        System.arraycopy(arr1, 0, result, 0, m);

        while(i >= 0 && j >= 0) {
            if(result[i] > arr2[j]) {
                result[k--] = result[i--];
            } else {
                result[k--] = arr2[j--];
            }
        }

        while(j >= 0) {
            result[k--] = arr2[j--];
        }

        return result;
    }

    public static void main(String args[]) {
        int arr1[] = {3, 6, 9, 10};
        int arr2[] = {4, 10, 11};
        int m = arr1.length;
        int n = arr2.length;
        int arr[] = ninjaAndSortedArrays(arr1, arr2, m, n);
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
