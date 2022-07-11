package concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LongestHhistogram {
        public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,6,6,4));
        int[] nsl=nearestSmallestLeft(arr);
        int[] nsr=nearestSmallersRight(arr);

            int ans=Integer.MIN_VALUE;
            int arr_size=arr.size();
            for(int i=0;i<arr_size;i++)
            {
                int temp=0;
                if(nsl[i]==-1 && nsr[i]==-1)
                {
                    temp=arr_size*arr.get(i);
                }else if(i==0)
                {
                    temp=nsr[i]+1;
                }else if(i==(arr_size-1))
                {
                    temp=(i-nsl[i])*arr.get(i);
                }else if(i!=0 && i!=(arr_size-1) && nsl[i]==-1)
                {
                    temp=(nsr[i]-1)*arr.get(i);
                }else if(i!=0 && i!=(arr_size-1) && nsr[i]==-1)
                {
                    temp=i-nsl[i]*arr.get(i);
                }else
                {
                    temp=(nsr[i]-nsl[i]-1)*arr.get(i);
                }
                ans=Math.max(ans,temp);
            }

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

            ans[A.size()-1]=-1;
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
                            ans[i]=-1;
                        }
                    }
                }else
                {   st.push(i);
                    ans[i]=-1;
                }
            }
            return ans;
        }
    }


