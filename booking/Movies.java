package booking;

import java.util.Arrays;
import java.util.ArrayList;

class Movies {
	ArrayList<Movie> list;

	Movies() {
		list = new ArrayList<>();
	}

	Movies(Movie[] list) {
		this.list = new ArrayList<>(Arrays.asList(list));
	}
}
