package manager;

import domain.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class PosterManagerTestWithChangableNumberOfMovies {
    private final PosterManager manager = new PosterManager(5);
    private final Movie firstMovie = new Movie(1, "http", "Шрэк", "мультик");
    private final Movie secondMovie = new Movie(2, "http", "Шрэк 2", "мультик");
    private final Movie thirdMovie = new Movie(3, "http", "Шрэк Третий", "мультик");
    private final Movie fourthMovie = new Movie(4, "http", "Шрэк Навсегда", "мультик");
    private final Movie fifthMovie = new Movie(5, "http", "Кот в сапогах", "мультик");
    private final Movie sixthMovie = new Movie(6, "http", "Ледниковый период", "мультик");

    @BeforeEach
    public void setUp() {
        manager.add(firstMovie);
        manager.add(secondMovie);
        manager.add(thirdMovie);
        manager.add(fourthMovie);
        manager.add(fifthMovie);
        manager.add(sixthMovie);
    }

    @Test
    public void ShouldReturnLastFiveMoviesFromTheEnd() {
        Movie[] actual = manager.getLast();
        Movie[] expected = new Movie[]{sixthMovie, fifthMovie, fourthMovie, thirdMovie, secondMovie};
        assertArrayEquals(expected, actual);
    }
}