package Java_ProjectHobby;
import Java_ProjectHobby.Hobby;
import Java_ProjectHobby.Fishing;

public class App
{
    public static void main( String[] args )
    {
        Hobby fishing = new Fishing(5.0f,"Fishing", 200);
        Hobby football = new Football("Football",500, "Chelsea",10);
    Hobby[]array={fishing, football} ;
        for (Hobby temp:array) {
            temp.tell_about_hobby();
        }
    }

}
