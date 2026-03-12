public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("Ivan Ivanov", 1000.0);
        System.out.println("Initial balance: $" + myAccount.currentBalance);

        myAccount.makeDeposit(500.0);
        myAccount.makeWithdrawal(200.0);
        myAccount.makeDeposit(300.0);
        myAccount.makeWithdrawal(1500.0);

        System.out.println("Current balance: $" + myAccount.currentBalance);

        myAccount.findOperationsByType("Deposit");

        myAccount.findOperationsByType("Withdrawal");
    }
}