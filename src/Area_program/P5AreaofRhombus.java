package Area_program;

import java.util.Scanner;

public class P5AreaofRhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        double area = (d1 * d2) / 2;
        System.out.println(area);
    }
}
