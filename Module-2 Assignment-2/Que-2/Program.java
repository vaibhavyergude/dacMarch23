import java.util.Scanner;

class CalculateBMI {
    // fields
    double height;
    double weight;

    // methods

    // paramterless constructor
    CalculateBMI() {
        this.height = 0.0;
        this.weight = 0.0;
    }

    // parameterized constructor
    CalculateBMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // setter
    public void setBMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // getter
    public double calculateBMI() {
        // here we are calculating BMI
        return (weight) / (height * height);
    }
}

class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Using Constructor

        System.out.println("Enter Height(m):");
        float h = sc.nextFloat();

        System.out.println("Enter Weight(kg):");
        float w = sc.nextFloat();
        CalculateBMI person = new CalculateBMI(h, w);

        System.out.println("BMI = " + person.calculateBMI() + "\n");

        // Using Setter method

        System.out.println("Enter New Height(m):");
        float hNew = sc.nextFloat();

        System.out.println("Enter New Weight(kg):");
        float wNew = sc.nextFloat();

        person.setBMI(hNew, wNew);

        System.out.println("New BMI = " + person.calculateBMI());
    }
}