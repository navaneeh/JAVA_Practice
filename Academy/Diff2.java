package Academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Diff2 {
    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<Integer>(Arrays.asList(1,3,2));

        System.out.println(diffPossible(ans,7));

    }

        public static int diffPossible(ArrayList<Integer> A, int B) {

            HashMap<Integer, Integer> hashMap = new HashMap<>();

            for (int num : A) {
                if (hashMap.containsKey(num)) {
                    int value = hashMap.get(num);
                    value++;
                    hashMap.put(num, value);
                } else {
                    hashMap.put(num, 1);
                }
            }

            for (int num : A) {

                int n = B + num;

                if (hashMap.containsKey(n)) {
                    if (num == n && hashMap.get(n) > 1)
                        return 1;
                    else if (num != n)
                        return 1;
                }

                n = num - B;

                if (hashMap.containsKey(n)) {
                    if (num == n && hashMap.get(n) > 1)
                        return 1;
                    else if (num != n)
                        return 1;
                }
            }

            return 0;


        }

}
