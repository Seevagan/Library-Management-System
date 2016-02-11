# Library-Management-System
Application for managing library system 

Set up insetrctions:
Database setup instructions:

1.Open the DB console
2.Type:
	> delimiter //
3.Copy the commands in schema.txt file and hit enter this will create 7 tables and 2 triggers as per the Project schema requirement

Fornt end set up instructions:	
1.The application is Java based application developed on NET BEANS IDE version 7.4 and MySQL Server 5.6
2.Attached folder has the Java exported project named dxd132630_LMS which intern has a JavaApplication1 folder
3.Inside the JavaApplication1 folder are the Java source files and related libraries
4.Import java project in Netbeans IDE
5 Change the user name and password as per your DB server user name and password in the .java file as  they are hardcoded.

Desc

Instructions - User (Librarian)
        
The purpose of library management system is manage the library functions such as updating the data for library. The librarian can search for the available books in the library ,book check in, book check out , Adding users to the database as borrowers and calculating fine for the books   that has been returned after due date

Design Decisions and Justifications
This Library management system consists of the following modules
•	Book Search
•	Check Out
•	Check In
•	Borrowers
•	Fine
Book Search
The librarian  can search for the book through this module. He can search for books based on book id or a particular string from author name ,title.
Check Out
when borrower borrows a book from a library ,a entry is made into loans table along with the loan id, card no and due date will be automatically updated as 14 days from the current day.
Check In
When a book is returned back to library, date off check in is updated and he book is made available for other users.      



Borrowers
A new user to the borrower table can be added through this module. Upon adding a new card for the user will be generated.
Fine
Through this module the librarian can check whether the book has been returned to library and he can also check for books that has been returned after due date and he can issue fine to those users and keep track of the payments.
Technical Dependencies:

This Library Management system will require the following software requirements:
•	JAVA 
•	MYSQL 
