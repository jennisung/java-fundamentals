package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {

    @Test
    public void testAddReview() {
        Restaurant restaurant = new Restaurant("momofuku", "$$$$$");


        Review first = new Review("Taste greats!", "Tom Cuise", 4);
        Review second = new Review("It's okay!", "Leo Decaprio", 3);

//        restaurant.addReview(first);
//        restaurant.addReview(second);

//        assertEquals(3.5f, restaurant.getNumberOfStars());

        restaurant.addReview(first);
        assertEquals(3.5f, restaurant.getNumberOfStars());

        restaurant.addReview(second);
        assertEquals(3.5f, restaurant.getNumberOfStars());

        System.out.println(first.toString());


    }
}
