package inheritance;
import inheritance.Theater;

public class TheaterTest {
    public static void main(String[] args) {
        Theater theater = new Theater("AMC", "test", "$");

        theater.addMovie("Spiderman ");
        theater.addMovie("Batman");

        theater.removeMovie("Batman");

        MovieReview spiderman = new MovieReview("Great!", "Jennifer", 5, "Spiderman");
        MovieReview batman = new MovieReview("Meh.", "John", 3, "Batman");

        theater.addReview(spiderman);
        theater.addReview(batman);

        System.out.println(theater);

        System.out.println("Review: " + theater.getStars());
    }
}
