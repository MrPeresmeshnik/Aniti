/**
 * Created by MSI on 14.12.2015.
 */
public class FindAnime {

    private int id;
    private String name_en;
    private String name_ru;
    private String description;
    private String genre;
    private String img;
    public FindAnime(String description, String genre, int id, String name_en, String name_ru,String img) {
        this.description = description;
        this.genre = genre;
        this.id = id;
        this.name_en = name_en;
        this.name_ru = name_ru;
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getName_ru() {
        return name_ru;
    }

    public void setName_ru(String name_ru) {
        this.name_ru = name_ru;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
