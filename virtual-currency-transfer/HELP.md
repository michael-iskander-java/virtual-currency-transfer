# Getting Started

1. Run SQL statements, located in the file '\virtual-currency-transfer\src\main\resources\SQL\virtual_currency.sql', in MySQL database to create 'virtual_currency' database and the three tables, account, transaction, and transaction_recipient.

2. Table 'account' contains the data of the account: user name, email, hashed password, user id (will be sent in the header of the requests), balance of the virtual currency (vc), and the creation date of the account.

	


3. Table 'transaction' contains the data of the transaction: total amount of the transaction (total_amount), the date and time of the transaction (transaction_date), and the account id that initiated the transaction (account_id).


4. Table 'transaction_recipient' contains the data of the accounts that received the transaction: amount of each transaction item , the id of the user who received the amount of transaction item (user_id), and the transaction id which this transaction item belongs to.



5. Clone the repository.

6. The application contains a scheduler (located in \virtual-currency-transfer\src\main\java\io\blockchaingroup\vc\virtualcurrencytransfer\AccruingVCTask.java) for accruing to every user 0.25 VC every 30 minutes.

7. The application contains five services.

8. 'http://localhost:8080/addaccount' service for creating a new account and the body of the request is:
	
 {
        "userName": "Mark",
        "email": "mark@gmail.com",
        "passowrd": "66778900"
    }
	
	the user name should have at least 2 characters.
	email must be a valid email.
	password should have 8 characters.
	


9. 'http://localhost:8080/accounts' service for retrieving all accounts.

10. 'http://localhost:8080/sendVc' service for sending an amount of VC to up to 10 users. The request is as follows:

	user_id of the sender account is sent in the header of the request and the list of recipient accounts is sent in the body as:
	
	[
    {
        "userId": "usr-1",
        "transferredAmount": 20
    },
    {
        "userId": "usr-2",
        "transferredAmount": 10
    }

]

11. 'http://localhost:8080/sentTransactions' service is for retrieving a list of all transactions that are sent by the user_id. The user_id is sent in the header of the request. 

12. 'http://localhost:8080/receivedTransactions' service is for retrieving a list of all transactions that are received by the user_id. The user_id is sent in the header of the 		request. 

13. A collection of the requests of the above services is saved in the folder '\virtual-currency-transfer\src\main\resources\Postman_Requests'. You can import it in Postman and test the services.
