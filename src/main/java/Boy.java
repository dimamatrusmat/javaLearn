public class Boy implements Player, Study {

    public void play() {
        System.out.println("Play hand");
    }

    @Override
    public void read() {
        System.out.println("Read gand");
    }
}
