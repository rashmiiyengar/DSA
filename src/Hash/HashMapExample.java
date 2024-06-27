package Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Hashmap - stores Key, Value 
// key will be unique
// unordered

public class HashMapExample {
    
    public static void main(String[] args) {
        
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 160);
        map.put("italy", 50);

        System.out.println(map);

        map.put("US", 200);

        System.out.println(map);
        
        //Search

        boolean res= map.containsKey("India");
        System.out.println(res);


        System.out.println(map.get("India"));
        System.out.println(map.get("Bhutan")); //null

        //Iterate
        //using entry set
        for(Map.Entry<String,Integer>  e : map.entrySet()){
                System.out.println(e.getKey()+ "----" +e.getValue());
        }

        //through key set
        Set<String> keys= map.keySet();

        for(String key: keys){
                System.out.println(key+ ' ' +map.get(key));
        }

        //Delete    
        map.remove("US");

    }
}
