package Math_cal;

import java.util.Scanner;

public class P5Squret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=1; i<a; i++){
            if(a==i*i) {
                System.out.println("Given number is squarroot of " + a + " and " + i);
            }
        }

    }
}
