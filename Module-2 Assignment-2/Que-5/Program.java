class TelephoneBill{
    //fields
    String customerName;
    long phoneNumber;
    int numOfCallsMade;
    int duration;

    //constructor
    TelephoneBill(String customerName, long phoneNumber, int numOfCallsMade, int duration){
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.numOfCallsMade = numOfCallsMade;
        this.duration = duration;

    }

    //calculating bills
    double calculateBills(){
        // if(numOfCallsMade == 100){
        //     return (double)((0.5*(double)numOfCallsMade) + 10);
        // }
        // else if(numOfCallsMade>=100){
        //     return (double)((0.5*(double)numOfCallsMade)+ (0.25*((double)(numOfCallsMade-100))+10));
        // }else{
        //     return 10.00;
        // }

        //minutes per call
        int call = duration/numOfCallsMade;
    }
}

class Program {
    public static void main(String[] args) {
        
        TelephoneBill bill = new TelephoneBill("abcdef", 9999999999L, 500, 50);

        System.out.println("Bill Amount = $"+ bill.calculateBills());
    }
}