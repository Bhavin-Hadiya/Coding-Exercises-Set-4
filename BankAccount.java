import java.util.*;

class BankAccount {
    int accNo;
    String name;
    double bal;

    void openAccount(int a, String n, double b) {
        accNo = a;
        name = n;
        bal = b;
    }

    void deposit(double amt) {
        bal = bal + amt;
    }

    void withdraw(double amt) {
        if (amt <= bal) {
            bal = bal - amt;
        }
    }

    void checkBalance() {
        System.out.println(bal);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest() {
        return bal * 0.04;
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount(int t) {
        return bal + (bal * 0.06 * t);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount s = new SavingAccount();
        FixedDepositAccount f = new FixedDepositAccount();

        s.openAccount(1, "A", 1000);
        f.openAccount(2, "B", 2000);

        s.deposit(500);
        s.withdraw(200);
        s.checkBalance();
        System.out.println(s.calculateInterest());

        f.deposit(1000);
        f.checkBalance();
        System.out.println(f.maturityAmount(2));
    }
}