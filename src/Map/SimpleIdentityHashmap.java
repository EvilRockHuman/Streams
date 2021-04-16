package Map;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleIdentityHashmap {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> integerStringIdentityHashMap = new IdentityHashMap<>();
        integerStringIdentityHashMap.put(new Integer(1),"one");
        integerStringIdentityHashMap.put(new Integer(11),"two");
        integerStringIdentityHashMap.put(new Integer(23),"three");
        integerStringIdentityHashMap.put(new Integer(1),"one");
        integerStringIdentityHashMap.put(new Integer(23),"five");
        Set set = integerStringIdentityHashMap.entrySet();
        for (Object o : set){
            Map.Entry<Integer, String> map = (Map.Entry<Integer, String>)o;
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
