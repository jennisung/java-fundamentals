package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Business {
    public Shop(String name, String description, String price) {
        super(name, description, price);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price='" + getPrice() + '\'' +
                '}';
    }

    // getReviews and setStars are in the Business class

    public void addReview(Review review) {
        super.getReviews().add(review);

        int total = 0;
        for (Review shopReview : super.getReviews()) {
            total += shopReview.getNumberOfStars();
        }

        super.setStars((float) total / super.getReviews().size());
    }
}


