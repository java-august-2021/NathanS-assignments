import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    public static ArrayList<Integer>getTenRolls() {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        Random r = new Random();

        for (int i = 1; i <= 10; i++) {
            newArr.add(r.nextInt(20) + 1);
        }
        return newArr;
    }
    public static String getRandomLetter() {
        Random rand = new Random();
        
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i));
        }
        return alphabet[rand.nextInt(26)];
    }
    public static String generatePassword() {

        String password = "";

        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }
    public static ArrayList<String> getNewPasswordSet(int length) {

        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;

    }
}
