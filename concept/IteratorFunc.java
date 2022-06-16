package concept;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorFunc {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<Integer>();

        for(int i=0;i<5;i++)
        {
            set.add(i);
        }

        Iterator it=set.iterator();

        int ans=0;
        while(it.hasNext())
        {
            int x= (int) it.next();
            System.out.println(it.next());

        }
    }
}
