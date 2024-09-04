package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        System.out.println("Paul's Balance: " + paulsCard);

        PaymentCard mattsCard = new PaymentCard(30);
        System.out.println("Matt's Balance: " + mattsCard);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul's Balance: " + paulsCard);
        System.out.println("Matt's Balance: " + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println("Paul's Balance: " + paulsCard);
        System.out.println("Matt's Balance: " + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);

        System.out.println("Paul's Balance: " + paulsCard);
        System.out.println("Matt's Balance: " + mattsCard);


    }
}