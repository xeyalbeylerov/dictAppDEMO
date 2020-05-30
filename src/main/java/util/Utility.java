package util;

import config.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utility {
    public static boolean fillHashMap(byte[] bytes) {
        String fileStr=new String(bytes);
        Scanner sc = new Scanner(fileStr);
        String word0 = null;
        String word1 = null;
        while (sc.hasNext()) {
            String[] result = splitString(sc.next(), ",");
            if (result != null) {
                word0 = result[0];
                word1 = result[1];
                Config.dict.put(word0, word1);
            }else {
                System.out.println("Illegal line");
            }
        }
        return true;
    }

    public static String[] splitString(String data, String splitter) {
        if (data != null && !data.isEmpty() && data.contains(splitter)) {
//            if (data != null && !data.isEmpty()) {
            String[] sData = data.split(splitter);
            if (sData.length != 2) return null;
            if (sData[0] == null) return null;
            if (sData[1] == null) return null;
            return sData;
        }
        return null;
    }

    public static void game() {
        String lang = AskingFromUser.askLang();

        String[] words = getRandomWords(lang);
        boolean isWin=false;
        for(int i=0;i<3;i++) {
            isWin = gameLogic(words);
            if(isWin) break;
            System.out.println("Try again");
        }
        if(!isWin)System.out.println("Correct answer was "+words[1]);


    }
    public static boolean gameLogic(String[] words) {
        String result = AskingFromUser.askWord(words[0]);
        if (result.equalsIgnoreCase(words[1])) {
            System.out.println("Congratulation you win "+words[0]+"="+words[1]);
            return true;
        }else {
            System.out.println("You failed");
            return false;
        }
    }



    public static String[] getRandomWords() {
        int size = Config.dict.size();
        int random = (int) (Math.random() * size + 0);
        List<String>[] lists = hashMaptoList();
        List<String> lang1 = lists[0];
        List<String> lang2 = lists[1];
        String[] result = new String[]{lang1.get(random), lang2.get(random)};
        return result;
    }

    public static String[] getRandomWords(String lang) {
        String[] result=getRandomWords();
        String aze = result[0];
        String eng = result[1];
        if (lang.equalsIgnoreCase("eng")) {
            return new String[]{eng, aze};
        } else if (lang.equalsIgnoreCase("aze")) {
            return new String[]{aze, eng};
        } else {
            return null;
        }
    }


    public static List<String>[] hashMaptoList() {
        List<String> lang1 = new ArrayList<>();
        List<String> lang2 = new ArrayList<>();
        Config.dict.forEach((k, v) -> {
            lang1.add(k);
            lang2.add(v);
        });
        return new List[]{lang1, lang2};
    }


}
