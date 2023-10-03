package main;

import  linearSearch.LinearSearch;
import  binarySearch.BinarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 2, 59, 18, 0, 12, 8};
        int target = 8;

        System.out.println("Choose a search operation:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        int choice = scanner.nextInt();

        int index = -1;

        switch (choice) {
            case 1:
                index = LinearSearch.linearSearch(arr, target);
                break;
            case 2:
                index = BinarySearch.binarySearch(arr, target);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                break;
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
