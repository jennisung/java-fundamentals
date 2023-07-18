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