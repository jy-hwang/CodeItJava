package chap02.practice;

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
			this.setBalance(getBalance() + amount);
			// this.balance += amount;
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
	public boolean transfer(Person to, int amount) {
		// insert code here
		if (amount >= 0 && this.getBalance() > amount) {
			this.setBalance(this.getBalance() - amount);
			
			System.out.println("11true - from: [" + this.owner.getName() + "], to: [" + to.getName() + "], amount: ["
					+ amount + "], balance: [" + this.getBalance() + "]");
			return true;
		} else {
			System.out.println("22false - from: [" + this.owner.getName() + "], to: [" + to.getName() + "], amount: ["
					+ amount + "], balance: [" + this.getBalance() + "]");
			return false;
		}
	}

	// 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
	// 두 번째 파라미터: 이체할 금액 (정수)
	// 리턴 : 성공여부 (불린)
	public boolean transfer(BankAccount to, int amount) {
		// insert code here
		if (amount >= 0  && this.getBalance() > amount) {
			to.setBalance((to.getBalance() + amount));

			System.out.println("33true - from: [" + this.owner.getName() + "], to: [" + to.owner.getName()
					+ "], amount: [" + amount + "], balance: [" + this.getBalance() + "]");
			return true;
		} else {
			System.out.println("44false - from: [" + this.owner.getName() + "], to: [" + to.owner.getName()
					+ "], amount: [" + amount + "], balance: [" + this.getBalance() + "]");
			return false;
		}
	}
}