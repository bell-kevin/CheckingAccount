package checkingaccount;

class Account {

    public double balance, fee;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void withdrawl(double amount) {
        balance = (this.balance - amount) - fee;
    }

    public double getBalance() {
        System.out.printf("New balance: $%,.2f\n\n", balance);
        return this.balance;
    }

    public void deposit(double amount) {
        balance = (balance + amount) - fee;
    }
}
