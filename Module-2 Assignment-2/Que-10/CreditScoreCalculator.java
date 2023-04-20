import java.util.Scanner;

public class CreditScoreCalculator {
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    CreditScoreCalculator() {
        this.creditHistory = 0;
        this.creditUtilization = 0.0;
        this.paymentHistory = false;
    }

    CreditScoreCalculator(int creditHistory, double creditUtilization, boolean paymentHistory) {
        this.creditHistory = creditHistory;
        this.creditUtilization = creditUtilization;
        this.paymentHistory = paymentHistory;
    }

    // getter and setter
    public int getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    public double getCreditUtilization() {
        return creditUtilization;
    }

    public void setCreditUtilization(double creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    public boolean isPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(boolean paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public int calculateCreditScore() {
        int creditScore = 0;
        if (paymentHistory) {
            creditScore = (creditHistory * 15) + (int) (creditUtilization * 30) + 55;
        } else {
            creditScore = (creditHistory * 15) + (int) (creditUtilization * 30) + 35;
        }
        return creditScore;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Credit History:");
        int creditHistory = sc.nextInt();
        System.out.println("Enter Credit Utilization:");
        double creditUtilization = sc.nextDouble();
        System.out.println("Enter Payment History (true/false):");
        boolean paymentHistory = sc.nextBoolean();
        CreditScoreCalculator calculator = new CreditScoreCalculator(creditHistory, creditUtilization, paymentHistory);
        int creditScore = calculator.calculateCreditScore();
        System.out.println("Credit score: " + creditScore);
    }
}
