import java.util.*;
public class Alphabetical {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        String strup=str.toUpperCase();  //string to upper case
        char[] arr=strup.toCharArray();  //string to character array conversion
        for(int i=0;i<(strup.length()-1);i++){
            for(int j=i+1;j<strup.length();j++){
                if(arr[i]>arr[j]){
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Alphabetical ordered string: ");
        for(int i=0;i<strup.length();i++){
        System.out.print(arr[i]);
        }
    }
}
