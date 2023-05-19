import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        for (Day moment : Day.values()) {
//            System.out.println("We are at " + moment.name().toLowerCase() + " and it's " + moment.getHour() + " o'clock" + " " + moment.getMessage());
//        }
//
//        Apple apple = new Apple();
//        apple.miam();
//        apple.taste();
//        PineApple pineApple = new PineApple();
//        pineApple.miam();
//        if (!(apple instanceof PeelFruit)) {
//            System.out.println("Apple is not a PeelFruit");
//        }
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("World");
//        list.add("!");
//
//        System.out.println(list);
//        if (list.contains("Hello")) {
//            System.out.println("Hello is in the list");
//        }
//        list.remove(2);
//        System.out.println(list);

        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Jane", 30);
        ages.put("Jack", 20);
        System.out.println(ages);
        System.out.println(ages.get("Jane"));
        ages.remove("Jane");
        System.out.println(ages);
        for(Entry<String, Integer> string : ages.entrySet()) {
            System.out.println(string.getKey() + " " + string.getValue());
        }

    }
}