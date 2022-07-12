package concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LongestHhistogram {
        public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(47, 69, 67, 97, 86, 34, 98, 16, 65, 95, 66, 69, 18, 1, 99, 56, 35, 9, 48, 72, 49, 47, 1, 72, 87, 52, 13, 23, 95, 55, 21, 92, 36, 88, 48, 39, 84, 16, 15, 65, 7, 58, 2, 21, 54, 2, 71, 92, 96, 100, 28, 31, 24, 10, 94, 5, 81, 80, 43, 35, 67, 33, 39, 81, 69, 12, 66, 87, 86, 11, 49, 94, 38, 44, 72, 44, 18, 97, 23, 11, 30, 72, 51, 61, 56, 41, 30, 71, 12, 44, 81, 43, 43, 27));
        int[] nsl=nearestSmallestLeft(arr);
        int[] nsr=nearestSmallersRight(arr);

            int ans=Integer.MIN_VALUE;
            int arr_size=arr.size();
            for(int i=0;i<arr_size;i++)
            {
                int temp=0;
//                if(nsl[i]==-1 && nsr[i]==-1)
//                {
//                    temp=arr_size*arr.get(i);
//                }else if(i==0)
//                {
//                    temp=(nsr[i])*arr.get(i);
//                }else if(i==(arr_size-1))
//                {
//                    temp=(i-nsl[i])*arr.get(i);
//                }else if(i!=0 && i!=(arr_size-1) && nsl[i]==-1)
//                {
//                    temp=(nsr[i])*arr.get(i);
//                }else if(i!=0 && i!=(arr_size-1) && nsr[i]==-1)
//                {
//                    temp=i-nsl[i]*arr.get(i);
//                }else
//                {
                    temp=(nsr[i]-nsl[i]-1)*arr.get(i);
                //}
               // System.out.println(arr.get(i)+":"+temp);
                ans=Math.max(ans,temp);
            }
            System.out.println(Arrays.toString(nsl));
            System.out.println(Arrays.toString(nsr));
            System.out.println(ans);
        }

        public static int[] nearestSmallestLeft(ArrayList<Integer> A)
        {
            Stack<Integer> st=new Stack<Integer>();
            int[] ans=new int[A.size()];

            ans[0]=-1;
            st.push(0);

            for(int i=1;i<A.size();i++)
            {
                if(A.size()>0)
                {
                    if(A.get(st.peek())<A.get(i))
                    {
                        ans[i]=st.peek();
                        st.push(i);
                    }else{
                        while(st.size()>0 && A.get(st.peek()) >= A.get(i))
                        {
                            st.pop();
                        }

                        if(st.size()>0)
                        {
                            ans[i]=st.peek();
                            st.push(i);
                        }else
                        {
                            ans[i]=-1;
                            st.push(i);
                        }
                    }
                }else
                {
                    st.push(i);
                    ans[i]=-1;
                }
            }

            return ans;
        }

        public static int[] nearestSmallersRight(ArrayList<Integer> A)
        {
            Stack<Integer> st=new Stack<Integer>();
            int[] ans=new int[A.size()];

            ans[A.size()-1]=A.size();
            st.push(A.size()-1);

            for(int i=A.size()-2;i>=0;i--)
            {
                if(st.size()>0)
                {
                    if(A.get(st.peek())<A.get(i))
                    {
                        ans[i]=st.peek();
                        st.push(i);
                    }else
                    {
                        while(st.size()>0 && A.get(st.peek())>=A.get(i))
                        {
                            st.pop();
                        }

                        if(st.size()>0)
                        {
                            ans[i]=st.peek();
                            st.push(i);
                        }else
                        {
                            ans[i]=A.size();
                            st.push(i);
                        }
                    }
                }else
                {   st.push(i);
                    ans[i]=A.size();
                }
            }
            return ans;
        }
    }


