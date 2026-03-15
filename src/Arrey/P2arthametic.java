package Arrey;

import java.util.Scanner;

public class P2arthametic {

    public void sum (int[] arr1 , int[] arr2){
        for(int i=0; i< arr1.length; i++){
            System.out.println(arr1[i]+arr2[i]);
        }

    }
    public void sub (int[] arr1 , int[] arr2){
        for(int i=0; i< arr1.length; i++){
            System.out.println(arr1[i]-arr2[i]);
        }

    }
    public void mulkt (int[] arr1 , int[] arr2){
        for(int i=0; i< arr1.length; i++){
            System.out.println(arr1[i]*arr2[i]);
        }

    }
    public void divi(int[] arr1 , int[] arr2){
        for(int i=0; i< arr1.length; i++){
            System.out.println(arr1[i]%arr2[i]);
        }

    }

    public int printchoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for + ");
        System.out.println("Press 2 for - ");
        System.out.println("Press 3 for * ");
        System.out.println("Press 4 for % ");

        int choice = sc.nextInt();
        return choice;


    }
    public static void main(String[] args) {
        System.out.println("ENter number length of arrrey");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr1 = new int[length];
        int[] arr2 = new int[length];
        for(int i=0; i<arr1.length; i++){
            System.out.println("ENter number for Arr1");
            arr1[i] = sc.nextInt();

        }
        for(int i=0; i<arr2.length; i++){
            System.out.println("ENter number for Arr2");
            arr2[i] = sc.nextInt();
        }


        P2arthametic obj = new P2arthametic();
        int choice = obj.printchoice();

        switch (choice){
            case '1' :
                obj.sum(arr1,arr2);
                break;


            case '2' :
                obj.sub(arr1,arr2);
                break;


            case '3' :
                obj.mulkt(arr1,arr2);
                break;


            case '4' :
                obj.divi(arr1,arr2);
                break;


            default:
                System.out.println("netr that number wroung");

        }




    }
}
