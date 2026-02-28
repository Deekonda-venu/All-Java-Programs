package Area_program;

import java.util.Scanner;

public class P13TriangleValidBySides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Not a valid triangle");
        }
    }
}
