import java.util.*;

class Post{
    int postId;
    int likesCount;
    int commentsCount;
    public int getLikes(){
        return likesCount;
    }
    public int getComments(){
        return commentsCount;
    }
}

class User extends Post{
    private String password;
    String username;
    private int p;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public int value(){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter '1' to like| '2' to comment| '3' to both: ");
       int p=sc.nextInt();
       return p;
    }
    public void tolikecom(int p){       
        if (p==1)
        System.out.print("Likes: " + (++likesCount));
        else if(p==2)
        System.out.print("Comment: " + (++commentsCount));
        else if(p==3)
        System.out.print("Likes: " + (++likesCount) + "\n" + "Comments: " + (++commentsCount));
        else 
        System.out.print("Put valid number");
    }
}

public class Second{
    public static void main(String args[]){
       User obj=new User();
       obj.setPassword("******");
       obj.username="Nirmitee123";
       System.out.println("The username is: " + obj.getUsername());
       obj.likesCount=602;
       obj.commentsCount=102;
       System.out.println("Likes: " + obj.getLikes());
       System.out.println("Comments: " + obj.getComments());

       obj.tolikecom(obj.value());
    }
}
