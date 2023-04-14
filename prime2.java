import java.util.*;

class Prime{
    private int lower;
    private int upper;
    public void setLower(int n){
      this.lower=n;
    }
    public void setUpper(int n){
      this.upper=n;
    }
    public void printPrimes(){
      for(int i=lower;i<=upper;i++)
        {
          if(i==1)
            continue;
          int flag=0;
          for(int j=2;j<=i/2;j++)
            {
              if(i%j==0)
              {
                flag=1;
                break;
              }
            }
          if(flag==0)
          {
            System.out.println(i+" is Prime.");
          }
        }
    }
}

public class prime2 {
  public static void main(String[] args) {
    int l,u;
    Prime P =new Prime();
    Scanner s = new Scanner(System.in);
    System.out.print("Enter lower limit of range: ");
    l = s.nextInt();
    P.setLower(l);
    System.out.print("Enter upper limit of range: ");
    u = s.nextInt();
    P.setUpper(u);
    P.printPrimes();
   
  }
}
