import java.util.*;

class Info{
Scanner sc=new Scanner(System.in);
String name;
String type;
String hero;
String heroine;
int budget;

void movieName(){
System.out.print("Name of the movie: ");
name=sc.nextLine();
}
void movieType(){
System.out.print("Type of the movie: ");
type=sc.nextLine();
}
void movieHero(){
System.out.print("Name of the hero of the movie: ");
hero=sc.nextLine();
}
void movieHeroine(){
System.out.print("Name of the heroine of the movie: ");
heroine=sc.nextLine();
}

int movieBudget(){
System.out.print("Budget of the movie (in crores): ");
budget=sc.nextInt();
return budget;
}

}

public class movie{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
System.out.print("Enter the number of movies: ");
n=sc.nextInt();
Info[] obj=new Info[n];
for(int i=0;i<n;i++){
System.out.print("\n");
Info curr = new Info();
curr.movieName();
curr.movieType();
curr.movieHero();
curr.movieHeroine();
curr.movieBudget();
obj[i]=curr;
}
System.out.print("\n");
System.out.println("Sorting the movies according to the budget....");  
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
Info temp;
if(obj[i].budget>obj[j].budget){
temp=obj[i];
obj[i]=obj[j];
obj[j]=temp;
}
}
}  
for(int i=0;i<n;i++){
System.out.println(obj[i].name+" ==> "+obj[i].budget);
}
}
}
