package chap02.new_test;

public class BankAccount {
	private int balance;
	private Person owner;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	// 파라미터 : 입금할 액수(정수)
	// 리턴 : 성공여부(불린)
	public boolean deposit(int amount) {
		// 1. write code here
		if (amount >= 0 && owner.getCashAmount() >= amount) {
			//this.setBalance(getBalance() + amount);
			// this.balance += amount;
			balance += amount;
			owner.setCashAmount(owner.getCashAmount() - amount);
			// owner.cashAmount -= amount;
			System.out.println(
					amount + "원 입금하였습니다. 잔고 : " + this.getBalance() + "원, 현금 : " + owner.getCashAmount() + "원");
			return true;
		} else {
			System.out.println("입금 실패입니다. 잔고 : " + this.getBalance() + "원, 현금 : " + owner.getCashAmount() + "원");
			return false;
		}

	}
	
	/*
	 * public boolean depositWithExchangeRate(double amount, double exchangeRate){
	 * return deposit((int) (amount * exchangeRate)); }
	 */

	public boolean deposit(double amount, double exchangeRate) {
		return deposit((int) (amount * exchangeRate));
	}
	// 파라미터 : 출금할 액수(정수)
	// 리턴 : 성공여부(불린)
	public boolean withdraw(int amount) {
		// 2. write code here
		if (amount >= 0 && this.balance >= amount) {
			this.setBalance(getBalance() - amount);
			// this.balance -= amount;
			// owner.cashAmount += amount;
			owner.setCashAmount(owner.getCashAmount() + amount);

			System.out.println(
					amount + "원 출금하였습니다. 잔고 : " + this.getBalance() + "원, 현금 : " + owner.getCashAmount() + "원");
			return true;
		} else {
			System.out.println("출금 실패입니다. 잔고 : " + this.getBalance() + "원, 현금 : " + owner.getCashAmount() + "원");
			return false;
		}
	}

	// 저번 과제에서의 코드를 포함해주세요!

	// 첫 번째 파라미터: 받는 사람 (Person)
	// 두 번째 파라미터: 이체할 금액 (정수)
	// 리턴 : 성공여부 (불린)
	  // account와 account 간의 거래이므로, Person to의 정보를 to의 account 정보로 바꾸어 호출.
    public boolean transfer(Person to, int amount) {
        return transfer(to.getAccount(), amount);
    }

	public boolean transfer(BankAccount to, int amount) {
	    boolean success;

	    if (amount < 0 || amount > balance) {
	        success = false;
	    } else {
	        // 내 계좌에서 to 계좌로 송금하기
	        // 코드를 작성하세요.
	    	balance -= amount;
	    	to.balance += amount;
	        success = true;
	    }

	    // 결과값 출력
	    System.out.println(success + " - from: " + owner.getName()
	            + ", to: " + to.getOwner().getName()
	            + ", amount: " + amount
	            + ", balance: " + balance);

	    return success;
	}
}