package checkingaccount;

import java.util.Scanner;

public class CheckingAccount {

    public static void main(String[] args) {
        double balance, fee, amount;
        String response;
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.println("Checking Account by Kevin Bell\n");
        Account checking;
        checking = new Account();
        System.out.print("New Checking Account! What is the starting balance? $");
        balance = computerKeyboardInput.nextDouble();
        checking.setBalance(balance);
        System.out.print("What is the fee for this checking account? $");
        fee = computerKeyboardInput.nextDouble();
        checking.setFee(fee);
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.print("Please select deposit (d), withdrawal (w), or quit (q): ");
            response = computerKeyboardInput.next();
            switch (response.charAt(0)) {
                case 'd':
                    System.out.print("How much will you deposit? $");
                    amount = computerKeyboardInput.nextDouble();
                    checking.deposit(amount);
                    checking.getBalance();
                    break;
                case 'w':
                    System.out.print("How much will you withdraw? $");
                    amount = computerKeyboardInput.nextDouble();
                    checking.withdrawl(amount);
                    checking.getBalance();
                    break;
                case 'q':
                    break;
            }
        }
    }
}
