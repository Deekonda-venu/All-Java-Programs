package Area_program;

import java.util.Scanner;

public class P7AreaTrapezoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        double area = ((a + b) / 2) * h;
        System.out.println(area);
    }
}
