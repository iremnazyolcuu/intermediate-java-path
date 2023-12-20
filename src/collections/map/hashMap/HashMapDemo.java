package collections.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        // HashMap<String, String> capitalCities = new HashMap<>();
        Map<String, String> capitalCities = new HashMap<>();

        // put(Key, Value)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // get(Object key): returns the object corresponding to the key
        System.out.println(capitalCities.get("Norway"));

        // remove (Object key): deletes the value corresponding to a certain key
        capitalCities.remove("England");
        System.out.println(capitalCities.get("England"));

        // clear(): deletes all the values found in the map
        // capitalCities.clear();

        // size
        System.out.println(capitalCities.size());

        // get all keys
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }

        // get all values
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

        // get all keys and values
        for (Map.Entry<String, String> kv : capitalCities.entrySet()) {
            System.out.print(kv.getKey() + ": ");
            System.out.println(kv.getValue());
        }
    }
}
