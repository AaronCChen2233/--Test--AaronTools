package Tools;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/***
 * @author Aaron Chen
 */
public class StringTools {
    /***
     * Example
     * GetCharBy('A', 26);
     * GetCharBy('a', 26);
     * GetCharBy('0', 10);
     * @param startChar
     * @param nextOfChar
     * @return
     */
    public static String GetCharBy(char startChar, int nextOfChar) {
        int startint = (int) startChar;
        String generatedString = "";

        for (int i = startint; i < (startint + nextOfChar); i++) {
            generatedString += (char) i;
        }
        return generatedString;
    }

    public static String GenerateARandomString(String specifyWord, boolean useUpLetter, boolean useLoLetter, boolean useNumber, int length) {
        String generateFrom = "";
        String generatePassword = "";
        if (useUpLetter) {
            generateFrom += GetCharBy('A', 26);
        }

        if (useLoLetter) {
            generateFrom += GetCharBy('a', 26);
        }

        if (useNumber) {
            generateFrom += GetCharBy('0', 10);
        }
        generateFrom += specifyWord;
        if (specifyWord.length() == 0) {
            return "";
        }

        for (int i = 0; i < length - specifyWord.length(); i++) {
            generatePassword += generateFrom.charAt(RandomTools.GetRandomInt(generateFrom.length()));
        }
        generatePassword += specifyWord;
        generatePassword = ShuffleString(generatePassword);
        return generatePassword;
    }

    public static String ShuffleString(String oString) {
        String out = "";
        List<String> shuffleList = Arrays.asList(oString.split(""));
        Collections.shuffle(shuffleList);
        for (String s : shuffleList) {
            out += s;
        }
        return out;
    }
}
