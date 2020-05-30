package main;


import config.Config;

import static file.FileReader.readFromFileAsBytesAndCheck;
import static util.Game.game;
import static util.MapUtil.fillHashMap;
public class MainProcess {
    public static void appStarter() {//app starter is the main method of app
        byte[] file = readFromFileAsBytesAndCheck(Config.filename);//reading bytes from file and fill byte array
        boolean ready = fillHashMap(file);//file bytes filling to hashmap
        if (ready == true) {//if hasmap filling finished then start app automatically
            while (true)//app always running
                game();
        }
    }
}
