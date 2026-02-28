package Area_program;

import java.util.Scanner;

public class P2Equilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a  = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a==b && b==c){
            double a1 =  Math.sqrt(3)/4;
            double Area_oftraingle = a1 * a * a;
            System.out.println("is a equilateral traingle "+Area_oftraingle);

        }else {
            System.out.println("not equilateral traingle");
        }
    }
}
