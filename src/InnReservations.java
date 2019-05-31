import java.util.*;
import java.lang.String;
public class InnReservations {

    public static void main(String[] args) {

        //Going to start by planning this out tonight with possible design patterns
        //create and insert tables
        //Get connection on model

        InnController controller = new InnController();

        System.out.println("WE are working");
    }

    public String parse()
    {
        Scanner inp = new Scanner(System.in);
        String test = inp.nextLine();
        String delims = " ";
        String [] strarray = inp.split(delims);

        System.out.println("MENU:\n");
        System.out.println("(1) Rooms and Rates\n");
        System.out.println("(2) Reservations\n");
        System.out.println("(3) Reservation Change\n");
        System.out.println("(4) Reservation Cancellation\n");
        System.out.println("(5) Revenue\n");

        if(strarray[0].equals("1"))
        {


        }else if(strarray[0].equals("2"))
        {


        }
        else if(strarray[0].equals("3"))
        {


        }
        else if(strarray[0].equals("4"))
        {


        }
        else if(strarray[0].equals("5"))
        {


        }
        else if(strarray[0].equals("6"))
        {


        }
        else
        {
            System.out.println("invalid Input\n");
        }


    }
}
