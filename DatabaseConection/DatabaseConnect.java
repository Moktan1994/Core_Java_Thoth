package DatabaseConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnect {

public static void main(String args[]){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/minitable","root","Moktan@131");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from minitable");
                while(rs.next())
                    //if(rs.getInt(1) == 7 || rs.getString(2).equalsIgnoreCase("MO")) {
                      //  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
                        System.out.println(rs.getInt("serialnum")+"  "+rs.getString("nameoffood")+"  "+rs.getString("quantity"));
                    //}
                con.close();
            }catch(Exception e) {
                System.out.println(e);
            }
    }
}
