package Area_program;

import java.util.Scanner;

public class P10PerimeterRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();

        double perimeter = 4 * side;
        System.out.println(perimeter);
    }
}
