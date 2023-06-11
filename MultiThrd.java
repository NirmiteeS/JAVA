import java.util.Random;

public class MultiThrd{
    public static void main(String args[]){
        Random r=new Random();
        Thread t1=new Thread(() -> randomNo()); //can also be written as: Thread thread1 = new Thread(MultiThrd::randomNo);
        Thread t2=new Thread(() -> squareNo());
        Thread t3=new Thread(() -> cubeNo());
        t1.start();
        t2.start();
        t3.start();
    }
    public static void randomNo(){
        Random r=new Random();
        while(true){
            int n=r.nextInt(100);
            System.out.println("Random number: "+n);
            try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Thread 1 is interrupted - "+e.getMessage());
        }
    }
    }
    public static void squareNo(){
        Random r=new Random();
        while(true){
            int n=r.nextInt(100);
            int sq=n*n;
            System.out.println("Square of number: "+sq);
            try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Thread 2 is interrupted - "+e.getMessage());
        }
    }
    }
    public static void cubeNo(){
        Random r=new Random();
        while(true){
            int n=r.nextInt(100);
            int cu;
            cu=n*n*n;
            System.out.println("Cube of number: "+cu);
            try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Thread 3 is interrupted - "+e.getMessage());
        }
    }
    }
}
