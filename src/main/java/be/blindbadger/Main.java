package be.blindbadger;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(new BigDecimal(1000));
        account.setCustomerName("Eddy");
        account.setId(637246421255L);


        AccountService service = new AccountService();
        service.getBalance(account);

    }
}
