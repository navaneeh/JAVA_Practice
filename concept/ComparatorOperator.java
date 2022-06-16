package concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorOperator {


    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(30,3));//3,30,34,5,9
        ArrayList<Integer> B=new ArrayList<Integer>(Arrays.asList(3,30));//3,30,34,5,9
        ArrayList<Integer> c=new ArrayList<Integer>(Arrays.asList(3,3,3));
        ArrayList<String> ans=new ArrayList<String>();
        ans.add("30");
        ans.add("3");
//        ans.add(A);
//        ans.add(B);
//        ans.add(new ArrayList<Integer>(Arrays.asList(3,3,3)));
//        ans.add(new ArrayList<Integer>(Arrays.asList(3,3,3,6)));


//        Collections.sort(ans,new Comparator<ArrayList<Integer>>(){
//
//            public int compare(ArrayList<Integer> A, ArrayList<Integer> B) {
//               int a_size=A.size();
//               int b_size=B.size();
//               int min=Math.min(a_size,b_size);
//               int i=0;
//               while(i<min)
//               {
//                   if(A.get(i)<B.get(i))
//                   {
//                       return -1;
//                   }else if(A.get(i)>B.get(i))
//                   {
//                       return 1;
//                   }
//                   i++;
//               }
//               if(a_size==b_size)return 1;
//
//               if(a_size!=min) {
//                   return 1;
//               }
//                return -1;
//            }
//        });

//        Collections.sort(ans,new Comparator<String>(){
//
//            public int compare(String o1, String o2) {
//                String order1=o1+o2;
//                String order2=o2+o1;
//                return order2.compareTo(order1);
//            }
//        });

        Collections.sort(ans,new Comparator<String>(){

            public int compare(String o1, String o2) {
                String order1=o1+o2;
                String order2=o2+o1;
                return order2.compareTo(order1);
            }
        });


        for(int i=0;i<ans.size();i++)
        {             System.out.println(ans.get(i));

        }
//        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(30,3));//3,30,34,5,9
//        ArrayList<String> ans=new ArrayList<String>();
//        for(int j =0;j<A.size();j++)
//        {
//            ans.add(Integer.toString(A.get(j)));
//        }
//
//        Collections.sort(ans,new Comparator<String>(){
//
//            public int compare(String o1, String o2) {
//                String order1=o1+o2;
//                String order2=o2+o1;
//                return order2.compareTo(order1);
//            }
//        });

       // String str="";
//        for(int i =0;i<ans.size();i++)
//        {
//            str+=ans.get(i);
//            System.out.println(ans.get(i));
//        }

//        if(str.charAt(0)=='0')str="0";
//        System.out.println(str);
    }
}
