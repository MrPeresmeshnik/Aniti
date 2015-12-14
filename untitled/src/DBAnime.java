/**
 * Created by MSI on 14.12.2015.
 */
public class DBAnime {
    static FindAnime posts;


    public static int GG(String txt)
    {
        if(txt.equalsIgnoreCase("no"))
            return 3;
        if(txt.equalsIgnoreCase("yes"))
            return 2;

        return 0;
    }
}
