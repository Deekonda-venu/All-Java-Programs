package Area_program;

import java.util.Scanner;

public class P3areaisosceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();


        double s = Math.sqrt(4*(side1*side2)-(side2*side2));
        int a = side2/4;

        double sum = a*s;
        System.out.println(sum);



    }
}
