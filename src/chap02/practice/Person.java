package chap02.practice;

public class Person {
	private String name;
	private int age;
	private int cashAmount;
	private BankAccount account;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	// 첫 번째 파라미터: 받는 사람 (Person)
	// 두 번째 파라미터: 이체할 금액 (정수)
	// 리턴 : 성공여부 (불린)
	public boolean transfer(Person to, int amount) {
		// insert code here
		if (amount >= 0 && this.account.getBalance() > amount) {
			this.account.setBalance(this.account.getBalance() + amount);

			System.out.println("55true - from: [" + this.getName() + "], to: [" + to.getName() + "], amount: [" + amount
					+ "], balance: [" + this.account.getBalance() + "]");
			return true;
		} else {
			System.out.println("66false - from: [" + this.getName() + "], to: [" + to.getName() + "], amount: [" + amount
					+ "], balance: [" + this.account.getBalance() + "]");
			return false;
		}
	}

	// 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
	// 두 번째 파라미터: 이체할 금액 (정수)
	// 리턴 : 성공여부 (불린)
	public boolean transfer(BankAccount to, int amount) {
		// insert code here
		if (amount >= 0 && this.account.getBalance() > amount) {
			this.account.setBalance(this.account.getBalance() + amount);

			System.out.println("77true - from: [" + this.getName() + "], to: [" + to.getOwner().getName()
					+ "], amount: [" + amount + "], balance: [" + this.account.getBalance() + "]");
			return true;
		} else {
			System.out.println("88false - from: [" + this.getName() + "], to: [" + to.getOwner().getName()
					+ "], amount: [" + amount + "], balance: [" + this.account.getBalance() + "]");
			return false;
		}
	}

}
