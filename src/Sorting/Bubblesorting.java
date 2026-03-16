package Sorting;

public class Bubblesorting {
    public static void bubbleSortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }

    public static void bubbleSortStrings(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }

    private static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("1. Bubble Sort on Integers (Descending)");
        System.out.println("2. Bubble Sort on Strings");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.println("Enter length of array");
            int length = sc.nextInt();
            int[] arr = new int[length];

            for (int i = 0; i < length; i++) {
                System.out.println("Enter value of array " + i);
                arr[i] = sc.nextInt();
            }

            System.out.println("Before sorting:");
            printIntArray(arr);

            bubbleSortDescending(arr);

            System.out.println("After sorting (Descending):");
            printIntArray(arr);
        } else if (choice == 2) {
            System.out.println("Enter number of strings");
            int length = sc.nextInt();
            sc.nextLine();
            String[] arr = new String[length];

            for (int i = 0; i < length; i++) {
                System.out.println("Enter string " + i);
                arr[i] = sc.nextLine();
            }

            System.out.println("Before sorting:");
            printStringArray(arr);

            bubbleSortStrings(arr);

            System.out.println("After sorting:");
            printStringArray(arr);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
