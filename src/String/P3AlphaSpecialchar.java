package String;

import java.util.Scanner;

public class P3AlphaSpecialchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i);
            char c1 = s.charAt(i);
            if((c>=32 && c<=42) || (c>=64 && c<=126)){
                System.out.println("Special character " + c1);
            }else {
                count = count + c;
            }

        }
        System.out.println(count);
    }
}
