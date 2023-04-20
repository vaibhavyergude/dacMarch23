import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

class DateCheck {
    int day;
    int month;
    int year;
    DateCheck(){
        this(0,0,0);
    }
    DateCheck(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public boolean isValid(){
        if(this.year<0) return false;
        if(this.month < 1 || this.month >12) return false;
        if(this.day < 1 || this.day > 31) return false;
        switch(this.month){
            case 1: return true;
            case 2: return (isLeapYear() ? day<=29 : day<=28);
            case 3: return true;
            case 4: return this.day<31;
            case 5: return true;
            case 6: return this.day<31;
            case 7: return true;
            case 8: return true;
            case 9: return this.day<31;
            case 10: return true;
            case 11: return this.day<31;
            default: return true;
        }
    }
    public boolean isLeapYear(){ 
        if((this.year%4==0 && this.year%100 != 0) || (this.year%100==0 && this.year%400 ==0)) return true;
        else return false;
    }
    public int getDayOfWeek(){
        if(isValid()){
            Calendar c=Calendar.getInstance();
            c.clear();
            c.set(this.year, this.month-1, this.day);
            return c.get(Calendar.DAY_OF_WEEK)-1;
        }
        else return -1;
    }
    public String getNextDay(){
        if(isValid()){
            Calendar c=Calendar.getInstance();
            c.clear();
            c.set(this.year, this.month-1, this.day);
            c.add(Calendar.DAY_OF_MONTH, 1);
            Date dt=c.getTime();
            return (new SimpleDateFormat("dd/MM/yyyy").format(dt));
        }
        else return "Not a valid date";
    }
    public String getPreviousDay(){
        if(isValid()){
            Calendar c=Calendar.getInstance();
            c.clear();
            c.set(this.year, this.month-1, this.day);
            c.add(Calendar.DAY_OF_MONTH, -1);
            Date dt=c.getTime();
            return (new SimpleDateFormat("dd/MM/yyyy").format(dt));
            }
        else return "Not a valid date";
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter day : ");
        int day=sc.nextInt();
        System.out.print("Enter month : ");
        int month=sc.nextInt();
        System.out.print("Enter year : ");
        int year=sc.nextInt();
        DateCheck d=new DateCheck(day,month,year);
        System.out.println(d.isValid());
        System.out.println(d.isLeapYear());
        System.out.println(d.getDayOfWeek());
        System.out.println(d.getNextDay());
        System.out.println(d.getPreviousDay());
        sc.close();
    }
}
