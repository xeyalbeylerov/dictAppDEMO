package util;

import static util.InputUtil.inputString;

public class AskingFromUser {
    public static String[] askAzeOrEng() {
        String name = inputString("Sual ingilisce sorushulsun yoxsa Azerbaycan dilinde?:");
        String surname = inputString("Your surname:");
        return new String[]{name,surname};
    }


    public static String askLang() {
        String lang = askLangLogic();
       if(lang!=null&&!lang.isEmpty()&&(lang.equalsIgnoreCase("eng")||lang.equalsIgnoreCase("aze"))){
           return lang;
       }else{
           System.out.println("illegal language.Must be choice aze or eng");
           return askLangLogic();
       }
    }
    public static String askLangLogic() {
        String lang = inputString("Sual ingilisce sorushulsun yoxsa Azerbaycan dilinde?:");
        return lang;
    }


    public static String askServerIpAndPort() {
        String serverIpAndPort = inputString("Please type tcp server and port like localhost:6789");
        return serverIpAndPort;
    }
}
