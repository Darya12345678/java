import java.util.*;
public class Homework5 {
    public static void main(String[] args) {
        Map<String, Integer> db = new HashMap<>();
        db.put("Иванов Иван", 2);
        db.put("Иванов Иван", 3);
        
        System.out.println(db);
        for(var item : db.entrySet()){
            System.out.printf("%s %d\n", item.getKey(), item.getValue());
        }
        for (var s : db.entrySet()) {
            int count = db.containsKey(s) ? db.get(s) + 1 : 1;
            db.put(s, count);
        }
       
    }
}





