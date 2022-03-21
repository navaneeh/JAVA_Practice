package Academy;

public class SubarrayWithBitwiseOr1 {
    public static void main(String[] args) {
        int[] a={1,2,3,3};
        int ans=0;
        int last=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)last=i+1;
        }
    }
}
