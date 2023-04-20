import java.util.*;

class Rational {
    private int num1;
    private int den1;
    private int num2;
    private int den2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return this.num1;
    }

    public void setDen1(int den1) {
        this.den1 = den1;
    }

    public int getDen1() {
        return this.den1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return this.num2;
    }

    public void setDen2(int den2) {
        this.den2 = den2;
    }

    public int getDen2() {
        return this.den2;
    }
}

class Calculator {
    private static Scanner sc = new Scanner(System.in);
    private Rational r = new Rational();

    public void add() {
        int lcm = LCM(r.getDen1(), r.getDen2());
        int tempnum = ((lcm / r.getDen1()) * r.getNum1()) + ((lcm / r.getDen2()) * r.getNum2());
        reducedFrac(tempnum, lcm);
    }

    public void subtract() {
        int lcm = this.LCM(r.getDen1(), r.getDen2());
        int tempnum = ((lcm / r.getDen1()) * r.getNum1()) - ((lcm / r.getDen2()) * r.getNum2());
        reducedFrac(tempnum, lcm);
    }

    public void multiply() {
        int num = r.getNum1() * r.getNum2();
        int den = r.getDen1() * r.getDen2();
        reducedFrac(num, den);
    }

    public void divide() {
        int num = r.getNum1() * r.getDen2();
        int den = r.getDen1() * r.getNum2();
        reducedFrac(num, den);
    }

    public int LCM(int x, int y) {
        int gcd = 1;
        for (int i = 1; i <= Integer.min(x, y); i++) {
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        return (x * y) / gcd;
    }

    public void reducedFrac(int num, int den) {
        for (int i = 2; i <= Integer.max(num, den); i++) {
            if (num % i == 0 && den % i == 0) {
                num /= i;
                den /= i;
            }
        }
        System.out.println("Numerator : " + num);
        System.out.println("Denominator : " + den);
    }

    public char input() {
        System.out.println("Enter 1st rational no");
        System.out.print("Numerator 1 : ");
        r.setNum1(sc.nextInt());
        System.out.print("Denominator 1 : ");
        r.setDen1(sc.nextInt());

        System.out.println("Enter 2st rational no");
        System.out.print("Numerator 2 : ");
        r.setNum2(sc.nextInt());
        System.out.print("Denominator 2 : ");
        r.setDen2(sc.nextInt());

        System.out.println("Enter x to exit");
        System.out.print("Enter operation to be performed : ");
        sc.nextLine();
        String str = sc.nextLine();
        return str.charAt(0);
    }

    public static void main(String[] args) {
        char ch;
        Calculator c = new Calculator();
        while ((ch = c.input()) != 'x') {
            switch (ch) {
                case '+':
                    c.add();
                    break;
                case '-':
                    c.subtract();
                    break;
                case '*':
                    c.multiply();
                    break;
                case '/':
                    c.divide();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
