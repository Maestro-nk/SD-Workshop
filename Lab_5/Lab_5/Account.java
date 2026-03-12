public class Account {
    String ownerName;
    double currentBalance;

    Operation[] history = new Operation[10];
    int operationCount = 0;

    public Account(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.currentBalance = initialBalance;
    }

    public void makeDeposit(double amount) {
        currentBalance += amount;
        history[operationCount] = new Operation("Deposit", amount);
        operationCount++;
    }

    public void makeWithdrawal(double amount) {
        if (currentBalance >= amount) {
            currentBalance -= amount;
            history[operationCount] = new Operation("Withdrawal", amount);
            operationCount++;
        } else {
            System.out.println("Error: Insufficient funds!");
        }
    }

    public void findOperationsByType(String targetType) {
        System.out.println("\n--- Search results for: " + targetType + " ---");
        boolean found = false;
        for (int i = 0; i < operationCount; i++) {
            if (history[i].type.equals(targetType)) {
                System.out.println("Found " + targetType + ": $" + history[i].amount);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No operations found.");
        }
    }

    public class Operation {
        String type;
        double amount;

        public Operation(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }
    }
}