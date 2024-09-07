package DatabaseConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertIntoDatabase {

        public static void main(String args[]) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/minitable","root","Moktan@131");

                //PreparedStatement stmt =
                //	con.prepareStatement("insert into student_details_tbl(name, age) values(?,?)");
                // 1 specifies the first parameter in the query
                //stmt.setString(1, "MO");
                //stmt.setInt(2, 20);

                PreparedStatement stmt =
                        con.prepareStatement("insert into minitable(name, age) values('Mo:mo',21)");

                int i = stmt.executeUpdate();
                System.out.println(i + " records inserted");

                con.close();

            } catch (Exception e) {
                System.out.println(e);
        }
    }
}
