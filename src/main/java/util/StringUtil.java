package util;

public class StringUtil {
    public static String[] splitString(String data, String splitter) {
        //check:data does not be empty and must be contains splitter
        if (data != null && !data.isEmpty() && data.contains(splitter)) {
            String[] sData = data.split(splitter);//get splitted words
            if (sData.length != 2) return null;//words must length be two words
            if (sData[0] == null||sData[1] == null) return null;//words doesnt be null
            return sData;
        }
        return null;
    }
}
