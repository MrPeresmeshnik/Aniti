import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by MSI on 14.12.2015.
 */
public class DBAnime {




    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/animebase","root", "root");
    }

    public static List<FindAnime> GetAnime(String name) throws SQLException, ClassNotFoundException{
        Connection c = getConnection();
        List<FindAnime> findAnimeList = new ArrayList<>();
        //PreparedStatement ps = c.prepareStatement("SELECT id,name_en from anime");

        ResultSet resultSet = c.createStatement().executeQuery("SELECT id, name_en, name_ru, description, genre, img FROM anime WHERE name_en like '%" + name + "%' || name_ru like '%" + name + "%' ");//executeQuery("SELECT id,name_en  from anime");
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            findAnimeList.add(new FindAnime(resultSet.getString("description"),resultSet.getString("genre"),resultSet.getInt("id"),resultSet.getString("name_en"),resultSet.getString("name_ru"),resultSet.getString("img")));



            //String name_en = resultSet.getString("name_en");

        }

        return findAnimeList;
    }

    public static FindAnime getRandom() throws SQLException, ClassNotFoundException {
        Connection c = getConnection();
        final Random random = new Random();
        int id = random.nextInt(3) + 1;
        ResultSet resultSet = c.createStatement().executeQuery("SELECT id, name_en, name_ru, description, genre, img FROM anime WHERE id =" + id);

        while(resultSet.next()){
            return new FindAnime(resultSet.getString("description"),resultSet.getString("genre"),resultSet.getInt("id"),resultSet.getString("name_en"),resultSet.getString("name_ru"),resultSet.getString("img"));
        }

        return null;
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
