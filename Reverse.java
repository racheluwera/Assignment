/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Reverse {
    public static void main(String[] args) {
        // Define the input array
        int[] numbers = {3, 4, 6, 1, 9, 7, 5, 8};

        System.out.println("Original Array:");
        printArray(numbers);

        // Reverse the array
        reverseArray(numbers);

        System.out.println("Reversed Array:");
        printArray(numbers);
    }

    // Method to reverse the elements of the array
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
while (left < right) {
            // Swap elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the center
            left++;
            right--;
        }
    }

    // Method to print the elements of the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

