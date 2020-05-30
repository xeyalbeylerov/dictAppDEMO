package util;

import static util.RandomWordUtil.getRandomWords;

public class Game {
    public static void game() {
        String lang = AskingFromUser.askLang();//Asking from user for which lang/eng or aze
        String[] words = getRandomWords(lang);//getrandomwords return two words by lang
        boolean isWin;
        for (int i = 0; i < 3; i++) {//question asked to user three times
            isWin = gameLogic(words);//game logic ask question and return true or false
            if (isWin) break;//if user win cycle has been ended
            if (i < 2) {
                System.out.println("Try again");//if user can not win then print this two times
            } else {
                System.out.println("Correct answer was " + words[1]);//on three times print correct answer
            }
        }
    }

    private static boolean gameLogic(String[] words) {
        String result = AskingFromUser.askWord(words[0]);//Ask from user for words[0](words[0] can changed eng or aze)
        if (result.equalsIgnoreCase(words[1])) {//if typed word equals words[1]
            System.out.println("Congratulation you win " + words[0] + "=" + words[1]);//then print congratualations
            return true;
        } else {
            System.out.println("You failed");
            return false;
        }
    }
}
