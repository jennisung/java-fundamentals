package inheritance;

public class Review {
    private String body;
    private int numberOfStars;
    private String author;

    public Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.numberOfStars = numberOfStars;
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", stars=" + numberOfStars +
                " body =" + body + '\'' +
                '}';
    }
}
