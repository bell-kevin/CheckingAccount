package checkingaccount;

import java.util.Scanner;

public class CheckingAccount {

    private double balance, fee, amount;

    public static void main(String[] args) {
        double balance, fee;
        char d, w, q;
        String response;
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.println("Checking Account by Kevin Bell\n");
        Account checking;
        checking = new Account();
        System.out.print("New Checking Account! What is the starting balance? ");
        balance = computerKeyboardInput.nextDouble();
        checking.setBalance();
        System.out.print("What is the fee for this checking account? ");
        fee = computerKeyboardInput.nextDouble();
        checking.setFee();
        System.out.println("");
        System.out.print("Please select deposit (d), withdrawal (w), or quit (q): ");
        response = computerKeyboardInput.next();
        while (response == 'w' || response == 'd' || response == 'q') {
            System.out.println("Please select deposit (d), withdrawal (w), or quit (q): ");
            response = computerKeyboardInput.nextLine().charAt(0);
            switch (response.charAt(0)) {
                case 'd':
                    checking.deposit();
                    break;
                case 'w':
                    checking.withdrawl();
                    break;
                case 'q':
                    break;
                default:
                     System.out.println("Please select deposit (d), withdrawal (w), or quit (q): ");
            }
        }
    }
}
