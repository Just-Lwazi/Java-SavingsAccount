public class SavingAccount {
    int balance;
    int accountNum;
    String accountHolder;

    public SavingAccount(int initialBalance, int accountNo, String Name){
        balance = initialBalance;
        accountNum = accountNo;
        accountHolder = Name;
    }

    public void checkBlance(){
        System.out.println("Hello " + accountHolder + " !");
        System.out.println("Your balance is " + balance);
    }

    public void deposit(int amountToDeposit){
        int newAmount = balance + amountToDeposit;
        balance = newAmount;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public int withdraw(int amoountToWithdraw){
        int withdrew = balance - amoountToWithdraw;
        balance = withdrew;
        if(amoountToWithdraw > balance){
            System.out.println("Sorry " + accountHolder + " You have insufficient funds!");
        }
        else{System.out.println("You just withdrew " + amoountToWithdraw);}


        return amoountToWithdraw;
    }

    public static void main(String [] args){
        SavingAccount savings = new SavingAccount(1000, 123456, "Sarah");
        SavingAccount blue  = new SavingAccount(2500, 654321, "Helda");

        savings.checkBlance();
        savings.withdraw(1500);
        savings.deposit(15000);
        savings.checkBlance();

        blue.checkBlance();
        blue.withdraw(500);
        blue.withdraw(1000);
        blue.checkBlance();
        blue.withdraw(1000);


    }
}
