import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Map<Float, Map<Float, Integer>> nestedmap = new HashMap<>();
        nestedmap.put(.0F, new HashMap(){{put(.0F,7);}});
        nestedmap.put(.0F, new HashMap(){{put(.1f,8);}});
        nestedmap.put(.1F, new HashMap(){{put(.1F,1);}});
        nestedmap.get(.0F).get(.0F);
        System.out.println(nestedmap.get(.0F).get(.0F));
        nestedmap.put(.0F).get(.0F)
        System.out.println(nestedmap.get(.0F).get(.1F));
    }
}
