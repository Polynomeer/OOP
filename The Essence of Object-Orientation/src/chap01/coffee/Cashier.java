package chap01.coffee;

public class Cashier {

    private static final int COFFEE_PRICE = 2000;

    public boolean getCoffee(int money, int numOfCoffee) {
        Barista barista = new Barista();
        int price = numOfCoffee * COFFEE_PRICE;

        if (money < price) {
            System.out.println("Sorry, you don't have enough money to order..");
            return false;
        }

        boolean isRemain = barista.makeCoffee(numOfCoffee);
        return isRemain;
    }
}
