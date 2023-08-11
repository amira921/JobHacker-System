# Task 1

### **To follow the requirements, I assumed the following:**
- The application comprises two distinct views:
    1. Customer can access these features:
        - Deposit money 
        - Withdraw money 
        - View balance 
        - Calculate Interest 

    2. Employee can access this feature:
        - open a savings account 

- I divided the code in main function into sub-functions:
    1. home: user can choose the account(Customer or Employee)
    2. CaseEmployee: provides employee's feature 
    3. CaseCustomer: provides customer's features  
<br>

- Since the application has two views and no files or database requested, if the customer or employee wants to exit the application, all saved accounts will be removed. When any user wants to exit, the application redirects to the home function again and will not close the application.

- There are no accounts saved so the employee may enter some accounts first.

- The customer cannot access its features before validating the account number. 

- The customer has 3 attempts to enter the account number correctly, and if he fails to do so, the application redirects him to the home function.

- If the user selects invalid options from the menu, the application will display a message and redirect to the menu again.

- The application handles invalid data types entered by the user.