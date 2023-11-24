package xmut.experiment.ch08;

/**
 * @author 朔风
 * @date 2023-11-24 10:33
 */
public class ManageAccounts {
    public static void main(String[] args) {
        Account acct1, acct2;

        acct1 = new Account(1000, "Sally", 1111);

        // create acct2
        acct2 = new Account(500, "Joe", 2222);

        // deposit 100 to joe
        acct2.deposit(100);

        // print joe new balance
        System.out.println(acct2.getBalance());

        // withdraw 50 from sally
        acct1.withdraw(50);

        // print sally's new balance
        System.out.println(acct1.getBalance());

        // charge fees to both accounts
        acct1.chargeFee();
        acct2.chargeFee();

        // charge the name on joe's account to joseph
        acct2.changeName("Joseph");

        // print summary for both accounts
        System.out.println(acct1);
        System.out.println(acct2);

    }

}
