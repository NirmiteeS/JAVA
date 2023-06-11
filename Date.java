import java.util.*;
public class Date {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean end=false;
        while(!end){
        try{
        System.out.print("Enter date in month/day numeric notation: ");
        String date=sc.nextLine();
        String[] str1=date.split("/");
        if(str1.length!=2){
            throw new IllegalArgumentException();
        }
        int a=Integer.parseInt(str1[0]);
        int b=Integer.parseInt(str1[1]);
        String month=getMonth(a);
        String day=getDay(a,b);
        System.out.println("This is the same as: "+month+" "+day);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid date format. Enter numeric values");
        }
        catch(MonthError | DayError e){
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid date format. enter in the format month/day");
        }
        System.out.print("Again(Y/N): ");
        String again=sc.nextLine();
        end=!again.equalsIgnoreCase("Y");
    }
    }
    public static String getMonth(int a) throws MonthError{
        switch(a){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: throw new MonthError("Invalid numeric value of month");
        }
    }
    public static String getDay(int a, int b) throws DayError{
        if(a==2 && b==29){
            return "29";
        }
        else if(b<1 || (b>31 && (a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12)) || 
        (b>30 && (a==2 || a==4 || a==6 || a==10 || a==11)) ){
            throw new DayError("Invalid numeric value of day");
        }
        return String.valueOf(b);
    }
}
class MonthError extends Exception{
    MonthError(String message){
    super(message);
    }
}
class DayError extends Exception{
    DayError(String message){
    super(message);
    }
}

