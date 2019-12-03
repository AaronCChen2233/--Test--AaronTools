package Tools;

import java.util.Scanner;

/***
 * @author Aaron Chen
 */
public class AskQuestion {
    static Scanner input = new Scanner(System.in);

    /***
     * ask yes no question
     * @param askMessage
     * @param trueString
     * @param falseString
     * @return
     */
    public static boolean AskYesNoQuestion(String askMessage, String trueString, String falseString) {
        String answer;
        boolean yesOrNo = false;
        while (true) {
            System.out.println(askMessage);
            answer = input.nextLine();
            if (answer.toLowerCase().equals(trueString.toLowerCase()) || answer.toLowerCase().equals(falseString.toLowerCase())) {
                yesOrNo = answer.toLowerCase().equals(trueString.toLowerCase());
                break;
            } else {
                Alog.logWarning(String.format("Please type '%1$s' or '%2$s'", trueString, falseString));
            }
        }
        return yesOrNo;
    }

    /***
     * ask number question
     * @param askMessage
     * @return
     */
    public static int AskNumberQuestion(String askMessage) {
        int answer;
        while (true) {
            System.out.println(askMessage);
            if (input.hasNextInt()) {
                answer = input.nextInt();
                break;
            } else {
                Alog.logWarning("Please type a number");
                input.next();
            }
        }
        return answer;
    }

    /***
     * ask string question
     * @param askMessage
     * @return
     */
    public static String AskStringQuestion(String askMessage) {
        String answer;
        System.out.println(askMessage);
        answer = input.nextLine();

        return answer;
    }
}
