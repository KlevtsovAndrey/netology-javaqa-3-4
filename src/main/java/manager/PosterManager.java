package manager;

import domain.Movie;


public class PosterManager {
    private Movie[] posters = new Movie[0];

    public Movie[] getPosters() {
        return posters;
    }

    public void setPosters(Movie[] posters) {
        this.posters = posters;
    }

    public PosterManager() {
    }

    public void add(Movie poster) {
        int length = posters.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        int lastIndex = length - 1;
        tmp[lastIndex] = poster;
        setPosters(tmp);
    }

    public void getLast(int numberOfMovies) {
        Movie[] tmp = new Movie[numberOfMovies];
        for (int i = 0; i < numberOfMovies; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        posters = tmp;
    }
}
