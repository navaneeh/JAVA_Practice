package Academy;

import java.util.ArrayList;
import java.util.Arrays;

public class ChristmasTree {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(1, 3, 5 ));
        ArrayList<Integer> B=new ArrayList<>(Arrays.asList(1, 2, 3));

        System.out.println(solve(A,B));

    }
        public static int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
            int min_value=Integer.MAX_VALUE;
            int n=A.size();

            for(int q=1;q<=n-2;q++)
            {
                int temp=Integer.MAX_VALUE;
                for(int p=0;p<=q-1;p++)
                {
                    if(A.get(p)<A.get(q) && temp>B.get(p))
                    {
                        temp=B.get(p);
                    }
                }

                if(temp!=Integer.MAX_VALUE)
                {
                    temp+=B.get(q);
                    int temp2=Integer.MAX_VALUE;
                    for(int r=q+1;r<=n-1;r++)
                    {
                        if(A.get(q)<A.get(r) && temp2>B.get(r))
                        {
                            temp2=B.get(r);
                        }
                    }

                    if(temp2!=Integer.MAX_VALUE)
                    {
                        if(min_value>temp+temp2)
                        {
                            min_value=temp+temp2;
                        }
                    }
                }
            }

            if(min_value==Integer.MAX_VALUE) return -1;

            return min_value;
        }

        // public int static bruteforceSolution(ArrayList<Integer> A, ArrayList<Integer> B)
        // {
        //       int n=A.size();
        //     int ans=Integer.MAX_VALUE;

        //     for(int i=0;i<n;i++)
        //     {
        //         for(int j=i+1;j<n;j++)
        //         {
        //                 for(int k=j+1;k<n;k++)
        //                 {
        //                     if(A.get(j)<A.get(k) &&  A.get(i)<A.get(j))
        //                     {
        //                         ans=Math.min(ans,B.get(i)+B.get(j)+B.get(k));
        //                     }
        //                 }
        //         }
        //     }

        //     if(ans==Integer.MAX_VALUE)return -1;
        //     return ans;
        // }
    }


