
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // load
        Class.forName("com.mqsql.jdbc.Driver");

        // connection established
        Connection con = DriverManager.getConnection("jdbc::mysql://localhost:3306/springmvc", "root", "password");

        // create a query and statement
        String sql = "SELECT * FROM student";
        Statement st = con.createStatement();
        ResultSet set = st.executeQuery(sql);
        
        // process the data
        while (set.next()) {
            System.out.println(set.getInt(1) + " " + set.getString(2));
        }

        // close connections
        con.close();
    }
}