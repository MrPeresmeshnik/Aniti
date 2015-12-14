import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MSI on 14.12.2015.
 */
@WebServlet(name = "ServletRandom", urlPatterns = "/random")
public class ServletRandom extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<FindAnime> findAnimeList = new ArrayList<>();
        try {
            findAnimeList.add(DBAnime.getRandom());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        request.setAttribute("animeList", findAnimeList);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}
