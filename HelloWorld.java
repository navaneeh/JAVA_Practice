import java.util.*;

public class HelloWorld {
    static public void main(String[] args) {
     Random r=new Random();
     int low=10;
     int high=100;
     int range=r.nextInt(high-low)+low;
        System.out.println(range);

    }
}
