package inheritance;
import inheritance.Review;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {
    @Test void shopReview() {
        Shop shop = new Shop("Stores", "Test", "$");
        Review wholeFoods = new Review("Good!", "Jenny", 4);
        Review traderJoes = new Review("Great!", "James", 5);

        shop.addReview(wholeFoods);
        shop.addReview(traderJoes);

        System.out.println(shop);
        System.out.println("Stars: " + shop.getStars());

        assertEquals(4.5, shop.getStars());
    }
}
