package Hash;

import java.util.HashMap;

public class Itenary {
    
    //Find itenary from tickets
    //"Chennai" -< "Bengaluru"
    //"Mumbai" -> "Delhi"
    //"Goa" -> "Chennai"
    // Delhi -> "Goa"

    // Asked in Microsoft and Ola

    //Approach 
    //Find out start - the city which exists in from but not in To, in about case its "Mumbai"
    //As we are not reaching to Mumbai from any point.
    //Only one starting point can be there

    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> revMap = new HashMap<>();

        for(String key: tick.keySet()){
            //key -< key  ; val -< tick.get(key)
            revMap.put(tick.get(key), key);
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start=getStart(tickets);
        while(tickets.containsKey(start)){
                System.out.print(start+ " -> ");
                start = tickets.get(start);
        }
        System.out.println(start);

    }   
}
