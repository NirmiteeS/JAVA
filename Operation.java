import java.util.*;

public class Operation {
    public static void main(String arg[]){
       
        Scanner sc=new Scanner(System.in);
        
        boolean exit=false;
        while(!exit){
        System.out.print("Enter the expression in the form (a+b): ");
        String str=sc.nextLine();
        try{
            calculation(str);
        } 
        catch(NumberFormatException e){
            System.out.println("Invalid numerical digits a and b");
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid operator (+,-,*,/,log,^)");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid form of expression (a+b)");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic error");
        }
        System.out.print("Do you want to continue the calculation(Y/N): ");
        String s=sc.nextLine();
        //exit = !s.equalsIgnoreCase("Y");
        if(s!="Y"){
            exit=true;
        }
    }
    }
    public static void calculation(String str){
        String[] str1=str.split("(?<=.)");
        double a=Double.parseDouble(str1[0]);
        double b=Double.parseDouble(str1[2]);
   
        if(str1.length!=3){
            throw new ArrayIndexOutOfBoundsException();
        }
        double r=0;
        //contains() method searches the sequence of characters in this string. 
        //It returns true if the sequence of char values is found in this string otherwise returns false.
        if(str.contains("+")){            
            r=a+b;
        }
        else if(str.contains("-")){
            r=a-b;
        }
        else if(str.contains("*")){
            r=a*b;
        }
        else if(str.contains("/")){
            if(b==0){
                throw new ArithmeticException();
            }
            r=a/b;
        }
        else if(str.contains("log")){
            if(a==1){
                throw new ArithmeticException();
            }
            r= Math.log(b)/Math.log(a);
        }
        else if(str.contains("^")){
            r=Math.pow(a,b);
        }
        else{
            throw new IllegalArgumentException();
        }
        System.out.println("Answer: "+r);
    }
}
