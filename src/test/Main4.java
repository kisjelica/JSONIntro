package test;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import movie.Movie;

public class Main4 {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("many_movies.json")){
			Gson gson = new Gson();
			
			
			//List<Movie> movies = Arrays.asList(gson.fromJson(fr, Movie[].class));
			Type typeToken = new TypeToken<LinkedList<Movie>>() {}.getType();
			List<Movie> movies = gson.fromJson(fr,typeToken);
			for (Movie movie : movies) {
				System.out.println(movie);
			}
		}catch(Exception e) {
			
			
		}

	}

}
