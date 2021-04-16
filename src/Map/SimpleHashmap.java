package Map;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashmap {
    public static void main(String[] args) {
        String[] people = {"A","B","C","D","E"};
        HashMap<String, Human> map = addHumansToMap(people);
        for (Map.Entry<String,Human> pair: map.entrySet()) {
            System.out.println(pair.getKey()+" - "+pair.getValue());
        }
    }
    public static HashMap<String, Human> addHumansToMap(String[] p){
        HashMap<String, Human> allHumans = new HashMap<>();
        for (String s : p) {
            allHumans.put(s, new Human(s));
        }
        return allHumans;
    }
}
class Human{
    private String name;
    public Human(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name !=null ? name.toUpperCase():null;
    }
}

