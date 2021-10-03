package manager;

import domain.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class PosterManagerTestWithDefaultNumberOfMovies {
    private final PosterManager manager = new PosterManager();
    private final Movie firstMovie = new Movie(1, "http", "Шрэк", "мультик");
    private final Movie secondMovie = new Movie(2, "http", "Шрэк 2", "мультик");
    private final Movie thirdMovie = new Movie(3, "http", "Шрэк Третий", "мультик");
    private final Movie fourthMovie = new Movie(4, "http", "Шрэк Навсегда", "мультик");
    private final Movie fifthMovie = new Movie(5, "http", "Кот в сапогах", "мультик");
    private final Movie sixthMovie = new Movie(6, "http", "Ледниковый период", "мультик");
    private final Movie seventhMovie = new Movie(7, "http", "Ледниковый период 2", "мультик");
    private final Movie eighthMovie = new Movie(8, "http", "Ледниковый период 3", "мультик");
    private final Movie ninthMovie = new Movie(9, "http", "Ледниковый период 4", "мультик");
    private final Movie tenthMovie = new Movie(10, "http", "Ледниковый период 5", "мультик");
    private final Movie eleventhMovie = new Movie(11, "http", "Вверх", "мультик");

    @BeforeEach
    public void setUp() {
        manager.add(firstMovie);
        manager.add(secondMovie);
        manager.add(thirdMovie);
        manager.add(fourthMovie);
        manager.add(fifthMovie);
        manager.add(sixthMovie);
        manager.add(seventhMovie);
        manager.add(eighthMovie);
        manager.add(ninthMovie);
        manager.add(tenthMovie);
        manager.add(eleventhMovie);
    }

    @Test
    public void shouldReturnLastTenMoviesFromTheEnd(){
        Movie[] actual = manager.getLast();
        Movie[] expected = new Movie[]{eleventhMovie, tenthMovie, ninthMovie, eighthMovie, seventhMovie, sixthMovie,
        fifthMovie, fourthMovie, thirdMovie, secondMovie};
        assertArrayEquals(actual, expected);
    }
}