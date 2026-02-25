package Logical_q;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;



public class P5primenumber {
    static Scanner sc = new Scanner(System.in);
    int n ;
    int value;

    P5primenumber(int n){
        this.n = n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        P5primenumber p5 = new P5primenumber(a);

        System.out.println(p5.n);
        P5primenumber obje = p5.primenumber(p5);
        if(obje.value == 2){
            System.out.println("prime");
        }


    }

    public P5primenumber primenumber(P5primenumber a){
        P5primenumber obj = new P5primenumber(0);
        obj.value=0;
        for(int i=1; i<=a.n; i++){
            if(a.n%i==0){
                obj.value++;
            }
        }
        System.out.println(obj.value);
        System.out.println(a.n);


        return obj;
    }
}
