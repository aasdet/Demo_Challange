# Demo Challenge

## Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com


## Expectations
We will be evaluating
1. Naming conventions
2. Code readability
3. Code encapsulation
4. Code structure and organization
5. Quality of test cases
6. Variety  of testing types (examples: boundary, happy path, negative, etc) 


## Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

## Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/


## Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo

## Test Cases

1. Check if the user is able to select each of the pizza types in the dropdown menu of Pizza 1.
2. Check if the user is able to select 0, 1 or 2 toppings with all pizza sizes.
3. Check if the user can select each toppings in drop down menu of Toppings 1 
4. Check if the user can select each toppings in drop down menu of Toppings 2
5. Check if the user can still choose toppings when no topping pizza is selected
6. Check if the user can still choose Toppings 2 when one topping pizza is selected
7. Check if the user can enter a positive number in Quantity box
8. Check if the user can enter a negative number in Quantity box
9. Check if the user can enter a fractional number in Quantity box
10. Check if the user can enter a value that is not a number in Quantity box
11. Check if the user enters a quantity value less than a maximum number of pizzas.
12. Check if the cost is correctly calculated based on the selections.
13. Check if the user can modify the Cost value.
14. Check if the user can enter a name using uppercase/lowercase letters and common symbols such as “ - . ` ”
15. Check if the user can enter a valid email address using uppercase/lowercase characters, numbers, and symbols such as “ @ . -  _ ”
16. Check if the user can enter a phone number using 10 digit number
17. Check if the user can enter a value that is not a number in Phone box
18. Check if the user is able to select Credit Card or Cash on Pickup payment options
19. Check if the user is able to select both Credit Card and Cash on Pickup payment options
20. Check if the user can submit an order with the Place Order button.
21. Check if the Place Order button is available after necessary information is entered.
22. Check if the user can reset the entire selection with the Reset button. 
23. Check if a confirmation message is displayed with a valid order.
24. Check if the confirmation message displays correct information such as selected pizza and toppings, quantity, and total amount paid.
25. Check if an error message is displayed with an invalid order.
26. Check if an error message to select a pizza type appears if order has pizza 1 option is Choose Pizza.
27. Check if an error message to select a pizza topping 1 appears if order has toppings 1 is Choose a Toppings 1 and the selected pizza is with 1 or 2 toppings.
28. Check if an error message to select a pizza topping 2 appears if order has  toppings 2 is Choose a Toppings 1 and the selected pizza is with 2 toppings.
29. Check if an error message to increase quantity is displayed if an order with 0 quantity is made.
30. Check  if an error message to enter a valid name is displayed if an order is made with an empty Name field.
31. Check  if an error message to enter a valid email is displayed if an order is made with an incorrect email address.
32. Check  if an error message to enter a valid phone number is displayed if an order is made with an incorrect phone number.
33. Check  if an error message to select payment option is displayed if an order is made without a payment selection.
34. Check if the system accepts an order with invalid data entry that results in an error message.
35. Check if all of the fields are not pre-selected at the page load.
36. Check if the user can close the dialog box after confirmation or error message.
37. Check if the confirmation and error messages appear on the visible screen.
38. Check if the system proceeds to collect the credit card information after selecting the Credit Card payment option.
39. Check if the website is accessible on different browsers.
40. Check if the user is able to change pizza type selection.
41. Check if the user is able to change topping selections.
42. Check if the user is able to change payment option selection.
43. Check if the Name and Email have a maximum of 100 characters.

##Observed Defects

1. All pizza size and topping count combinations are not available.
2. Users can select any topping combinations for any type of pizza option.
3. The quantity section accepts any type of character including negative and fractional numbers.
4. The user can select any number of pizzas without an upper limit.
5. Name section accepts any character string including no name.
6. Email section accepts any character string including invalid email address format. 
7. Phone section accepts any character string. 
8. Order can be placed with both payment options selected and without a payment option selected.
9. Order can be placed with no pizza choice.
10. Order can be placed with no topping selection after a pizza type with 1 or 2 toppings is selected.
11. Reset button does not clear Toppings 1 and Toppings 2 selections.
12. The message does not clarify the total amount with the “$” symbol.
13. Total cost displays in xxx.x format rather than xxx.xx and ignores cents 
14. Order confirmation message does not display selected pizza type or toppings
15. User is not able to change payment option selection without resetting the whole form. 
16. Tax does not apply to the order.
