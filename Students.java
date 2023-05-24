import java.util.*;
abstract class Marks{
    abstract double getPercentage();
}
class A extends Marks{
    int[] s1=new int[3];
    A(int s1[]){
        this.s1=s1;
    }
    double getPercentage(){
        int sum=0;
        for (int i=0;i<3;i++){
            sum+=s1[i];
        }
        return sum/3;
    }
}
class B extends Marks{
    int[] s2=new int[4];
    B(int s2[]){
        this.s2=s2;
    }
   
    double getPercentage(){
        int sum=0;
        for (int i=0;i<4;i++){
            sum+=s2[i];
        }
        return sum/4;
    }
}
public class Students
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int[] s1=new int[3];
   int[] s2=new int[4];
   String[] sub1={"Subject 1","Subject 2","Subject 3"};
   String[] sub2={"Subject 1","Subject 2","Subject 3","Subject 4"};
   System.out.println("------Enter the marks of students-------");
   for(int i=0;i<3;i++){
       System.out.print("Subject "+(i+1)+" for student A : ");
       s1[i]=sc.nextInt();
   }
   System.out.print("\n");
   for(int i=0;i<4;i++){
       System.out.print("Subject "+(i+1)+" for student B : ");
       s2[i]=sc.nextInt();
   }
Marks a=new A(s1);
Marks b=new B(s2);
System.out.println("\nPercentage of student A: "+a.getPercentage()+"%");
System.out.println("Percentage of student B: "+b.getPercentage()+"%\n");
for(int i=0;i<2;i++){
   for(int j=i+1;j<3;j++){
       int temp;
       String temp2;
       if(s1[i]>s1[j]){
           temp=s1[i];
           s1[i]=s1[j];
           s1[j]=temp;
           temp2=sub1[i];
           sub1[i]=sub1[j];
           sub1[j]=temp2;
       }
   }
}
for(int i=0;i<3;i++){
   for(int j=i+1;j<4;j++){
       int temp;
       String temp2;
       if(s2[i]>s2[j]){
           temp=s2[i];
           s2[i]=s2[j];
           s2[j]=temp;
           temp2=sub2[i];
           sub2[i]=sub2[j];
           sub2[j]=temp2;
       }
   }
}
System.out.println("Highest order of marks of student A");
for(int i=2;i>=0;i--){
       System.out.println(sub1[i]+" ==> "+s1[i]);
   }
   System.out.println("\nHighest order of marks of student B");
   for(int i=3;i>=0;i--){
       System.out.println(sub2[i]+" ==> "+s2[i]);
   }

}
}
