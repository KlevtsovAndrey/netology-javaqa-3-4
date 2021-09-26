package manager;

import domain.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class PosterManagerTest {
    private final PosterManager manager = new PosterManager();
    private final Movie firstMovie = new Movie(1);
    private final Movie secondMovie = new Movie(2);
    private final Movie thirdMovie = new Movie(3);
    private final Movie fourthMovie = new Movie(4);
    private final Movie fifthMovie = new Movie(5);
    private final Movie sixthMovie = new Movie(6);
    private final Movie seventhMovie = new Movie(7);
    private final Movie eighthMovie = new Movie(8);
    private final Movie ninthMovie = new Movie(9);
    private final Movie tenthMovie = new Movie(10);
    private final Movie eleventhMovie = new Movie(11);

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
    public void ShouldAdd() {
        Movie[] actual = manager.getPosters();
        Movie[] expected = new Movie[]{firstMovie, secondMovie, thirdMovie, fourthMovie, fifthMovie, sixthMovie,
        seventhMovie, eighthMovie, ninthMovie, tenthMovie, eleventhMovie};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldReturnLastTenMoviesFromTheEnd(){
        manager.getLast(10);
        Movie[] actual = manager.getPosters();
        Movie[] expected = new Movie[]{eleventhMovie, tenthMovie, ninthMovie, eighthMovie, seventhMovie, sixthMovie,
        fifthMovie, fourthMovie, thirdMovie, secondMovie};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void ShouldReturnLastFiveMoviesFromTheEnd() {
        manager.getLast(5);
        Movie[] actual = manager.getPosters();
        Movie[] expected = new Movie[]{eleventhMovie, tenthMovie, ninthMovie, eighthMovie, seventhMovie};
        assertArrayEquals(expected, actual);
    }
}