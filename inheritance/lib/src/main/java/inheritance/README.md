## Lab 06: Composition and Inheritance, Part 1

### Overview 
The architecture of the library includes two main classes: Restaurant and Review.

### Restaurant Class
* List the properties of the restaurant such as name, numberOfStars, price, and reviews 
* The addReview method in the Restaurant class is responsible for associating a new review with the restaurant and updating the star rating based on the average of all the reviews.

### Review Class 
* List the properties of the Reviews like text, numberOfStars, and author. 
* Provides methods to get the review's text, author, and number of stars.

### Test for Restaurant 
* To test, the unit tests is  JUnit Jupiter.
* The testing code checks if the addReview() method in the Restaurant class works correctly by creating a dummy review for the restaurant named "momofuku" and then two different Review objects.

First, it adds the first review to the restaurant and checks if the restaurant's star rating becomes 3.5. Then, it adds the second review and again checks if the restaurant's star rating remains 3.5 (which is the average of two 3-star reviews).

The test uses assertEquals() to compare the expected result (3.5) with the actual restaurant's rating. If the two values match, the test passes; otherwise, it fails and indicates there might be a problem with the addReview() method.


## Lab 07: Composition and Inheritance, Part 2

### Overview of the Architecture:
* Shop Class: The Shop class extends the Business class. It has a constructor to set the shop's name, description, and price using the super keyword to call the parent class's constructor. It also has a toString() method that is overridden to provide a string representation of the shop.
* Theater Class: The Theater class extends the Business class. The Theater class has methods to add and remove movies from the list, and the toString() method is overridden to include the list of movies.
* Business Class: The Business class is the parent class that contains common properties and methods for shops and theaters. It has fields for name, description, price, and a list of Review objects. It also has methods to add and retrieve reviews.
* Review Class: The Review class represents a basic review with fields for body for review, author of the reviewer, and stars for the rating.

### Tests
* To test, the unit tests is  JUnit Jupiter.
* * Each class have a separate test classes to verify the functionality of the corresponding classes.


