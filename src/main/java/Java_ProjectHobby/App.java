package Java_ProjectHobby;

import java.sql.SQLOutput;

public class App
{
    public static void main( String[] args )
    {
        Hobby fishing = new Fishing(5.0f,"Fishing", 200);
        Hobby football = new Football("Football",500, "Chelsea",10);
    try{
        fishing.tell_about_hobby(21);
    }
    catch(hobby_exception ex){
        System.out.println(ex.getMessage());
        System.out.println("Error");
    }
    finally{
        System.out.println("End");
    }
    }
}
