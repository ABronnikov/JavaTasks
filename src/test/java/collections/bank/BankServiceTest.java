package collections.bank;

import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankServiceTest {

    private BankService bankService;
    private boolean isUser;

    @BeforeEach
    void setupThis(){
        bankService = new BankService();
        isUser = bankService.addUser("Aleksey", "3495940");
    }

    @Test
    void addUserTest() {
        Assertions.assertTrue(isUser);
    }

    @Test
    void addAccountTest1() {
        boolean result = bankService.addAccount("3495940", "55");
        Assertions.assertTrue(result);
    }

    @Test
    void addAccountTest2() {
        boolean result = bankService.addAccount("3495941", "55");
        Assertions.assertFalse(result);
    }

    @Test
    void addAccountTest3() {
        bankService.addAccount("3495940", "55");
        boolean result = bankService.addAccount("3495940", "55");
        Assertions.assertTrue(result);
    }

    @Test
    void getBalanceToAccountTest1() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        double result = bankService.getBalanceToAccount("3495940", "55");
        Assertions.assertEquals(5.0, result);
    }

    @Test
    void getBalanceToAccountTest2() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        double result = bankService.getBalanceToAccount("3495940", "56");
        Assertions.assertEquals(-1.0, result);
    }

    @Test
    void getBalanceToAccountTest3() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        double result = bankService.getBalanceToAccount("3495941", "56");
        Assertions.assertEquals(-1.0, result);
    }

    @Test
    void addBalanceToAccountTest1() {
        bankService.addAccount("3495940", "55");
        boolean result = bankService.addBalanceToAccount("3495940", "55", 5.0);
        Assertions.assertTrue(result);
    }

    @Test
    void addBalanceToAccountTest2() {
        bankService.addAccount("3495940", "55");
        boolean result = bankService.addBalanceToAccount("3495940", "57", 5.0);
        Assertions.assertFalse(result);
    }

    @Test
    void addBalanceToAccountTest3() {
        bankService.addAccount("3495940", "55");
        boolean result = bankService.addBalanceToAccount("3495945", "57", 5.0);
        Assertions.assertFalse(result);
    }

    @Test
    void withDrawBalanceFromAccountTest1() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        boolean result = bankService.withDrawBalanceFromAccount("3495940", "55", 4.0);
        Assertions.assertTrue(result);
    }

    @Test
    void withDrawBalanceFromAccountTest2() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        boolean result = bankService.withDrawBalanceFromAccount("3495940", "55", 5.0);
        Assertions.assertTrue(result);
    }

    @Test
    void withDrawBalanceFromAccountTest3() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        boolean result = bankService.withDrawBalanceFromAccount("3495940", "55", 6.0);
        Assertions.assertFalse(result);
    }

    @Test
    void withDrawBalanceFromAccountTest4() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        boolean result = bankService.withDrawBalanceFromAccount("3495940", "57", 6.0);
        Assertions.assertFalse(result);
    }

    @Test
    void withDrawBalanceFromAccountTest5() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        boolean result = bankService.withDrawBalanceFromAccount("3495945", "57", 6.0);
        Assertions.assertFalse(result);
    }

    @Test
    void transferMoneyTest1() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        bankService.addUser("Nikola", "3495950");
        bankService.addAccount("3495950", "555");
        boolean result = bankService.transferMoney("3495940", "55", "3495950", "555",4.0);
        Assertions.assertTrue(result);
    }

    @Test
    void transferMoneyTest2() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        bankService.addUser("Nikola", "3495950");
        bankService.addAccount("3495950", "555");
        boolean result = bankService.transferMoney("3495940", "55", "3495950", "555",5.0);
        Assertions.assertTrue(result);
    }

    @Test
    void transferMoneyTest3() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        bankService.addUser("Nikola", "3495950");
        bankService.addAccount("3495950", "555");
        boolean result = bankService.transferMoney("3495940", "55", "3495950", "555",6.0);
        Assertions.assertFalse(result);
    }

    @Test
    void transferMoneyTest4() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        bankService.addUser("Nikola", "3495950");
        bankService.addAccount("3495950", "555");
        boolean result = bankService.transferMoney("3495940", "55", "3495950", "556",5.0);
        Assertions.assertFalse(result);
    }

    @Test
    void transferMoneyTest5() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        bankService.addUser("Nikola", "3495950");
        bankService.addAccount("3495950", "555");
        boolean result = bankService.transferMoney("3495940", "56", "3495950", "555",4.0);
        Assertions.assertFalse(result);
    }

    @Test
    void transferMoneyTest6() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        bankService.addUser("Nikola", "3495950");
        bankService.addAccount("3495950", "555");
        boolean result = bankService.transferMoney("3495941", "55", "3495950", "555",4.0);
        Assertions.assertFalse(result);
    }

    @Test
    void transferMoneyTest7() {
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        bankService.addUser("Nikola", "3495950");
        bankService.addAccount("3495950", "555");
        boolean result = bankService.transferMoney("3495940", "55", "3495951", "555",4.0);
        Assertions.assertFalse(result);
    }

    @Test
    void deleteAccountByRequisiteTest1() {
        bankService.addAccount("3495940", "55");
        boolean result = bankService.deleteAccountByRequisite("3495940", "55");
        Assertions.assertTrue(result);
    }

    @Test
    void deleteAccountByRequisiteTest2() {
        bankService.addAccount("3495940", "55");
        boolean result = bankService.deleteAccountByRequisite("3495940", "56");
        Assertions.assertFalse(result);
    }

    @Test
    void deleteAccountByRequisiteTest3() {
        bankService.addAccount("3495940", "55");
        boolean result = bankService.deleteAccountByRequisite("3495945", "56");
        Assertions.assertFalse(result);
    }

    @Test
    void findByRequisiteTest1() {
        bankService.addAccount("3495940", "55");
        Account result = bankService.findByRequisite("3495940", "55").get();
        Account expected = new Account("55", 0.0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByRequisiteTest2() {
        bankService.addAccount("3495940", "55");
        Optional<Account> result = bankService.findByRequisite("3495940", "56");
        Optional<Account> expected = Optional.empty();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByRequisiteTest3() {
        bankService.addAccount("3495940", "55");
        Optional<Account> result = bankService.findByRequisite("3495945", "56");
        Optional<Account> expected = Optional.empty();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByPassportTest1() {
        bankService.addAccount("3495940", "55");
        User result = bankService.findByPassport("3495940").get();
        User expected = new User("Aleksey", "3495940");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findByPassportTest2() {
        bankService.addAccount("3495940", "55");
        Optional<User> result = bankService.findByPassport("3495945");
        Optional<User> expected = Optional.empty();
        Assertions.assertEquals(expected, result);
    }
}