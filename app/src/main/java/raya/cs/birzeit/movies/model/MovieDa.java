package raya.cs.birzeit.movies.model;

import java.util.ArrayList;
import java.util.List;

public class MovieDa implements IMovieDa {
    private ArrayList<Movie>movies=new ArrayList<>();

    public  MovieDa(){
        movies.add(new Movie("cat people","Horror","1942"));
        movies.add(new Movie("black sunday","Horror","1960"));
        movies.add(new Movie("the great dictator","Comedy","1940"));
        movies.add(new Movie("light up the sky","Comedy","1960"));
        movies.add(new Movie("there's something about mary","Comedy","1998"));
        movies.add(new Movie(" the godfather","Drama","1972"));
        movies.add(new Movie("the shawshank redemption","Drama","1994"));


    }
    public List<Movie>getMovies(String cat){
        ArrayList<Movie>data=new ArrayList<>();
        for (Movie m:movies){
            if
            (m.getTitle().equals(cat))
                data.add(m);
            else
                if (m.getYear().equals(cat))
                data.add(m);
                else
                    if(m.getType().equals(cat))
                    data.add(m);


        }
        return  data;

        }

    @Override
    public String[] getTitle() {
        String[] cats = new String[]{
                "Cat People", "Black Sunday", "The Great Dictator","There's Something About Mary","The Godfather","The Shawshank Redemption","Light up the Sky"};

        return cats;
    }
@Override
    public  String[]getYear(){
        String[]cats=new String[]{
                "1942","1960","1940","1998","1972","1994"};
        return  cats;

        }
        @Override
    public String[]getType(){
        String[]cats=new String[]{
                "Horror","Comedy","Drama"};
        return  cats;



}

}
