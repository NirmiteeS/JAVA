import java.util.*;
class Westside{
    int cost(){
        return 5000;
    }
}

abstract class Payment{
    int amount=25000;
    abstract void paymentDetails();
}
class CashPayment extends Payment{
    @Override
    void paymentDetails(){
        System.out.println("The payment is in cash");
    }
}
class CreditCardPayment extends Payment{
    int creditno;
    String name;
    int expdate;
    CreditCardPayment(String name,int expdate,int creditno){
        this.name=name;
        this.expdate=expdate;
        this.creditno=creditno;
    }
    @Override
    void paymentDetails(){
        System.out.println("The payment is through credit card");
        System.out.println("Name of credit card: "+name);
        System.out.println("Expiration date of credit card: "+expdate);
        System.out.println("Credit card: "+creditno);
    }
}

class Person{
    Scanner sc=new Scanner(System.in);
    String person_name;
    int phone_no;
    void p_details(){
        System.out.print("Enter the name of the person: ");
        person_name=sc.nextLine();
        System.out.print("Enter the phone number of the person: ");
        phone_no=sc.nextInt();
    }
}
public class Shop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Payment c1=new CashPayment();
        Payment c2=new CreditCardPayment("sbi",23052023,180000266);
        
        Person[] p=new Person[2];
        for(int i=0;i<2;i++){
            Person q=new Person();
            q.p_details();
            p[i]=q;
            String item;
            Westside west=new Westside();
            System.out.print("Enter the number of items you want to purchase: ");
            int n=sc.nextInt();
            sc.nextLine();
            for(int j=0;j<n;j++){
                System.out.print("Enter the item "+(j+1)+" : ");
                item=sc.nextLine();
            }
            System.out.print("Enter the mode of payment (1 for cash) or (2 for credit card): ");
            int pay=sc.nextInt();
            if(pay==1){
                c1.paymentDetails();
            }
            else if(pay==2){
                c2.paymentDetails();
            }
            int a=c1.amount-(n*west.cost());
            System.out.println("Shopping of amount: "+(n*west.cost()));
            System.out.println("The amount left with you: "+a+"\n");
            }    
        }
    }

