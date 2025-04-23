package workout.day_20250423.심화.sec06;

public class Account {

  private long balance;

  public Account() {
  }

  public long getBalance() {
    return balance;
  }

  public void deposit(int money) {
    balance += money;
    System.out.println("잔액 : " + balance);
  }

  public void withdraw(int money) throws InsufficientException {
    if(money < balance) {
      balance -= money;
      System.out.println("잔액 : " + balance);
    }else{
      throw new InsufficientException("잔액 부족");
    }
  }

}
