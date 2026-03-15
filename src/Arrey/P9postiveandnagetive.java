package Arrey;

import java.util.Scanner;

public class P9postiveandnagetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter lemgth of arreuy ");
        int lenght = sc.nextInt();
        int[] arrey = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            System.out.println("Emter value of arreuy " + i);
            arrey[i] = sc.nextInt();
        }
        for (int i = 0; i < lenght; i++) {
            System.out.print(arrey[i]+" ");

        }
        System.out.println(" ");
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < lenght; i++) {
            if(arrey[i]>0){
                pos++;

            } else if (arrey[i]<0) {
                neg++;

            }

        }
        int[] posarrey = new int[pos];
        int[] nagearray = new int[neg];

        int zero = 0;
        int i1 =0;
        int i2 =0;
        for(int i=0; i<lenght; i++)
        {
            if(arrey[i]>0){
                for(int j=i1; j<posarrey.length; i1++){
                    posarrey[j]=arrey[i];
                }

            } else if (arrey[i]<0) {
                for(int j=i2; j<nagearray.length; i2++){
                    nagearray[j]=arrey[i];
                }
            }
            else{

                zero++;
            }

        }
        for (int i = 0; i < lenght; i++) {
            System.out.print(posarrey[i]+" ");

        }
        for (int i = 0; i < lenght; i++) {
            System.out.print(nagearray[i]+" ");

        }
        System.out.print(zero);

    }
}
