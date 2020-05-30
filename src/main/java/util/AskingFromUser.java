package util;

import static util.InputUtil.inputString;

public class AskingFromUser {

    public static String askLang() {
        String lang = askLangLogic();//get typed lang
        //check lang must be aze or eng/
        if (lang != null && !lang.isEmpty() && (lang.equalsIgnoreCase("eng") || lang.equalsIgnoreCase("aze"))) {
            return lang;
        } else {
            //else ask again
            System.out.println("illegal language.Must be choice aze or eng");
            return askLang();
        }
    }

    private static String askLangLogic() {
        return inputString("Please type aze or eng?");//Just ask and return typed word
    }

    public static String askWord(String word) {
        return inputString("What is the meaning of " + word);//Just ask and return typed word
    }
}
