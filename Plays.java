import java.util.*;
class Production{
    private String title;
    private String writer;
    private String director;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public Production(){
        this.title="Hamlet";
        this.writer="Shakespeare";
        this.director="William";
    }
    @Override
    public String toString(){
        return "The title of the play is "+getTitle()+"\n"+"The writer of this play is "+getWriter()+"\n"
        +"The director of this play is "+getDirector();
    }
}

class Play extends Production{
    int performance=0;
    Play() {
        super();
    }
    int plus(){
        return performance++;
    }

    @Override
    public String toString() {
        return "Play [performance =" + performance + "]";
    }
    
}

class Musical extends Play{
    String composer;
    String lyricist;
    Musical() {
        super();
        this.composer="Ram avinash";
        this.lyricist="Rita Gondi";
    }
    public String getComposer() {
        return composer;
    }
    public void setComposer(String composer) {
        this.composer = composer;
    }
    public String getLyricist() {
        return lyricist;
    }
    public void setLyricist(String lyricist) {
        this.lyricist = lyricist;
    }
    @Override
    public String toString() {
        return "Musical [composer=" + composer + ", lyricist=" + lyricist + "]";
    }
} 

public class Plays {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Play[] p=new Play[3];
        Play[] p1=new Musical[2];
        int a[]=new int[3];
        int b[]=new int[2];
        int w=0;
        int v=0;
        int perform=0;
        for(int i=0;i<3;i++){
            Play c=new Play();
            p[i]=c;
            System.out.print("Enter number of seats booked for Play "+(i+1)+" : ");
            a[i]=sc.nextInt();
            w+=a[i];
            perform++;
        }
        for(int i=0;i<2;i++){
            Play d=new Musical();
            p1[i]=d;
            System.out.print("Enter number of seats booked for Musical "+(i+1)+" : ");
            b[i]=sc.nextInt();
            v+=b[i];
            perform++;
        }
        System.out.println("The total number of plays: "+perform);
        System.out.println("The total box offics collection: "+(500*w+800*v));

    }    
}
