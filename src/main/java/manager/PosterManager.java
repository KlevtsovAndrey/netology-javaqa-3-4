package manager;

import domain.Movie;


public class PosterManager {
    private Movie[] posters = new Movie[0];
    private int limit = 10;

    public Movie[] getPosters() {
        return posters;
    }

    public void setPosters(Movie[] posters) {
        this.posters = posters;
    }

    public PosterManager() {
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(Movie poster) {
        int length = posters.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(posters, 0, tmp, 0, posters.length);
        int lastIndex = length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }

    public Movie[] getLast() {
        int resultLength;
        if (posters.length > limit) {
            resultLength = limit;
        } else {
            resultLength = posters.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];
        }
        return result;
    }
}
