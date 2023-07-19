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

    // getReviews and setStars are in the Business class

    public void addReview(Review review) {
        super.getReviews().add(review);

        int total = 0;
        for (Review theaterReview : super.getReviews()) {
            total += theaterReview.getNumberOfStars();
        }

        super.setStars((float) total / super.getReviews().size());
    }

}







