public class Monkey {

    // ?????????? ???????
    public Head head;

    public Monkey() {
        this.head = new Head();
    }

    void say () {
        System.out.println("My voice is " + head.voice);
    }
    class Head {
        String voice = "??????";
    }
}
