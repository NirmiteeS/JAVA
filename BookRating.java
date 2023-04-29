import java.util.*;
public class BookRating {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] books={"The Boy with striped pyjamas","Midnight Library","Chanakya in you","The great indian novel"};
        System.out.print("Enter the number of raters: ");
        int n=sc.nextInt();
        int[][] bookrating=new int[4][n];
        double[] avgrating=new double[4];

        for(int i=0;i<4;i++){
            System.out.println("\n"+"Enter the ratings (between 1 to 5) for the book '"+books[i]+"' : "); 
            for(int j=0;j<n;j++){
                bookrating[i][j]=sc.nextInt();
                if(bookrating[i][j]>5){
                    System.out.print("Enter valid ratings ");
                }
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<n;j++){
                avgrating[i] += bookrating[i][j];
            }
            avgrating[i]=avgrating[i]/n;
        }

        double highestrating=0;
        String popularBook="";
        for(int i=0;i<4;i++){           
            if(highestrating<avgrating[i]){
                highestrating=avgrating[i];
                popularBook=books[i];
            }
        }
        System.out.print("\n");
        System.out.println("The most popular book according to the ratings is '"+popularBook+"' with highest average rating of "+highestrating);
    }
}
