public class Brackets {

    private static String message_incorrect_bracket = "I found incorrect bracket";

    public static void contains_incorrect_brackets(char[] charArray) {

        if (!charArrayCorrect(charArray, '(', ')')) {
            return;
        }

        if (!charArrayCorrect(charArray, '{', '}')) {
            return;
        }

        if (!charArrayCorrect(charArray, '[', ']')) {
            return;
        }

    }

    public static boolean charArrayCorrect(char[] charArray, char o, char c) {

        int bracket = 0;

        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == o) {
                bracket++;
            } else if (charArray[i] == c) {
                bracket--;
                if (bracket < 0) {
                    break;
                }
            }
        }

        if (bracket != 0) {
            System.out.println(message_incorrect_bracket);
            return false;
        }

        return true;
    }
}
