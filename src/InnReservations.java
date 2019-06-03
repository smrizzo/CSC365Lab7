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

        while(strarray[0].equals("exit")) {
            System.out.println("MENU:\n");
            System.out.println("(1) Rooms and Rates\n");
            System.out.println("(2) Reservations\n");
            System.out.println("(3) Reservation Change\n");
            System.out.println("(4) Reservation Cancellation\n");
            System.out.println("(5) Revenue\n");

            if (strarray[0].equals("1")) {
                System.out.println("Room Popularity");
                System.out.println("next available check-in data");
                System.out.println("length");

            } else if (strarray[0].equals("2")) {


                System.out.println("First Name\n");
                String first = inp.nextLine();
                System.out.println("Last Name");
                String last = inp.nextLine();
                System.out.println("Room Code");
                String roomcode = inp.nextLine();
                System.out.println("Bed Type");
                String bedtype= inp.nextLine();
                System.out.println("Beginning Day of Stay");
                String start = inp.nextLine();
                System.out.println("Ending Day of Stay");
                String end = inp.nextLine();
                System.out.println("Number of Children");
                String numchild = inp.nextLine();
                System.out.println("Number of Adults");
                String numadult = inp.nextLine();


            } else if (strarray[0].equals("3")) {

                System.out.println("First Name\n");
                String first = inp.nextLine();
                System.out.println("Last Name");
                String last = inp.nextLine();
                System.out.println("Room Code");
                String roomcode = inp.nextLine();
                System.out.println("Bed Type");
                String bedtype= inp.nextLine();
                System.out.println("Beginning Day of Stay");
                String start = inp.nextLine();
                System.out.println("Ending Day of Stay");
                String end = inp.nextLine();
                System.out.println("Number of Children");
                String numchild = inp.nextLine();
                System.out.println("Number of Adults");
                String numadult = inp.nextLine();


            } else if (strarray[0].equals("4")) {

                System.out.println("Reservation Code\n");
                String rescode = inp.nextLine();
                System.out.println("Would You Like to Cancel. Yes or No");
                String choice = inp.nextLine();


            } else if (strarray[0].equals("5")) {

                System.out.println("First Name\n");
                String first = inp.nextLine();
                System.out.println("Last Name");
                String last = inp.nextLine();
                System.out.println("Range of Dates");
                String dateRange = inp.nextLine();
                System.out.println("Room Code");
                String RoomCode inp.nextLine();
                System.out.println("Reservation Code");
                String ResCode = inp.nextLine();


            } else if (strarray[0].equals("6")) {


            } else {
                System.out.println("invalid Input\n");
            }

        }


    }
}
