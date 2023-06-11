
class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread name is: "+Thread.currentThread().getName());
    }
}

public class MultiThr {
    public static void main(String args[]){
        MyThread m1=new MyThread();
        MyThread m2=new MyThread();

        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
        t1.start();
        t2.start();
    }
}
