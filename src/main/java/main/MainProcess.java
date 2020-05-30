package main;


import config.Config;
import util.AskingFromUser;

import static file.FileReader.readFromFileAsBytesAndCheck;
import static util.Utility.fillHashMap;

public class MainProcess {
    public static void appStarter() {
        byte[] file = readFromFileAsBytesAndCheck(Config.filename);
        boolean ready = fillHashMap(file);
        if (ready == true) {

            String lang = AskingFromUser.askLang();
        }
    }
}
