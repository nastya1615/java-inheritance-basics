package practice;

public class BankAccount {


  protected double bankAccount;

  public double getAmount() {

    // верните значение количества денег не счету
    return bankAccount;
  }

  public void put(double amountToPut) {

    if(amountToPut > 0){

      bankAccount += amountToPut;

    }
    //TODO: реализуйте метод и удалите todo
    // метод зачисляет деньги на счет
  }

  public void take(double amountToTake) {

    if (amountToTake <= bankAccount){

      bankAccount -= amountToTake;
    }
    //TODO: реализуйте метод и удалите todo
    // метод списывает деньги со счета
  }
}
