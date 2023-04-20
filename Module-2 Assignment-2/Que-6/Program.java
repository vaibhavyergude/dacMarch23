import java.util.Scanner;

class BankAccount{
    public static Scanner sc = new Scanner(System.in);
    private String name;
    private int accountNumber;
    private static int accountNumberGenerator=0;
    private double accountBalance;

    //methods
    public void newAccount(){
        System.out.println("Enter Account Holder Name:");
        System.out.println("Enter Account number:");
        this.accountNumber = accountNumberGenerator++;
        this.accountBalance = 0.0;
    }

    public void depositMoney(){
        System.out.println("Enter Account number:");
        int enteredAccNum = sc.nextInt();
        if(this.accountNumber == enteredAccNum){
            System.out.println("Enter amount to add:");
            double moneyAdd = sc.nextDouble();
            this.accountBalance += moneyAdd;
        }else{
            System.out.println("Enter Correct Account Number");
        }
    }

    public void withdrawMoney(){

    }

    public void accountBalance(){

    }

    public void accountInfo(){

    }
}

class Program {
    public static void main(String[] args) {
        
    }
}
