package collections.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public static void main(String[] args) {
        BankService bankService = new BankService();
        bankService.addUser("Aleksey", "3495940");
        bankService.addUser("Aleksey1", "3495941");
        bankService.addAccount("3495940", "55");
        bankService.addBalanceToAccount("3495940", "55", 5.0);
        bankService.addAccount("3495941", "56");
        bankService.transferMoney("3495940", "55", "3495941", "56", 4.0);

        for (Map.Entry<User, List<Account>> entry : bankService.users.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    /**
     * Метод добавляет пользователя, изначательно у пользователя 0 счетов
     */
    public boolean addUser(String name, String passport) {
        User user = new User(name, passport);
        users.putIfAbsent(user, new ArrayList<>());
        return users.containsKey(user);
    }

    /**
     * Метод добавляет счет пользователю
     */
    public boolean addAccount(String passport, String requisite) {
        if (findByPassport(passport).isPresent() && findByRequisite(passport,
            requisite).isEmpty()) {
            users.computeIfPresent(findByPassport(passport).get(), (k, v) -> {
                Account newAccount = new Account(requisite, 0.0);
                v.add(newAccount);
                return v;
            });
        }
        return findByRequisite(passport, requisite).isPresent();
    }

    /**
     * Метод получает количество денег на счету пользователя
     */
    public Double getBalanceToAccount(String passport, String requisite) {
        if (findByRequisite(passport, requisite).isPresent()) {
            return users.get(findByPassport(passport).get()).stream()
                .filter(x -> x.getRequisite().equals(requisite)).map(v -> v.getBalance())
                .findFirst().get();
        }
        return -1.0;
    }

    /**
     * Метод добавляет деньги на счет пользователя
     */
    public boolean addBalanceToAccount(String passport, String requisite, double expense) {
        Double oldBalance = getBalanceToAccount(passport, requisite);
        if (findByRequisite(passport, requisite).isPresent()) {
            findByRequisite(passport, requisite).get().setBalance(oldBalance + expense);
            return getBalanceToAccount(passport, requisite) == (oldBalance + expense);
        }
        return false;
    }

    /**
     * Метод должен снять деньги с аккаунта пользователя
     */
    public boolean withDrawBalanceFromAccount(String passport, String requisite, double expense) {
        Double oldBalance = getBalanceToAccount(passport, requisite);
        if (findByRequisite(passport, requisite).isPresent() && oldBalance >= expense) {
            findByRequisite(passport, requisite).get().setBalance(oldBalance - expense);
            return getBalanceToAccount(passport, requisite) == (oldBalance - expense);
        }
        return false;
    }

    /**
     * Перевести деньги с счета на счет
     */
    public boolean transferMoney(String passportFrom, String requisiteFrom,
        String passportTo, String requisiteTo, double expense) {
        Double balanceFrom = getBalanceToAccount(passportFrom, requisiteFrom);
        Double balanceTo = getBalanceToAccount(passportTo, requisiteTo);
        if (balanceFrom >= 0.0 && balanceTo >= 0.0 && balanceFrom >= expense) {
            findByRequisite(passportFrom, requisiteFrom).get().setBalance(balanceFrom - expense);
            findByRequisite(passportTo, requisiteTo).get().setBalance(balanceTo + expense);
            return getBalanceToAccount(passportFrom, requisiteFrom) == (balanceFrom - expense)
                && getBalanceToAccount(passportTo, requisiteTo) == (balanceTo + expense);
        }
        return false;
    }


    /**
     * Метод удаляет счет пользователя, если на счету лежат деньги, то их нужно перевести на
     * рандомный любой другой счет пользователя, если же такого счета не существует, то отменить
     * операцию.
     *
     * @param passport  паспорт пользователя
     * @param requisite реквизиты пользователя
     */
    public boolean deleteAccountByRequisite(String passport, String requisite) {
        if (findByRequisite(passport, requisite).isPresent()) {
            return users.get(findByPassport(passport).get())
                .remove(findByRequisite(passport, requisite).get());
        }
        return false;
    }

    /**
     * Метод ищет счет по его реквизитам
     *
     * @param passport  паспорт
     * @param requisite реквизиты
     * @return счет пользователя
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(
            value -> users.get(value).stream().filter(x -> x.getRequisite().equals(requisite))
                .findAny());
    }

    /**
     * Возвращает пользователя по его паспорту
     *
     * @param passport паспорт пользователя
     * @return пользователь
     */
    public Optional<User> findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
