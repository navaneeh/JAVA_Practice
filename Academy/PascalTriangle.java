package Academy;

public class PascalTriangle {

    public static void main(String[] args) {
        int A=5;
        int B=2;
        int C=13;

        int A_limit=A+1;
        int B_limit=B+1;

        int[][] arr=new int[A_limit][B_limit];

        for(int i=0;i<A_limit;i++)
        {
            arr[i][0]=1;
        }

        for(int j=0;j<B_limit;j++)
        {
            arr[j][j]=1;
        }


        for(int k=1;k<A_limit;k++)
        {
            arr[k][1]=k;
        }
        //arr[3][2]=1;
        for(int m=3;m<A_limit;m++)
        {
            for(int l=2;l<B_limit;l++)
            {
                System.out.println(m+":"+l);
                arr[m][l]=(arr[m-1][l-1]%C+arr[m-1][l]%C)%C;
            }
        }
        System.out.println(arr[A][B]);
    }
}
