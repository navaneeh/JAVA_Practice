package concept;

import java.util.HashMap;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashMap<Integer,String> data=new HashMap<Integer,String>();

        data.put(1,"Testing2");
        data.put(2,"Testing1");
       // data.remove(1,2);
        Iterator<Integer> it=data.keySet().iterator();

        System.out.println(it.next());
        System.out.println(it.next());
        if(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
