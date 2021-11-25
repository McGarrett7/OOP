package Week4;

import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

    /**
     * a.
     * @param amount double.
     */
    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            Transaction newDeposit = new Transaction("Nap tien", amount, balance);
            transactionList.add(newDeposit);
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * a.
     * @param amount double.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
            Transaction newWithdraw = new Transaction("Rut tien", amount, balance);
            transactionList.add(newWithdraw);
        }
    }

    /**
     * ab.
     * @param amount double.
     * @param operation String.
     */
    public void addTransaction(double amount, String operation) {
        if (!operation.equals(Transaction.DEPOSIT) && !operation.equals(Transaction.WITHDRAW)) {
            System.out.println("Yeu cau khong hop le!");
        } else if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else {
            withdraw(amount);
        }
    }

    /**
     * ab.
     */
    public void printTransaction() {
        for (int i = 0; i < transactionList.size(); i++) {
        System.out.print("Giao dich " + (i + 1) + ": " + transactionList.get(i).getOperation() + " $");
        System.out.printf("%.2f", transactionList.get(i).getAmount());
        System.out.print(". So du luc nay: $");
        System.out.printf("%.2f", transactionList.get(i).getBalance());
        System.out.println(".");
        }
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(-10,"deposit");
        acc.addTransaction(2000.255,"deposit");
        acc.addTransaction(1000,"withdraw");
        acc.printTransaction();
    }
}