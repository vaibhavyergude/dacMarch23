class ElectricityBill{
    //fields
    String customerName;
    double unitsConsumed;
    double billAmount;

    //constructor
    ElectricityBill(String customerName, double unitsConsumed){
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    //method
    double calculateBillAmount(){

        if(unitsConsumed <= 100){
            return (unitsConsumed*5);
        }
        else if(unitsConsumed <=300){
            return (100*5+(unitsConsumed-100)*7);
        }
        else{
            return (100*5 + 200*7 + (unitsConsumed-300)*10);
        }

    }
}

class Program {
    public static void main(String[] args){
        ElectricityBill bill = new ElectricityBill("Vaibhav", 548);

        System.out.println("Customer Name: "+ bill.customerName);
        System.out.println("Units Consumed: "+ bill.unitsConsumed);
        System.out.println("Bill Amount: "+bill.calculateBillAmount());
        
    }
}
