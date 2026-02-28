package Area_program;

import java.util.Scanner;

public class P15GeometricOverloading {

    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    static double area(double length, double width) {
        return length * width;
    }

    static double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    static double area(double a, double b, double height, int trapezoid) {
        return ((a + b) / 2) * height;
    }

    static double areaRhombus(double d1, double d2) {
        return (d1 * d2) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            double r = sc.nextDouble();
            System.out.println(area(r));
        } else if (choice == 2) {
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            System.out.println(area(l, w));
        } else if (choice == 3) {
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.println(area(b, h, true));
        } else if (choice == 4) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.println(area(a, b, h, 0));
        } else if (choice == 5) {
            double d1 = sc.nextDouble();
            double d2 = sc.nextDouble();
            System.out.println(areaRhombus(d1, d2));
        }
    }
}
