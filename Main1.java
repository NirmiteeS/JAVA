import java.util.*;
import java.util.Random;
abstract class Player{
    abstract int getGuess();
}

class HumanPlayer extends Player{
    Scanner sc=new Scanner(System.in);
    int getGuess(){
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        return a;
    }
}
class ComputerPlayer extends Player{
    int getGuess(){
        Random ran=new Random();
        int b=ran.nextInt(101);  //0 to 100
        return b;
    }
}

public class Main1 {
    public static void main(String args[]){
        System.out.println("-----Human vs Human------");
        Player p1=new HumanPlayer();
        Player p2=new HumanPlayer();
        Main1.play(p1,p2);

        System.out.println("-----Human vs Computer------");
        Player p3=new HumanPlayer();
        Player p4=new ComputerPlayer();
        Main1.play(p3,p4);

        System.out.println("-----Computer vs Computer------");
        Player p5=new ComputerPlayer();
        Player p6=new ComputerPlayer();
        Main1.play(p5,p6);
    }
    public static void play(Player player1,Player player2){
        Random ran=new Random();
        int g=ran.nextInt(101);     
        int p=player1.getGuess();
        int q=player2.getGuess();
        checkAnswer(p,g);
        checkAnswer(q,g);

    }
    public static void checkAnswer(int p1,int g){
        System.out.print("Player: "+p1);
        System.out.print("  Guess: "+g);
        if(p1==g){
            System.out.println("\nAnswer is correct\n");
        }
        else if(p1>g || p1<g){
            System.out.println("\nAnswer is incorrect\n");
        }
    }
}
