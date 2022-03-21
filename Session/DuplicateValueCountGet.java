package Session;

public class DuplicateValueCountGet {
    public static void main(String[] args) {
        int[] A={-10,1,1,1,4,4,4,7,10};
        //int[] A={-10,1,1,3,100};
        //int[] A={-3,0,2,2,5,5,5,8,8,10,10,10,14};
        int count=0;
        boolean prev_noble=false;

        if(A[0]==0)
        {
            prev_noble=true;
        }

        for(int i=1;i<A.length;i++)
        {
            boolean noble=false;

            if(A[i]==i)
            {
                count++;
                noble=true;
            }else
            {
                if(A[i]==A[i-1] && prev_noble==true)
                {
                    count++;
                    noble=true;
                }
            }

            prev_noble=noble;
        }

        System.out.println(count);
    }
}
