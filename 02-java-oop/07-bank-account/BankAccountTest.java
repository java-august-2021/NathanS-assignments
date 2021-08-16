public class BankAccountTest {
    public static void main(String[] args) {
		BankAccount myBankAccount = new BankAccount();
		myBankAccount.depositMoney(10, "saving");
		System.out.println(myBankAccount.getAccountTotal()); //output 10
		myBankAccount.depositMoney(100, "saving");
		System.out.println(myBankAccount.getAccountTotal()); //output 110
		System.out.println(BankAccount.getNumberOfAccounts()); // output 1
		System.out.println(BankAccount.getTotalMoney()); //output 110
		myBankAccount.withdrawMoney(10000, "checking"); //output insufficent funds
		myBankAccount.withdrawMoney(60, "saving");
		System.out.println(myBankAccount.getAccountTotal()); //50
		}
}

