public class Cat extends Animal{

    public Cat(String say, int teeth) {
        setSay(say);
        setTeeth(teeth);
    }

    void mu () {
        System.out.println(getSay() + " во все " + getTeeth() + " зуба");
    }

}
