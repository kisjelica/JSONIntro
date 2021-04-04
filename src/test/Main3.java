package test;

import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import movie.Movie;

public class Main3 {

	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.setImdbId("tt0112471");
		m1.setTitle("Before Sunrise");
		m1.setReleaseYear(1995);
		Movie m2 = new Movie();
		m2.setImdbId("tt0381681");
		m2.setTitle("Before Sunset");
		m2.setReleaseYear(2004);
		Movie m3 = new Movie();
		m3.setImdbId("tt2209418");
		m3.setTitle("Before Midnight");
		m3.setReleaseYear(2013);

		//Movie[] movies = new Movie[] { m1, m2, m3 };
		List<Movie> movies = new LinkedList<Movie>();
		movies.add(m1);
		movies.add(m3);
		movies.add(m2);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try (FileWriter fw = new FileWriter("many_movies.json")) {
			gson.toJson(movies, fw);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
