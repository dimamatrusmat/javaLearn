public class Tests {

    public static void main(String[] args) {
        int i = 1632;
        String f = Integer.toBinaryString(i);

        int int1 = f.length();

        int ans = 0;
        while (true) {

            if (int1 == f.length()) {
                if (f.substring(int1).equals("1")) {

                    ans += 1;
                }
            } else {
                if (f.substring(int1, int1+1).equals("1")) {

                    ans += 1;
                }
            }


            if (int1 == 0) {
                break;
            } else {
                int1--;
            }
        }
        System.out.println(f);
        System.out.println(ans);

    }
}
