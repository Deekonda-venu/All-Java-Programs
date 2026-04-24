package Collection;

import java.util.ArrayList;

public class P2Arreylistinsertion {
    public static ArrayList<Integer> fillArrayList(int arr[]) {
        // Your code here
        ArrayList<Integer> arreylist = new ArrayList<>();
        for(int num: arr){
            arreylist.add(num);
        }
        // System.out.println(arreylist);
        return arreylist;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ArrayList<Integer> list = fillArrayList(arr);
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(list.get(i));
        }
        System.out.println();

    }
}
