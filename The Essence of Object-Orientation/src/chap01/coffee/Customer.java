package chap01.coffee;

import java.util.Scanner;

public class Customer {

    private int money = 0;

    public void orderCoffee() {
        Scanner sc = new Scanner(System.in);
        Cashier cashier = new Cashier();

        System.out.print("How much do you have? ");
        money = sc.nextInt();
        System.out.print("How many coffee do you want to order? ");
        int numOfCoffee = sc.nextInt();

        boolean isSuccess = cashier.getCoffee(this.money, numOfCoffee);
        if (isSuccess) System.out.println("Success to order coffee!!!");

        sc.close();
    }
}
