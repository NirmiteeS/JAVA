import java.util.*;

class Publication{
    String title;
    double price;
    void getdata(String title,double price){
        this.title=title;
        this.price=price;
    }
    String puttitle(){
        return title;
    }
    double putprice(){
        return price;
    }
}
class Book extends Publication{
    int pagecount;
    void getpagecount(int pagecount){
        this.pagecount=pagecount;
    }
    int putcount(){
        return pagecount;
    }
}
class Tape extends Publication{
    double time;
    void gettime(double time){
        this.time=time;
    }
    double puttime(){
        return time;
    }
}

public class Practise2 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the title of the book/tape: ");
    String t=sc.nextLine();
    System.out.print("Enter the price(in Rs) of the book/tape: ");
    double p=sc.nextDouble();
    Book obj=new Book();
    obj.getdata(t,p);
    System.out.print("Enter the page count of the book: ");
    int pc=sc.nextInt();
    obj.getpagecount(pc);
    Tape obj2=new Tape();
    System.out.print("Enter the playing time(in minutes) of the tape: ");
    double time=sc.nextDouble();
    obj2.gettime(time);
    System.out.print("\n--------------------------------\n");
    System.out.printf("=> Book  : %8s%n",obj.puttitle());
    System.out.printf("=> Price : %8f%n",obj.putprice());
    System.out.printf("=> Pages : %4d%n",obj.putcount());
    System.out.printf("=> Time  : %8f%n",obj2.puttime());
    System.out.print("---------------------------------");
    }
}
