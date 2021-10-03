package domain;

public class Movie {
    private int id;
    private String imgUrl;
    private String title;
    private String genre;

    public Movie(int id, String imgUrl, String title, String genre) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.title = title;
        this.genre = genre;
    }
}
