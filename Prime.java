import java.util.*;
class check{
    private int[] a;
    public int[] getA() {
        return a;
    }
    public void setA(int[] a) {
        this.a = a;
    }
    public int checkPrime(int a){
        if(a==1){
            return 0;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
        if(a%i==0){
            return 0;
        }
        }
        return 1;
    }
    public void isPrime(){
        System.out.print("Prime numbers are: ");
        for(int num:a){
        if(checkPrime(num)==1){
            System.out.print(num + " ");
        }
    }
    }
    public void setA(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
}

public class Prime{
    public static void main(String args[]){       
        check obj=new check();
        obj.setA();
        obj.isPrime();
    }
}