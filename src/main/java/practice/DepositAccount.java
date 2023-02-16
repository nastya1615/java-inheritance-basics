package practice;

import java.time.LocalDate;
import java.time.Period;

public class DepositAccount extends BankAccount {

    LocalDate lastIncome;


    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();

    }

    @Override
    public void take(double amountToTake) {
        LocalDate today = LocalDate.now();

        Period period = Period.between(lastIncome, today);


        System.out.println(period.getYears() >= 1);

        if ((period.getYears() == 0 & period.getMonths() >= 1) | (period.getYears() >= 1)) {

            super.take(amountToTake);
        }


    }
}
