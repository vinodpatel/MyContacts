package Account;

import java.util.ArrayList;

/**
 * Created by Smita on 15-Feb-2015.
 */
public abstract class BankAccount {

    private ArrayList<Double> mTransactions;
    public static final double OVERDRAFT_FEE = 30;

    protected BankAccount() {
        mTransactions = new ArrayList<Double>();
    }

    protected int numberofWithdrawals() {
        int count = 0;
        for (int i = 0; i < mTransactions.size(); i++) {
            if (mTransactions.get(i) < 0) {
                count++;
            }
        }
        return count;
    }

    public void withdraw(double amount) {
        mTransactions.add(-amount);
        if (getBalance() < 0) {
            mTransactions.add(-OVERDRAFT_FEE);
        }
    }

    public void deposit(double amount) {
        mTransactions.add(amount);
    }

    public double getBalance() {
        double total = 0;
        for (int i = 0; i < mTransactions.size(); i++) {
            total += mTransactions.get(i);
        }
        return total;
    }
}
