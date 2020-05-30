package util;

import config.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static util.StringUtil.splitString;

public class MapUtil {
    //take bytes and convert putting hashmap
    public static boolean fillHashMap(byte[] bytes) {
        Scanner sc = new Scanner(new String(bytes));//convert bytes to string create scanner
        String word0;
        String word1;

        while (sc.hasNext()) {
            String[] result = splitString(sc.next(), Config.splitter);//split the line and return two word
            if (result != null) {
                word0 = result[0];
                word1 = result[1];
                Config.dict.put(word0, word1);//push words to hashmap
            } else {
                System.out.println("Illegal line");
            }
        }
        return true;//if reading operation finished then return true
    }
    //take hashmap and return list array
    public static List<String>[] hashMaptoList2() {
        List<String> lang1 = new ArrayList<>(Config.dict.keySet());
        List<String> lang2 = new ArrayList<>(Config.dict.values());
        return new List[]{lang1, lang2};
    }
}
