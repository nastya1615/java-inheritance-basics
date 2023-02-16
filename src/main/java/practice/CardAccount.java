package practice;

public class CardAccount extends BankAccount {


    @Override
    public void take(double amountToTake) {
        double amountWithComiss = amountToTake * 0.01 + amountToTake;

        System.out.println("списываемая сумма с комиссией: " + amountWithComiss);
        System.out.println(bankAccount);

        if (bankAccount >= amountWithComiss) {

            System.out.println("сюда зашёл");

            bankAccount -= amountWithComiss;
        }
    }


}
