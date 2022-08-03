public class Kata {
    public static boolean solution(String str, String ending) {

        int end = str.length();

        int endLength = ending.length();

        if (endLength > end) {
            return false;
        }

        String cheackStr = str.substring(end-endLength, end);

        if (cheackStr.equals(ending)) {

            return true;
        } else {

            return false;
        }

    }
}