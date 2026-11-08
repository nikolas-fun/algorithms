package strings;

import java.util.HashMap;
import java.util.Map;

public class Task3_CharFrequency {
    /*Посчитать, сколько раз каждый символ встречается в строке.
            Пример: "hello" → h:1, e:1, l:2, o:1.*/
    public static Map<Character, Integer> countChars(String text) {
        Map<Character, Integer> map = new HashMap<>();
       /* for (int i = 0; i < text.length(); i++) {
        map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
        }*/
        for(char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

            }
