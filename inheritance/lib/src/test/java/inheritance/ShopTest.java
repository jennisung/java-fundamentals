package inheritance;
import inheritance.Review;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {
    public static void main(String[] args) {
        Shop testShop = new Shop("wholefoods", "Test", "$");

        Review first = new Review("Good!", "Jennifer", 5);
        Review second = new Review("Bad.", "James", 3);

        shop.addReview(first);
        shop.addReview(second);

        System.out.println(testShop);

        System.out.println("Review: " + shop.getStars());
    }
}
