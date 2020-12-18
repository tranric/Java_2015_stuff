package ca.humber.banking;
public class BankAccount {
    double depositAmount = 0, withdrawAmount = 0;
    boolean lock=false;
    public void deposit(double newDeposit) throws AccountLockedException{
        if (lock==false){
            depositAmount += newDeposit;
        }else{
            throw (new AccountLockedException("THE ACCOUNT IS LOCKED"));
        }
    }
    public void withdraw(double newWithdraw) throws AccountLockedException, InsufficientFundsException{
        if (lock==false){
            if (withdrawAmount>newWithdraw){
                withdrawAmount -= newWithdraw;
            }else{
                throw (new InsufficientFundsException("YOU HAVE INSUFFICIENT FUNDS."));
            }
        }else{
            throw (new AccountLockedException("THE ACCOUNT IS LOCKED"));
        }
    }
}