package com.tts;

import java.util.ArrayList;
import java.util.List;

class NetflixMovie {
	public String title;
	public String producer;

	public NetflixMovie(String title, String producer) {
		this.title = title;
		this.producer = producer;
	}
}

class NetflixMovieLibrary {
	private final List<NetflixMovie> movies;

	public NetflixMovieLibrary(List<NetflixMovie> movies) {
		this.movies = movies;
	}

	public List<NetflixMovie> getTotalNetflixMoviesInNetflixLibrary() {
		return movies;
	}
}

public class Composition {

	NetflixMovie interstellar = new NetflixMovie("Interstellar", "Kip Thorne");
	NetflixMovie blackPanther = new NetflixMovie("Black Panther", "Victoria Alonso");
	
	List<NetflixMovie> allNetflixMovies = new ArrayList<NetflixMovie>();
//	allNetflixMovies.add(interstellar);
//	allNetflixMovies.add(blackPanther);

	NetflixMovieLibrary myLibrary = new NetflixMovieLibrary(allNetflixMovies);
	
}
