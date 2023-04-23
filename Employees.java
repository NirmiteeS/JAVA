import java.util.*;

class Selection{
    String profile;
    int cw,at,tt,in;
    Selection(int cw,int at,int tt,int in){
        this.cw=cw;
        this.at=at;
        this.tt=tt;
        this.in=in;
        profile="Programmer";
    }
    Selection(int tt,int in){
        this.tt=tt;
        this.in=in;
        profile="Team Leader";
    }
    Selection(int in){
        this.in=in;
        profile="Project Manager";
    }
    void recruitment(){
        if(profile=="Programmer"){
            if(this.cw+this.at+this.tt+this.in>=80){
                System.out.print("Passed the test for "+profile);
            }
            else
            System.out.print("Failed the test for "+profile);
        }
        if(profile=="Team Leader"){
            if(this.tt+this.in>=85){
                System.out.print("Passed the test for "+profile);
            }
            else
            System.out.print("Failed the test for "+profile);
        }
        if(profile=="Project Manager"){
            if(this.in>=90){
                System.out.print("Pass the test for "+profile);
            }
            else
            System.out.print("Failed the test for "+profile);
        }   
    }

}

public class Employees {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of employees: ");
    int n=sc.nextInt();
    sc.nextLine();
    
    String emp[]=new String[n];
    Selection[] obj=new Selection[n];
    for(int i=0;i<n;i++){
        System.out.print("\n");
        System.out.print("Enter the name of the employee: ");
        emp[i]=sc.nextLine();
        System.out.println("Enter the job post for employee "+(i+1)+" : ");
        System.out.print("P for Programmer | T for Team Leader | M for Project Manager"+"\n");
        char post=sc.next().charAt(0);
        if(post=='P'){
            System.out.print("Enter the score for Course Work: ");
            int cw=sc.nextInt();
            System.out.print("Enter the score for Aptitude Test: ");
            int at=sc.nextInt();
            System.out.print("Enter the score for Technical Test: ");
            int tt=sc.nextInt();
            System.out.print("Enter the score for Interview: ");
            int in=sc.nextInt();
            sc.nextLine();
            obj[i]=new Selection(cw,at,tt,in);
        }
        if(post=='T'){
            System.out.print("Enter the score for Technical Test: ");
            int tt=sc.nextInt();
            System.out.print("Enter the score for Interview: ");
            int in=sc.nextInt();
            sc.nextLine();
            obj[i]=new Selection(tt,in);
        }
        if(post=='M'){
            System.out.print("Enter the score for Interview: ");
            int in=sc.nextInt();
            sc.nextLine();
            obj[i]=new Selection(in);
        }
    }
    System.out.print("\n");
    for(int i=0;i<n;i++){
        System.out.print(emp[i]+" : ");
        obj[i].recruitment();
        System.out.print("\n");
    }
    }
}
