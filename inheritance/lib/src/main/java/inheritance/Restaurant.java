package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private float numberOfStars;
    private String price;
    private List<Review> reviews;

    public Restaurant(String name, String price) {
        this.name = name;
        this.price = price;
        this.numberOfStars = 0.0f;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
            float sumStars = 0;
            for (Review arrayReview : reviews) {
                sumStars += arrayReview.getNumberOfStars();
            }
            numberOfStars = sumStars / reviews.size();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public float getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(float numberOfStars) {

        this.numberOfStars = numberOfStars;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + numberOfStars +
                ", price='" + price + '\'' +
                '}';
    }
}
