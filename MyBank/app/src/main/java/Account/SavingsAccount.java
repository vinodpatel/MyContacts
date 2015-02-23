package Account;

import Account.BankAccount;

/**
 * Created by Smita on 16-Feb-2015.
 */
public class SavingsAccount extends BankAccount {
    private static final String TAG = "SavingsAccount";

    @Override
    public void withdraw(double amount) {
        if(numberofWithdrawals() >= 3) {
            return;
        }
        super.withdraw(amount);
    }
}
