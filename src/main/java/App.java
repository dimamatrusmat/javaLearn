import com.sun.source.tree.WhileLoopTree;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

//        char ch, answer = 'B';
//
//        System.out.println("What letter do I made a wish?");
//        System.out.print(" You try to made a wish: ");
//
//        ch = (char) System.in.read();
//
//
//        if (ch == answer) {
//            System.out.println("You guessed right");
//        } else if ( ch > answer){
//            System.out.println("You must");
//        } else {
//            System.out.println("You must less");
//        }


//        int month = (int) System.in.read();

//        int month = 3;
//
//        String monthString;
//
//        switch (month) {
//            case 1: monthString = "January";
//                break;
//            case 2: monthString = "February";
//                break;
//            case 3: monthString = "March";
//                break;
//            case 4: monthString = "April";
//                break;
//            case 5: monthString = "May";
//                break;
//            case 6: monthString = "Jun";
//                break;
//            case 7: monthString = "July";
//                break;
//            case 8: monthString = "August";
//                break;
//            case 9: monthString = "September";
//                break;
//            case 10: monthString = "October";
//                break;
//            case 11: monthString = "November";
//                break;
//            case 12: monthString = "December";
//                break;
//            default: monthString = "No so month";
//                break;
//        }
//
//        System.out.println(monthString);

//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; (char) System.in.read() != 'S'; i++){
//            System.out.println(i);
//        }
/////////////////////////////
//        char ch, answer = 'B';
//
//        System.out.println("What letter do I made a wish?");
//        System.out.print(" You try to made a wish: ");
//
//        while (true) {
//
//            ch = (char) System.in.read();
//
//            if (ch == answer) {
//                System.out.println("You guessed right");
//                break;
//            } else if (ch > answer) {
//                System.out.println("You must");
//                continue;
//            } else {
//                System.out.println("You must less");
//                continue;
//            }
//        }
//////////////////
//        String str1 = new String("Hello Word! ");
//
//        String str2 = "Fiepa";
//        String str4 = str2.substring(0, 3); // Обрезать с 0 до 3 букву
//        String str3 = str1 + str4;
//
//        int num1 = str2.length();
//
//        System.out.println(str1.equalsIgnoreCase(str2)); // эквивалетно

        Cat barsic = new Cat("Myyy", 33);

        barsic.mu();

        System.out.println(barsic.getSay());



    }
}
