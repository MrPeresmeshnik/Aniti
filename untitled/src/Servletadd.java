import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by MSI on 14.12.2015.
 */
@WebServlet(name = "Servletadd", urlPatterns = "/add")
public class Servletadd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String title = request.getParameter("search");


        if(DBAnime.GG(title)==2){
            response.sendRedirect("http://ya.ru");
            return;
        }
        /*
       if(title.length()==2){
           response.sendRedirect("http://ya.ru");
           return;
       }*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
