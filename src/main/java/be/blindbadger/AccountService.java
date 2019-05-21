package be.blindbadger;

import java.math.BigDecimal;

public class AccountService {

    public String getBalance(Account account){
        System.out.println(account.getBalance());
        return account.getBalance().toString();
    }
    public void addtoBalance(Account account, BigDecimal value){

        account.setBalance(account.getBalance().add(value));
    }

    public void subtractfromBalance(Account account, BigDecimal value) throws BalanceInsufficientException {
        if(account.getBalance().doubleValue()<value.doubleValue()){
            throw new BalanceInsufficientException("YOU BROKE");
        }

    }
    public void transfer(Account source, Account targer, BigDecimal amount){
        source.setBalance(source.getBalance().subtract(amount));
        targer.setBalance(targer.getBalance().add(amount));
    }

}
