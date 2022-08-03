public class Cat extends Animal{

    public Cat(String say, int teeth) {
        setSay(say);
        setTeeth(teeth);
    }

    public String getSay() {
        String say = super.getSay();
        return say + " New !";
    }
    void mu () {
        System.out.println(getSay() + " во все " + getTeeth() + " зуба");
    }

}
