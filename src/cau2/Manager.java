package cau2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Manager {
    Map<String, Integer> map = new LinkedHashMap<>();
    public void add(String input){

        input=input.toLowerCase().trim().replaceAll("\\s+"," ");
        if(input.length()==0){
            System.out.println("Chuỗi không hợp lệ...");
        }else {
            String[] vehical = input.split(",");
            for (int i = 0; i < vehical.length; i++) {
                String key = vehical[i].trim();

                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    map.put(key, map.get(key) + 1);
                }
            }
        }
    }
    public void search(String input){
        if(input.trim().length()==0){
            System.out.println("Chuỗi không hợp lệ...");
        }else{
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            if(entry.getKey().equals(input)){

                System.out.println("Search: "+entry.getKey()+" : "+entry.getValue());

            }
        }
    }
    }

   public void display(){
       for(Map.Entry<String, Integer> entry:map.entrySet()){
           System.out.println(entry.getKey()+" : "+entry.getValue());
       }
   }
}
