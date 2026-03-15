package Arrey;

import java.util.Scanner;

public class P10secondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter lemgth of arreuy ");
        int lenght = sc.nextInt();
        if (lenght < 2) {
            System.out.println("Need at least 2 elements");
            return;
        }
        int[] arrey = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            System.out.println("Emter value of arreuy " + i);
            arrey[i] = sc.nextInt();
        }
        for (int i = 0; i < lenght; i++) {
            System.out.print(arrey[i]+" ");

        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i=0; i<lenght; i++){
            int value = arrey[i];
            if (value > largest) {
                secondlargest = largest;
                largest = value;
            } else if (value != largest && value > secondlargest) {
                secondlargest = value;
            }
        }

        System.out.println();
        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("Second largest not found");
        } else {
            System.out.println(secondlargest);
        }

        sc.close();

    }
}
