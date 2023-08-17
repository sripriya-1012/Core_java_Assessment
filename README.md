# Core_java_Assessment
The following assessment depicts the abstract factory pattern of a Bank account. 
Here, I have created an interface for bank called ABCBank. 
Then I have created 3 types of acccounts as abstract class namely Current,Savings and loan. 
These 3 abstract classes implement the methods createAccount() , getValues() and interestRate() of ABCBank Interface. 
Then I created one user for each account therefore 3 users that has a method details() to get user details to create account in the bank. 
In each abstract class, I have used getValues function to get the principal amount, Rate of interest and time period from user. 
The users extend their parent account type to create account. Eg: User1 extends saving. 
Finally user can create an account, provide thier details and provide values to calculate the interest rate. 
Please ping me if you have any doubts! 
My CSID: sbv@ford.com 
