import java.util.*;
interface EatItHere{
    void deliverOrder();
}
interface TakeAway{
    void dispatchOrder();
}
class Consumer implements EatItHere,TakeAway{
    Scanner sc=new Scanner( System.in);
    int orderprice;
    int ordernum;
    @Override
    public void dispatchOrder() {
        System.out.print("Enter the order number: ");
        ordernum=sc.nextInt();
        System.out.print("Enter the price of the order: ");
        orderprice=sc.nextInt();
        int p1=orderprice+500;
        int p2=orderprice + ((orderprice*10)/100);
        if(p1>p2){
            System.out.println("------Bill-----\nOrder number: "+ordernum+"\nOrder price: "+orderprice+"\nTotal price with gst: "+p2);
        }
        else if(p2>p1){
            System.out.println("------Bill-----\nOrder number: "+ordernum+"\nOrder price: "+orderprice+"\nTotal price with gst: "+p1);
        }
    }

    @Override
    public void deliverOrder() {
        System.out.print("Enter the order number: ");
        ordernum=sc.nextInt();
        System.out.print("Enter the price of the order: ");
        orderprice=sc.nextInt();
        int p1=orderprice+45;
        int p2=orderprice + ((orderprice*5)/100);
        if(p1>p2){
            System.out.println("------Bill-----\nOrder number: "+ordernum+"\nOrder price: "+orderprice+"\nTotal price with service charges: "+p1);
        }
        else if(p2>p1){
            System.out.println("------Bill-----\nOrder number: "+ordernum+"\nOrder price: "+orderprice+"\nTotal price with service charges: "+p2);
        }
    }
    
}

public class FastFood {
    public static void main(String args[]){
        Scanner sc=new Scanner( System.in);
        Consumer cons=new Consumer();
        System.out.println("Do you want to eat your food in restaurant or order it?");
        System.out.print("Enter '1' to eat it here or '2' to deliver the order: ");
        int s=sc.nextInt();
        if(s==1){
            cons.dispatchOrder();
        }
        else if(s==2){
            cons.deliverOrder();
        }
    }
}
