package checkingaccount;

class Account {

    public double balance, fee, amount;

    public void setBalance() {
        this.balance = balance;
    }

    public void setFee() {
        this.fee = fee;
    }

    public void withdrawl() {
        amount = (this.balance - this.amount) - fee;
    }

    public void deposit() {
        balance = (this.balance + this.amount) - fee;
    }

    public double getBalance(double balance) {
        System.out.println("New balance: $" + balance);
        return this.balance;
    }
}
