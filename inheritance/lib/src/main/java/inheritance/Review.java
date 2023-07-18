package inheritance;

public class Review {
    private String text;
    private int numberOfStars;
    private String author;

    public Review(String text, String author, int numberOfStars) {
        this.text = text;
        this.numberOfStars = numberOfStars;
        this.author = author;
    }

    public String getText() {
        return text;
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
                " text =" + text
                '}';
    }
}
