package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {

    @Test void restaurantToString() {
        Restaurant restaurant = new Restaurant("KFC", "$");
        String expectedOutput = "Restaurant{name='KFC', stars=0.0, price='$'}";

        System.out.println("Restaurant toString():");
        System.out.println(restaurant.toString());

        assertEquals(expectedOutput, restaurant.toString());

    }

    @Test void reviewToString() {
        Review review = new Review("Good!", "Jennifer Sung", 4);
        String expectedOutput = "Review{author='Jennifer Sung', stars=4 body =Good!'}";

        System.out.println("Review toString():");
        System.out.println(review.toString());

        assertEquals(expectedOutput, review.toString());
    }

    @Test void associationReview() {
        Restaurant restaurant = new Restaurant("nobu", "$$$");
        Review review = new Review("Delicious!", "Alice", 5);

        restaurant.addReview(review);

        assertEquals(5.0f, restaurant.getNumberOfStars());
        assertEquals(1, restaurant.getReviews().size());
        assertTrue(restaurant.getReviews().contains(review));
        assertSame(restaurant, review.getRestaurant());
    }


    @Test
    public testAddReview() {
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



//    @Test void reviewTest() {
//        Review review = new Review("Delicious food!", "Jennifer Sung", 4);
//        String expectedOutput = "Review{" +
//                "body='Delicious food!', " +
//                "author='Jennifer Sung', " +
//                "numberOfStars=4}";
//        assertEquals(expectedOutput, review.toString());
//    }
//}
}

