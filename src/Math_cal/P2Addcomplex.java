package Math_cal;

public class P2Addcomplex {

    double real;
    double imaginary;
    P2Addcomplex (double r, double i){
        this.real = r;
        this.imaginary = i;
    }
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
    public static void main(String[] args) {
        P2Addcomplex cn1 = new P2Addcomplex(12,23);
        P2Addcomplex cn2 = new P2Addcomplex(34,23.4);

        System.out.println(cn1);
        System.out.println(cn2);

        P2Addcomplex add = sum(cn1, cn2);

        System.out.println(add.real + " + " + add.imaginary + "i");



    }

    public static P2Addcomplex sum(P2Addcomplex cn1, P2Addcomplex cn2){
        P2Addcomplex ncn = new P2Addcomplex(0,0);
        ncn.real = cn1.real + cn2.real;
        ncn.imaginary = cn1.imaginary+ cn2.imaginary;

        return ncn;
    }
}
