package util;

import config.Config;
import java.util.List;
import static util.MapUtil.*;

public class RandomWordUtil {



//method only return random words like aze,eng
    public static String[] getRandomWords() {
        int size = Config.dict.size();//get hashmap size
        int random = (int) (Math.random() * size + 0);//get random number between zero and hashmap size
        List<String>[] lists = hashMaptoList2();//convert hashmap to list array
        List<String> lang1 = lists[0];//get first list.Like aze words
        List<String> lang2 = lists[1];//get second list.Like eng words
        String[] result = new String[]{lang1.get(random), lang2.get(random)};//get words by random index and return
        return result;
    }
//method take lang and return random words.
// Ex:take eng then return eng-aze, take aze then return aze-eng
    public static String[] getRandomWords(String lang) {
        String[] result = getRandomWords();//get words
        String aze = result[0];
        String eng = result[1];

        //change words index
        if (lang.equalsIgnoreCase("eng")) {
            return new String[]{eng, aze};
        } else if (lang.equalsIgnoreCase("aze")) {
            return new String[]{aze, eng};
        } else {
            return null;
        }
    }
}
