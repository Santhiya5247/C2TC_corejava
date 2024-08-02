package com.SanthiyaK.oddeven;

public class OddEvenCounter {
    
    // Method to count odd numbers in the array
    public static int getOddCount(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    
    // Method to count even numbers in the array
    public static int getEvenCount(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15};
        
        // Count odd and even numbers
        int oddCount = getOddCount(numbers);
        int evenCount = getEvenCount(numbers);
        
        // Display the counts
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
    }
}
