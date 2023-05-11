import java.util.*;
class Student{
    int rollno;
    String name;
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
}

class Exam extends Student{
    int[] m=new int[6];
    Exam(int rollno,String name,int[] t){
        super(rollno,name);
        this.m=t;
    }

}
class Result extends Exam{
    int totalmarks=0;
    Result(int rollno,String name,int[] t){
        super(rollno,name,t);
    }
    int total(){
        for(int i=0;i<6;i++){
            totalmarks+=m[i];
        }
        return totalmarks;
    }
}


public class Practise {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Result[] res=new Result[3];
        for(int j=0;j<3;j++){
        System.out.print("Enter the roll number of student "+(j+1)+" : ");
        int rn=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of student "+(j+1)+" : ");
        String n=sc.nextLine();
   
        
        int[] t=new int[6];
        for(int i=0;i<6;i++){
            System.out.print("Enter the marks of subject "+(i+1)+" : ");
            t[i]=sc.nextInt();
        }
        Result obj=new Result(rn,n,t);
        res[j]=obj;
        System.out.print("-------- The total marks of the student "+(j+1)+" : "+res[j].total()+" ---------\n\n");
    }   
    }
}
