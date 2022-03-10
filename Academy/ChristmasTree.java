package Academy;

import java.util.ArrayList;
import java.util.Arrays;

public class ChristmasTree {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(1, 6, 4, 2, 6, 9));
        int n = A.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A.get(i) < A.get(j)) {
                    for (int k = j + 1; k < n; k++) {
                        if (A.get(j) < A.get(k)) {
                            System.out.println("i:"+i+",j:"+j+",k:"+k);
                        }
                    }
                }
            }
        }

    }
}