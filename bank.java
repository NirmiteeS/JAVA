import java.util.*;

class Banking{
    Scanner sc=new Scanner(System.in);
    double rate;
    double balance;
    
    Banking(double r,double b){
    rate=r;
    balance=b;
    }
    
    void deposit(){
    System.out.print("Enter the amount to deposit: Rs. ");
    int d=sc.nextInt();
    System.out.println("Rs. " +d+ " are deposited in the account.");
    System.out.println("Total amount in the account " +(this.balance+d));
    }
    
    void withdraw(){
    System.out.print("Enter the amount to withdraw: Rs. ");
    int w=sc.nextInt();
    System.out.println("Rs. " +w+ " are withdrawn from the account.");
    System.out.println("Total amount in the account: Rs. " + (this.balance-w));
    }
    
    void compint(){
    System.out.print("Enter the time period(number of years): ");
    int n=sc.nextInt();
    double ci;
    ci= this.balance * Math.pow(1+(this.rate/100),n);
    System.out.println("Compound interest: Rs. " + (ci-this.balance));
    }
    
    void bal(){
    System.out.println("The balance is Rs. " + this.balance);
    }
    
    void menu(){
    System.out.print("To deposit-1 |To withdraw the amount-2 |To find compound interest-3 |To check the balance-4" +"\n" +"Enter the option number to perform your activity: ");
    int opt=sc.nextInt();
    if(opt==1)
    deposit();
    else if(opt==2)
    withdraw();
    else if(opt==3)
    compint();
    else if(opt==4)
    bal();
    else 
    System.out.println("Please enter a valid option number");
    }
    }
    
public class bank{
    public static void main(String args[]){
    Banking obj=new Banking(3,25000);
    obj.menu();
    }
    }
    