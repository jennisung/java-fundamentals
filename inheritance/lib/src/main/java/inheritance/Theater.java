package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Business {
    private List<String> movies;

    public Theater(String name, String description, String price) {
        super(name, description, price);
        this.movies = new ArrayList<>();
    }

    public void addMovie(String movie) {
        if (!movies.contains(movie)) {
            movies.add(movie);
        }
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price='" + getPrice() + '\'' +
                ", movies=" + movies +
                '}';
    }
}






