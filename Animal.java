import java.util.*;

class Mammal{
    String category;
    int legs;
}

class Dog extends Mammal{
    String name;
    int age;
    int lc=0;
    int gc=0;
    void popularbreed(int lc,int gc){
        if(lc>gc){
        System.out.println("The most popular breed is: Labrador");
    }
    else{
        System.out.println("The most popular breed is: German Shepherd");
    }
}
}

class Labrador extends Dog{
    String colour;
    int weight;
    Labrador(String colour,int weight) {
        this.colour=colour;
        this.weight=weight;
    }
    String lifeExpectancy(){
        return "10-14";
    }
    String speak(){
        return "WOOF";
    }
    int calculateAvgWeight(int weight,int lc){
        return (weight/lc);
    }
}

class GermanShepherd extends Dog{
    int height;
    int lifespan;
    GermanShepherd(int height,int lifespan) {
        this.height=height;
        this.lifespan=lifespan;
    }
    String lifeExpectancy(){
        return "9-13";
    }
    String speak(){
        return "GRUNT";
    }
    int calculateAvgHeight(int height,int gc){
        return (height/gc);
    }
}

public class Animal{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of dogs: ");
    int c=sc.nextInt();
    Dog[] dog=new Dog[c];
    int lc=0;
    int gc=0;
    int aw=0;
    int ah=0;
    for(int i=0;i<c;i++){
        System.out.print("Enter the dog breed "+(i+1)+" ==>> 'l' for Labrador or 'g' for German Shepherd: ");
        char n=sc.next().charAt(0);
        if(n=='l'){
            sc.nextLine();
            System.out.print("Enter the colour of the Labrador: ");
            String col=sc.nextLine();
            System.out.print("Enter the weight(in kg) of the dog: ");
            int w=sc.nextInt();
            dog[i]=new Labrador(col,w);
            lc++;
            aw=w+aw;
        }
        else if(n=='g'){
            System.out.print("Enter the height(in cm) of the dog: ");
            int h=sc.nextInt();
            System.out.print("Enter the age of the dog: ");
            int a=sc.nextInt();
            dog[i]=new GermanShepherd(h,a);
            gc++;
            ah+=h;
        }
        System.out.print("\n");
    }

    Dog obj=new Dog();
    Labrador obj1=new Labrador(null, aw);
    GermanShepherd obj2=new GermanShepherd(ah,0);
    obj.popularbreed(lc,gc);
    if(lc>gc){
        System.out.println("The sound of the labrador is "+obj1.speak());
        System.out.println("The Life Expectancy of labrador is: "+obj1.lifeExpectancy()+" years");
    }
    else{
        System.out.println("The sound of the german shepherd is: "+obj2.speak());
        System.out.println("The Life Expectancy of german shepherd is: "+obj2.lifeExpectancy()+" years");
    }
    System.out.print("\n");
    System.out.println("The avg weight of the labrador is: "+obj1.calculateAvgWeight(aw,lc)+" kg");
    System.out.println("The average height of the german shepherd is: "+obj2.calculateAvgHeight(ah,gc)+" cm");
}
}
