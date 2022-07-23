# ECommerceApp_AutomationTesting

# Project introduction
This Project requires you to automate and generate a report for a created test plan for an e-commerce application to test all possible test scenarios.

It's required to automate a test plan for an e-commerce application to test all possible test scenarios and test cases for the major functionalities of the e-commerce websiteapp. This E-commerce application has a log-in page w username and password with no extra authentication other than the email password.

The app has displayed items with pricing which when pressed, are added to the user's personal shopping cart. The shopping cart can be then discarded by deleting items or the user can proceed to the payment options. The testing team has created the test protocol with all the testing scenarios and test cases.

You are required to automate all the test cases and generate a testing report w the status of features using each test casescenario status (PASSFAIL), the execution time of the automated test, and the testing steps status (PASSFAIL)

# Project Summary
- Domain Ecommerce

- Sub Domain B2C (Business to Customer)

- Application Online Shopping

- Application Type Public Web Application (Internet Application)

- User InterfaceClient side To perform specified Business operations

- Customer Registration, Customer Login,View Products, Product Search, Advanced Search Shopping Cart (Add Products, Update Quantity, Remove Product)

- Checkout (Change Address, Add Comments, Payment Method, Edit Details, Order Confirmation)

# Test Scenarios
- SC1- User could register with valid data
- SC2- User could log in with valid email and password
- SC3- User could reset hisher password successfully
Note in this case you just need to confirm that this message is displayed Email with instructions has been sent to you.
- SC4- Logged User could search for any product
- SC5- Logged User could switch between currencies US-Euro
- SC6- Logged user could select different Categories
Note Select random category then hover and open sub-Category if found
- SC7- Logged user could filter with color
Note in this case you should select specific category like Apparel  Shoes
- SC8- Logged user could select different tags
- SC9- Logged user could add different products to Shopping cart
- SC10- Logged user could add different products to Wishlist
- SC11- Logged user could add different products to compare list
- SC12- Create successful Order

# The project can be distributed over 3 main tasks:

- Configure a UI Test automation project using Maven and configure all other frameworks/tools dependencies to match the requirements:
    1- Make a new Maven project ready for the selenium framework

    2- Add the required dependencies to the pom.xml file

    3- Configure behavior-driven Framework Structure

- Automate the provided test scenarios/cases to test the major features as per the test scenario:
    1- Write/Code required test scenarios

    2- Automate steps of the test scenario & add expected results, i.e. assertions

    3- Apply POM design pattern

- Generate professional test reports with the status of features and their test scenarios, execution time, and test steps statuses:
    1- Execute the UI automated test suite using Test Runner

    2- Run project with Maven commands

    3- Generate a professional report
