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

    /***
     * get random string
     * @param specifyWord
     * @param useUpLetter
     * @param useLoLetter
     * @param useNumber
     * @param length
     * @return
     */
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
            generatePassword += generateFrom.charAt(RandomTools.getRandomIntbetween(0, generateFrom.length()));
        }
        generatePassword += specifyWord;
        generatePassword = ShuffleString(generatePassword);
        return generatePassword;
    }

    /***
     * this function will shuffle string
     * @param oString
     * @return
     */
    public static String ShuffleString(String oString) {
        String out = "";
        List<String> shuffleList = Arrays.asList(oString.split(""));
        Collections.shuffle(shuffleList);
        for (String s : shuffleList) {
            out += s;
        }
        return out;
    }

    /***
     * this function will check string is camel case
     * @param checkedString
     * @return
     */
    public static boolean checkIsCamelCase(String checkedString){
        String camelCasePattern = "([a-z]+[A-Z]+\\w+)+";
        return checkedString.matches(camelCasePattern);
    }

    /***
     * this function will check string is studlyCaps
     * @param checkedString
     * @return
     */
    public static boolean checkIsStudlyCaps(String checkedString){
        String camelCasePattern = "([A-Z]+[a-z]+[A-Z]+\\w+)+";
        return checkedString.matches(camelCasePattern);
    }
}
