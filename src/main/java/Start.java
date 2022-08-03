public class Start {

//    // static используется использувания только внутри этого файла(класса)
//    // final - константа
//    static int numberBuilding = 123; // Intenger
//    public int GiorSell = 123; // Intenger
//    final public static float numberConstant = (float) 3.1415926535;
//
//
//    public static void main(String[] args) {
//        System.out.println("Hello world !\n Hello" + numberConstant);
//
//        int num1 = 3;
//        int num2 = 4;
//
//        int result = num1 % num2;
//
//        System.out.println("Result: " + result);
//
//        if (num1 == num2 || num1 <= num2) {
//            System.out.println("Result: " + result);
//        } else {
//            System.out.println("Результат" +
//                    ": " + result);
//        }
//
//        int[] nums = {1, 3, 4, 5, 7, 9, 12};
//
//        int ars [] = {1, 3, 4, 5, 7, 9, 12};
//
//        int[] self = new int[3];
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Number " + i + " " + nums[i]);
//        }
//
//        for (int i = 0; i < 4; i++) {
//            nums[i] = i;
//        }
//        //ars === nums
//        System.out.println(ars);
//        System.out.println(nums);
////      System.out.println(nums[3]);
////      Вариант foreache
//        for (int e : ars) {
//            System.out.println(e);
//        }
//
//        int table[][] = new int[3][7];
//
//        table[0] = new int[4];
//        table[1] = new int[43];
//        table[2] = new int[40];
//
//        System.out.println(table[0][1]);
//
//
//
//    }
//
//

//    public static void main (String[] args) {
//        Boy boy = new Boy ();
//        boy.play();
//
//        Girl girl = new Girl();
//        girl.play();
//
//        Player unit = girl;
//
//
//    }

    public static void main(String[] args) {
        Person gi = new Person();

        gi.say();

        Monkey ner = new Monkey();
        ner.say();
    }
}
