import java.util.ArrayList;
import java.util.Random;

public class PuzzleJavaTest {
    public static void main (String[] args) {
        System.out.println(PuzzleJava.getTenRolls());
        System.out.println(PuzzleJava.getRandomLetter());
        System.out.println(PuzzleJava.generatePassword());
        ArrayList<String> newPassowrd = PuzzleJava.getNewPasswordSet(13);
        System.out.println(newPassowrd);
    }
}