import java.util.*;

class toConvert{
    Scanner sc=new Scanner(System.in);
    void conversion1(int sec){
        
        int hr=sec/3600;
        int min=(sec%3600)/60;
        int s=sec%60;
        System.out.println("Hours: "+hr+"\n"+"Minutes: "+min+"\n"+"Seconds: "+s);
    }
    void conversion2(int hr,int min,int s){
        
        int sec= (hr*3600)+(min*60)+6;
        System.out.println("Time in seconds: "+sec);
    }
}

public class time {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        toConvert obj=new toConvert();
        System.out.println("Enter a number to perform following actions: ");
        System.out.print("Seconds to hours,minutes,seconds - 1 |Hours,minutes,seconds to seconds - 2 ==> ");
        int n=sc.nextInt();
        if(n==1){
        System.out.print("Enter the time in seconds: ");
        int sec=sc.nextInt();
        obj.conversion1(sec);
        }
        else if(n==2){
        System.out.print("Enter the hours: ");
        int hr=sc.nextInt();
        System.out.print("Enter the minutes: ");
        int min=sc.nextInt();
        System.out.print("Enter the seconds: ");
        int s=sc.nextInt();
        obj.conversion2(hr,min,s);
        }
        else 
        System.out.println("Please enter a valid number");

    }
}
