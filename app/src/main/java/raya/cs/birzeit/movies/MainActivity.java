package raya.cs.birzeit.movies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import android.widget.Toast;

import java.util.List;


import raya.cs.birzeit.movies.model.IMovieDa;
import raya.cs.birzeit.movies.model.Movie;
import raya.cs.birzeit.movies.model.MovieFactory;



public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    EditText edtShow;
    EditText edtMovie;
    Button btnGetMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        edtMovie = findViewById(R.id.edtMovie);
        edtShow = findViewById(R.id.edtShow);

        populateSpinner();
    }

    private void populateSpinner() {
        MovieFactory factory = new MovieFactory();
        IMovieDa objMovie = factory.getModel();

        String[] cats = objMovie.getType();


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, cats);

        spinner.setAdapter(adapter);
    }


    public void btnGetMovieOnClick(View view) {

        MovieFactory factory = new MovieFactory();
        IMovieDa objMovie = factory.getModel();

        // String item = "";
        if (edtMovie.getText().toString().isEmpty()) {
            spinner.getSelectedItem().toString();
            {
                String item;


                item = spinner.getSelectedItem().toString();

                List<Movie> movies = objMovie.getMovies(item);

                String str = "";
                for (Movie b : movies) {
                    str += b.getTitle() + " " + b.getYear() + " " + b.getType() + "\n";

                    edtShow.setText(str);
                }
            }
        } else {




            String item =edtMovie.getText().toString();


        List<Movie> movies = objMovie.getMovies(item);



        String str = "";

        for (Movie b : movies) {
            if(b.getTitle().equals(item)) {
                str += b.getTitle()+" " + b.getYear()+" " + b.getType() + "\n";

            }
            else if(b.getYear().equals(item)){
                str += b.getTitle()+" " + b.getYear() +" "+ b.getType() + "\n";

            }
           edtShow.setText(str);

        }

        }
        edtMovie.setText("");

    }
}