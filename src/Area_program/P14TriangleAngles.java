package Area_program;

import java.util.Scanner;

public class P14TriangleAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double angleA = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        double angleC = 180 - angleA - angleB;

        System.out.println("Angle A: " + angleA);
        System.out.println("Angle B: " + angleB);
        System.out.println("Angle C: " + angleC);
    }
}
