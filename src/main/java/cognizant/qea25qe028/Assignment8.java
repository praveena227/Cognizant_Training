package cognizant.qea25qe028;

import java.util.*;

public class Assignment8 {

    public static void main(String[] args) {
        int[] arr = {9, 3, 6, 8, 4, 7};
        String[] strArr = {"One", "Two", "Three", "Four"};

        System.out.println("1. Largest number: " + findLargest(arr));
        System.out.println("2. Array without duplicates: " + Arrays.toString(removeDuplicates(arr)));
        System.out.println("3. Second largest number: " + findSecondLargest(arr));
        System.out.println("4. Bubble sort: " + Arrays.toString(bubbleSort(arr.clone())));
        System.out.println("5. Selection sort: " + Arrays.toString(selectionSort(arr.clone())));
        System.out.println("6. Insertion sort: " + Arrays.toString(insertionSort(arr.clone())));
        System.out.println("7. Binary search for 6: " + binarySearch(arr.clone(), 6));
        System.out.println("8. Linear search for 6: " + linearSearch(arr, 6));
        System.out.println("9. Sum of elements: " + sumArray(arr));
        System.out.println("10. Average of elements: " + averageArray(arr));
        System.out.println("11. Max and Min: " + Arrays.toString(findMaxMin(arr)));
        System.out.println("12. Duplicate elements: " + findDuplicates(arr));
        System.out.println("13. Smallest and Largest: " + Arrays.toString(findMaxMin(arr)));
        System.out.println("14. Swap strings without temp:");
        swapStrings("Hello", "World");
        System.out.println("15. Creating an array: " + Arrays.toString(new int[]{1, 2, 3}));
        
        System.out.println("16. Multidimensional array:");
        createMultiDimensionalArray();
        System.out.println("17. Reverse array:");
        printReverse(arr);
        System.out.println("18. Alternative elements:");
        printAlternatives(strArr);
        System.out.println("19. Greatest number: " + findLargest(arr));
        System.out.println("20. Least number: " + findMin(arr));
        System.out.println("21. For loop example:");
        forLoopExample(arr);
        System.out.println("22. For-each loop example:");
        forEachLoopExample(arr);
    }
  //Question 1. Write a Java program to find the largest number?
  //Question 19. Write a Java program to find the greatest number in an integer array int[] a = {9,3,6,4,8,5}
    
    static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }
  //Question 2. Write a Java program to remove duplicates from an array?
    static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
  //Question 3. Write a Java program to find the second largest number in an array?
    static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }
  //Question 4. Write a Java program to sort an array using bubble sort?
    static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
                }
        return arr;
    }
  //Question 5. Write a Java program to sort an array using selection sort?
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIdx]) minIdx = j;
            int temp = arr[minIdx]; arr[minIdx] = arr[i]; arr[i] = temp;
        }
        return arr;
    }
  //Question 6. Write a Java program to sort an array using insertion sort?
    static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

      //Question 7. Write a Java program to implement binary search?
    static int binarySearch(int[] arr, int key) {
        Arrays.sort(arr);
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
  //Question 8. Write a Java program to implement linear search?
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == key) return i;
        return -1;
    }
  //Question 9. Write a Java program to find the sum of elements in an array?
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }
  //Question 10. Write a Java program to find the average of elements in an array?
    static double averageArray(int[] arr) {
        return (double) sumArray(arr) / arr.length;
    }
  //Question 11. Write a Java program to find the maximum and minimum elements in an array?
  //Question 13. How to find the smallest and largest numbers in a Java Array?
    static int[] findMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return new int[]{min, max};
    }

  //Question 12. How to find duplicate elements in a Java Array?
    static String findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) duplicates.add(num);
        }
        return duplicates.toString();
    }
  //Question 14. Write a Java program to swap two strings without using temp or third variable?
    static void swapStrings(String a, String b) {
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("a: " + a + ", b: " + b);
    }
  //Question 16. Demonstrate creating a multidimensional array
    static void createMultiDimensionalArray() {
        int[][] matrix = {{1, 2}, {3, 4}};
        for (int[] row : matrix) System.out.println(Arrays.toString(row));
    }
  //Question 17. Write a Java program to create an integer array int[] a = {9,3,6,8,4,7} and print the elements of the   array in reverse
    static void printReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();
    }
  //Question 18. Write a Java program to print alternative elements in a String array String[] a = {"One", "Two", "Three",   "Four"}
    static void printAlternatives(String[] arr) {
        for (int i = 0; i < arr.length; i += 2) System.out.println(arr[i]);
    }
  //Question 20. Write a Java program to find the least number in an integer array int[] a = {9,3,6,4,8,5}
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) if (num < min) min = num;
        return min;
    }
  //Question 21. Provide an example for using a for loop with single-dimensional arrays
    static void forLoopExample(int[] arr) {
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
  //Question 22. Provide an example for using a for-each loop with single-dimensional arrays
    static void forEachLoopExample(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
