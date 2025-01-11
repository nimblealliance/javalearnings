public class Dog extends Animal{

    boolean goodboi;

    public Dog(String name, int age, boolean goodboi) {
        super(name, age);
        this.goodboi = goodboi;
    }

    public boolean isGoodboi() {
        return goodboi;
    }

    public void setGoodboi(boolean goodboi) {
        this.goodboi = goodboi;
    }
}
