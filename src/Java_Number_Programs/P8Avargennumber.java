package Java_Number_Programs;

import java.util.HashMap;
import java.util.Scanner;

public class P8Avargennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nter n nubmer");
        int a = sc.nextInt();
        int a1 = 0;
//        int[] ary = new int[a];
//        Map<Integer, String> mp = new HashMap<>();
        for (int i=0; i<a; i++ ){
            a1 = a1+sc.nextInt();
        }
        int a2  = a1/a;
        System.out.println("avg n nubmer : "+a2);

    }
}
