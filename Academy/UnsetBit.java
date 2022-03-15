package Academy;

public class UnsetBit {
    public static void main(String[] args) {
        int B=5;
        long A=53;
        long i=0;
        System.out.println(52 & 4);
        //System.exit(0);
        while(i<B)
        {
            System.out.println("A:"+A+",shift:"+(1<<i) +"ANs"+(A & (1<<i)));
            if((A & (1<<i) )>0)
            {

                A=A^(1<<i);
            }
            System.out.println(A);
            i++;
        }
        System.out.println(A);
    }
}
