package concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorOperator {


    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(30,3));//3,30,34,5,9
        ArrayList<String> ans=new ArrayList<String>();
        for(int j =0;j<A.size();j++)
        {
            ans.add(Integer.toString(A.get(j)));
        }

        Collections.sort(ans,new Comparator<String>(){

            public int compare(String o1, String o2) {
                String order1=o1+o2;
                String order2=o2+o1;
                return order2.compareTo(order1);
            }
        });

        String str="";
        for(int i =0;i<ans.size();i++)
        {
            str+=ans.get(i);
            System.out.println(ans.get(i));
        }

//        if(str.charAt(0)=='0')str="0";
//        System.out.println(str);
    }
}
