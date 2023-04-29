import java.util.*;
public class ExtractChar {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        System.out.print("Enter the starting character for extraction: ");
        char n=sc.next().charAt(0);
        System.out.print("Enter the number of characters to be extracted from starting character: ");
        int m=sc.nextInt();
        char[] store=new char[m];
        for(int i=0;i<str.length();i++){
            if(arr[i]==n){
                for(int j=0;j<m;j++){
                    store[j]=arr[i];
                    i++;
                }
            }
        }
        System.out.print("The extracted string is: ");
        for(int i=0;i<m;i++){
            System.out.print(store[i]);
        }
    }
}
