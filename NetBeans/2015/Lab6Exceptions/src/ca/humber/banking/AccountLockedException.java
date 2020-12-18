package ca.humber.banking;
public class AccountLockedException extends Exception {
   public AccountLockedException(String message) {  
      super(message);
   }
}