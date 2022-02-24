package Academy;

public class AmstrongNumber {
    public static void main(String[] args) {
        System.out.println(ArmstrongValueGet(153));
    }

    public static long ArmstrongValueGet(long n)
    {
        long value=0;
        long cube_value=0;
        while(n>0)
        {
            cube_value=n%10;
            cube_value=cube_value*cube_value*cube_value;
            value+=cube_value;
            n/=10;
        }
        return value;
    }
}
