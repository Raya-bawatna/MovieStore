package raya.cs.birzeit.movies.model;

import java.util.List;

public interface IMovieDa {
    List<Movie> getMovies(String cat);

    String[]getTitle();

    String[]getYear();

    String[]getType();
}
