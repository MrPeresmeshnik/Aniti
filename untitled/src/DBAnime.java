import java.sql.*;
import java.util.Collections;

/**
 * Created by MSI on 14.12.2015.
 */
public class DBAnime {


    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/animebase","root", "root");
    }

    public static int GetAnime(String name) throws SQLException, ClassNotFoundException{
        Connection c = getConnection();
        //PreparedStatement ps = c.prepareStatement("SELECT id,name_en from anime");

        ResultSet resultSet = c.createStatement().executeQuery("SELECT id, name_en FROM anime");//executeQuery("SELECT id,name_en  from anime");
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            System.out.println(id);
            String name_en = resultSet.getString("name_en");

            if(id == 2)
                return 2;
        }

        return 0;
    }

    public static int GG(String txt)
    {
        if(txt.equalsIgnoreCase("no"))
            return 3;
        if(txt.equalsIgnoreCase("yes"))
            return 2;

        return 0;
    }
}
