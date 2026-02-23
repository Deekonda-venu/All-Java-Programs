package Advance_number;

import java.util.Random;

public class P3Random {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println(number);
        double  number1 = Math.random()*10;
        System.out.println(number1);

        int dies = random.nextInt(6)+1;
        System.out.println(dies);


    }
}
