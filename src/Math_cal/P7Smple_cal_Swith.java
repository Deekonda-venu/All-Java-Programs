package Math_cal;

import java.util.Scanner;

public class P7Smple_cal_Swith {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int result = 0;
    char ch = sc.next().charAt(0);

            switch (ch) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Cannot divide by zero");
                        sc.close();
                        return;
                    }
                    result = a / b; // integer division
                    break;
                case '%':
                    if (b == 0) {
                        System.out.println("Cannot modulo by zero");
                        sc.close();
                        return;
                    }
                    result = a % b;
                    break;
                default:
                    System.out.println("Invalid operator: " + ch);
                    sc.close();
                    return;
            }

            System.out.println("Result: " + result);
            sc.close();
        }
    }


