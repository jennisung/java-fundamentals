package inheritance;
import inheritance.Theater;

public class TheaterTest {
    @Test void addMovie() {
        Theater theater = new Theater("AMC", "Test", "$");
        theater.addMovie("Spiderman");
        theater.addMovie("Batman");

        System.out.println(theater);

        assertEquals(2, theater.getMovies().size());
        assertEquals(true, theater.getMovies().contains("Spiderman"));
        assertEquals(true, theater.getMovies().contains("Batman"));
    }

    @Test void removeMovie() {
        Theater theater = new Theater("AMC", "Test", "$");
        theater.addMovie("Spiderman");
        theater.addMovie("Batman");

        theater.removeMovie("Spiderman");

        System.out.println(theater);

        assertEquals(1, theater.getMovies().size());
        assertEquals(false, theater.getMovies().contains("Spiderman"));
        assertEquals(true, theater.getMovies().contains("Batman"));
    }
}

    @Test void addReview() {
        Theater theater = new Theater("AMC", "Test", "$");
        Review jenny = new Review("Great!", "Jenny", 5);
        Review james = new Review("Nice!", "James", 2);

        theater.addReview(jenny);
        theater.addReview(james);

        System.out.println(theater);
        System.out.println("Stars: " + theater.getStars());

        float expectedStars = (jenny.getNumberOfStars() + james.getNumberOfStars()) / 2.0f;

        assertEquals(expectedStars, theater.getStars(), 0.01);
    }



}
