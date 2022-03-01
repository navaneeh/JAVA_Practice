package Academy;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSumAndEven {

        public static void main(String args[])
        {
            ArrayList<Integer> A=new ArrayList<Integer>();

            A.add(1);
            A.add(2);
            A.add(3);
            A.add(7);
            A.add(1);
            A.add(2);
            A.add(3);
            System.out.println(solve(A));

        }
        public static int solve(ArrayList<Integer> A) {
            int arr_size=A.size();
            int[] Psodd=new int[arr_size];
            int[] Pseven=new int[arr_size];
            prefixSumodd(Psodd,A);
            prefixSumeven(Pseven,A);
           //System.out.println(Arrays.toString(Psodd));
//            System.out.println(Psodd.toString());
           // System.out.println(Pseven.toString());

            int count=0;
            for(int i=0;i<arr_size;i++)
            {
                int value1=0;
                int value2=0;
                int value3=0;
                int value4=0;

                if(i!=0)
                {
                    value1=Psodd[i-1];
                    value3=Pseven[i-1];
                }

                if(i!=(arr_size-1))
                {
                    value2=Pseven[arr_size-1];
                    value4=Psodd[arr_size-1];
                }

                int sumofodd=value1+(value2- Pseven[i]);

                int sumofeven=value3+(value4- Psodd[i]);

                if(sumofodd==sumofeven)
                {
                    count++;
                }
            }

            return count;

        }

        public static int[] prefixSumodd(int[] arr,ArrayList<Integer> A)
        {


            arr[0]=0;

            int value=0;
            for(int i=1;i<A.size();i++)
            {

                if(i%2!=0)value=arr[i-1]+A.get(i);
                else value=arr[i-1];
                //System.out.println(i);
                arr[i]=value;
             //  System.out.println(value);

            }
            //System.out.println(Arrays.toString(arr));
            //System.out.println(arr);
            return arr;
        }

        public static int[] prefixSumeven(int[] arr,ArrayList<Integer> A)
        {
            arr[0]=A.get(0);
            int value=0;
            for(int i=1;i<A.size();i++)
            {

                if(i%2==0)value=arr[i-1]+A.get(i);
                else value=arr[i-1];

                arr[i]=value;

            }

            return arr;
        }

}
