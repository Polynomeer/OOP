package chap01.coffee;

public class Barista {

    private final static int MAX_COFFEE = 20;
    private int coffee = MAX_COFFEE;

    public boolean makeCoffee(int numOfCoffee) {
        if (coffee > 0) {
            coffee -= numOfCoffee;
            return true;
        }
        return false;
    }
}
