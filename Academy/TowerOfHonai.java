package Academy;

public class TowerOfHonai {
    public static void main(String[] args) {
        TOH(3,'A','C','B');
    }

    public static void TOH(int n,char source,char dest,char helper)
    {
        if(n==0)return;

        TOH(n-1,source,helper,dest);
        System.out.println(source+" to "+dest);
        TOH(n-1,helper,dest,source);
    }
}
