####README:
Eddie Ngo s3784777

The contents of this project is to make a hot-desking system where users are able to book their seats safely due to covid restrictions.
There are multiple sub-categories related to this topic, "Connection" is based on the system linking up to the database (in SQLite).
"Controllers" are the files that are used for the "FXML" GUI. Making the FXML files give a framework on how the GUI will look and having a "Controller" applied to it,
will allow it to achieve button clicks or minimizing the application. 

##Steps to be taken in order to run the application:
1. Correctly configure the SDK and Modules and Program Language.
2. Initialise the database. 
3. Run the Main.java file

(1):
- Download JavaFX-SDK-16 / or any other version
- Make sure that you configure the library with JavaFX, Configure Program and Module settings to verify that you can run the program. 
- Apply the VM options so that the system knows how to run the JAVAFX commands. 
- A link that may help \ is referenced from. > https://www.jetbrains.com/help/idea/javafx.html


##Examples of execution:
1. Login
2. Register
3. Application
4. Database
![app still in development](https://user-images.githubusercontent.com/80662246/121694432-77ceff80-cb0d-11eb-9ad9-4e887f24351a.PNG)
![DATABASE](https://user-images.githubusercontent.com/80662246/121694445-7a315980-cb0d-11eb-88b2-8eed8ebab2a1.PNG)
![Login](https://user-images.githubusercontent.com/80662246/121694450-7ac9f000-cb0d-11eb-9b1a-bd9b9491f047.PNG)
![SIGN UP](https://user-images.githubusercontent.com/80662246/121694451-7bfb1d00-cb0d-11eb-8de5-86ba47516fa0.PNG)

##Known bugs:
- When the scene changes to another one, the previous scene does not get deleted creating more load for the computer.
- There is no booking system, user creation, or other major implementations available

##Things that have not been working lately or completed at all: (TO-DO)
- Booking function
- Admin users
- Function of FXML within another FXML
- Quality of life menu functions (like going back and thru with a back button)
- Booking Covid restrictions with colours 
- Physical Topology of the Booking (with extra diagrams)

