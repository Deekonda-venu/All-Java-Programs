package Math_cal;

public class P3cube {
    int number ;
    P3cube(int n ){
        this.number=n;
    }

    @Override
    public String toString() {
        return "Number" + number;
    }
    public static void main(String[] args) {
        P3cube cu = new P3cube(24);
        System.out.println(cu);
        P3cube p3 = cube(cu);
        System.out.println(p3.number);



    }

    public static P3cube cube(P3cube i){
        P3cube c = new P3cube(0);
         c.number= c.number *c.number * c.number;

        return c;
    }
}
