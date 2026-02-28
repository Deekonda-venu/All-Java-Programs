package Area_program;

import java.util.Scanner;

public class P8CircleProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        double diameter = 2 * r;
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
