package raya.cs.birzeit.movies.model;

public class MovieFactory {
    public IMovieDa getModel(){
        // if statement to check the internet connection

        return new MovieDa();
    }
}
