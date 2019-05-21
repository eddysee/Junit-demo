package be.blindbadger;

import org.junit.*;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AccountServiceTest {
    @Test
    public void viewBalance() {
        Account account = new Account();
        account.setBalance(new BigDecimal(1000));

        AccountService accountService = new AccountService();
        String result = accountService.getBalance(account);

        accountService.addtoBalance(account, new BigDecimal(1000));

        assertEquals(account.getBalance(),new BigDecimal(2000));



    }

    @Test
    public void change_balance_to_deposit() {
        Account account = new Account();
        account.setBalance(new BigDecimal(1000));

        AccountService accountService = new AccountService();
        String result = accountService.getBalance(account);

        accountService.addtoBalance(account, new BigDecimal(1000));

        assertEquals(account.getBalance(),new BigDecimal(2000));
    }
    private Account account;
    private AccountService accountService;
    @Before

    public void init() {
        System.out.println("Before Method");
        account = new Account();
        account.setBalance(new BigDecimal(1000));
        accountService = new AccountService();

    }
    @After

    public void tearDown() {
        System.out.println("After method");
    }
    @BeforeClass
    public static void beforeTheClass(){
        System.out.println("BEFORE CLASS");
    }
    @AfterClass
    public static void init2(){
        System.out.println("AFTER CLASS");
    }

    @Test(expected = BalanceInsufficientException.class)
    public void subtractBalance_Insufficeint() throws BalanceInsufficientException {
        accountService.subtractfromBalance(account, new BigDecimal("2000"));

    }
}