public class Gatra {
    public static String createPhoneNumber(int[] numbers) {

        String sthree = "";
        String mthree = "";
        String ffour = "";


        int length = numbers.length;

        int i = 0;

        while (true) {

            if (i < 3) {
                sthree = sthree + numbers[i];
            } else if (i < 6) {
                if (i == 5) {
                    mthree = mthree + numbers[i];
                } else {
                    mthree = mthree + numbers[i];
                }
            } else if (i <= 10) {
                ffour = ffour + numbers[i];
            }

            System.out.println(i);

            i++;

            if (length == i) {
                break;
            }
        }

        String ans = "(" + sthree + ") " + mthree + "-" + ffour;
        return ans;
    }
}