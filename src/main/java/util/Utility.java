package util;

import config.Config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Utility {
    public static boolean fillHashMap(byte[] bytes) {
        Scanner sc = new Scanner(bytes.toString());
        String word0 = null;
        String word1 = null;
        while (sc.hasNext()) {
            String[] result = splitString(sc.next(), ",");
            if (result != null) {
                word0 = result[0];
                word1 = result[1];
                Config.dict.put(word0, word1);
            }
            System.out.println("Illegal line");
        }
        return true;
    }

    public static String[] splitString(String data, String splitter) {
        if (data != null && !data.isEmpty() && data.contains(splitter)) {
            String[] sData = data.split(splitter);
            if (sData.length != 2) return null;
            if (sData[0] == null) return null;
            if (sData[1] == null) return null;
            return sData;
        }
        return null;
    }
    public static void game(){
        String lang = AskingFromUser.askLang();

    }
    public static String[] getRandomWords(){

        int size=Config.dict.size();
        int random = (int)(Math.random() * size + 0);
        String value=Config.dict.get(random);
        Config.dict.




    }


}
