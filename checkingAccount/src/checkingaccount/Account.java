package checkingaccount;

class Account {

    public double balance, fee, amount;

    public void setBalance() {
        this.balance = balance;
    }

    public void setFee() {
        this.fee = fee;
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdrawl() {
        amount = (this.balance - this.amount) - fee;
    }

    public void deposit() {
        amount = (this.balance + this.amount) - fee;
    }
}
