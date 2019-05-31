import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InnReservations {

    public static void main(String[] args) {

        //Going to start by planning this out tonight with possible design patterns
        //create and insert tables
        //Get connection on model

        InnController controller = new InnController();

        System.out.println("WE are working");

        try{

            Connection con = DriverManager.getConnection(
                    "","","");

            Statement stmt=con.createStatement();
            System.out.println("Got passed connection");
            ResultSet rs = stmt.executeQuery("select * from lab7_rooms");
            System.out.println(rs);
            System.out.println("Got passed query");
//            while(rs.next())
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+
//                        "  "+rs.getString(5)+"  "+rs.getString(6));
            System.out.println("RoomName Beds bedType maxOcc basePrice decor");
            while(rs.next()) {
                String roomName = rs.getString("RoomName");
                int Beds = rs.getInt("Beds");
                String bedType = rs.getString("bedType");
                int maxOcc = rs.getInt("maxOcc");
                double basePrice= rs.getDouble("basePrice");
                String decor = rs.getString("decor");
                System.out.println(roomName + " | " +  Beds + " | " + bedType + " | " + maxOcc + " |  " + basePrice + " | " + decor);
            }
            con.close();
        }catch(Exception e){
            System.out.println("Something bad happened");
        }
    }

}
