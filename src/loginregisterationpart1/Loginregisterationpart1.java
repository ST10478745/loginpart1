/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginregisterationpart1;

/**
 *
 * @author KatlegoMabe
 */
import java.util.Scanner;
public class Loginregisterationpart1 {
  //new project class name  
  
    //string 
 public static String registerUser(String username, String password){
     // Check if the provided username is valid based on the checkUserName method.
        boolean isUsernameValid = checkUserName(username);
        // Check if the provided password meets the complexity requirements defined by checkPasswordComplexity.
        boolean isPasswordValid = checkPasswordComplexity(password);
        // If both the username and password are valid, registration is successful.
        if (isUsernameValid && isPasswordValid){
          return "Registration successful.";
          // If neither the username nor the password is valid, return a combined error message.
        }else if (!isUsernameValid && !isPasswordValid){
           return "Username is not correctly formatted, please ensure that your username contaians an underscore and is more than five characters in length." 
                   +"Password is not correctly formatted; please ensure that the password contains at least eight characters, & capital letter, a number, and a special character."; 
           // If only the username is invalid, return an error message specific to the username format.
        } else if (!isUsernameValid){
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five character in length.";
            // If only the password is invalid, return an error message detailing the password requirements.
        }else {
           return "Password is not correctly formatted; please ensure  that the password contains atleast eight characters, a capital letter, a number, and a special character";  
        }
    }
    
    //Validating username formatted
    public static String validateUsername(String username){
        // Check if the username contains an underscore "_" AND its length is less than or equal to 5.
        if (username.contains("_") && username.length() <=5) {
            // If both conditions are true, the username is considered successfully captured.
            return "Username successfully captured.";
        } else {
          // If either condition is false, the username format is incorrect.  
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }
    }
    //Validating username formatted
    public static String validatePassword(String password) {
        // Check if the password contains at least one uppercase letter using a regular expression.
        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasNumber = password.matches(".*[0-9].*");
        // Check if the password contains at least one special character from the defined set using a regular expression.
        boolean hasSpecial = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*");
        boolean isLongEnough = password.length() >= 8;
    // If the password satisfies all the complexity requirements (uppercase, number, special character, and minimum length), it's considered valid.
        if (hasUppercase && hasNumber && hasSpecial && isLongEnough) {
           return "Password successfully captured.";
        } else {
    // If any of the complexity requirements are not met, return an error message explaining the password format requirements.
           return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a specail character.";
        }   
    }
     //Rule for Username: contains underscore and <= 5 characters
    public static boolean checkUserName(String username) {
       return username.contains("_") && username.length() <= 5;
    }
    public static boolean checkPasswordComplexity(String password){
       boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasNumber = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*");
        boolean isLongEnough = password.length() >= 8;
         return hasUppercase && hasNumber && hasSpecial && isLongEnough;
    }
            
      //check cell phone number (e.g., +27698453348)
    public static boolean checkCellPhoneNumber(String phoneNumber){
      // Define a regular expression to validate the phone number format.
    // It expects a '+' sign, followed by 1 to 3 digits for the country code,
    // and then 1 to 10 digits for the phone number itself.
      String regex = "^\\+\\d{1,3}\\d{1,10}$";    // +country_code + number
      // Remove all non-digit characters from the phone number to count only the digits.
      String digitsOnly = phoneNumber.replaceAll("[^\\d]","");
      // The phone number is considered valid if it matches the defined regex pattern
    // AND the number of digits (after removing non-digit characters) is no more than 13.
      return phoneNumber.matches(regex) && digitsOnly.length() <=13;
    }
    public static boolean loginUser(String registeredUsername,String registeredPassword, String enteredUsername, String enteredPassword) {
        // Check if the entered username exactly matches the registered username
    // AND if the entered password exactly matches the registered password.
    // Returns true if both username and password match, false otherwise.
        return registeredUsername.equals(enteredUsername) && registeredPassword.equals(enteredPassword);
    }
    public static String returnLoginStatus(String registeredUsername, String registeredPassword, String enteredUsername, String enteredPassword, String firstname, String lastname) {
        // Call the loginUser method to check if the provided login credentials are valid.
     if (loginUser(registeredUsername, registeredPassword, enteredUsername, enteredPassword)){
         return "*****Login Successful*****\nWelcome back, " + firstname + " " + lastname + "!";
     } else{
          // If loginUser returns false (credentials are invalid), return a failure message
        // indicating that the username or password was incorrect.
         return "Login failed; Username or password incorrect."; 
     }
    }   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Create a Scanner object to read user input from the console  
        Scanner input = new Scanner(System.in);
        
     // Prompt the user to enter their first name and store it
        System.out.println("Enter your First Name:");
        String firstname = input.nextLine();
        
        // Prompt the user to enter their last name and store it
        System.out.println("Enter your Last Name:");
        String lastname = input.nextLine();
        
        //--- Username input with validation---
        String username;
        while (true) {
            System.out.print("Enter your username: ");
            username = input.nextLine();
            
            // Check if username meets the required format using the checkUserName() method
            if (checkUserName(username)) {
                System.out.println("Username successfully captured.");
                break;// Exit the loop if valid
            } else {
                // Display error message if username format is incorrect
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length");
            }
        }
        
        // --- Password input with validation ---
        String password;
        while (true) {
            // Ask user to input a password
            System.out.println("Enter your password");
            password = input.nextLine();
            // Check password complexity using the checkPasswordComplexity() method
            if (checkPasswordComplexity(password)) {
                System.out.println("Password successfully captured.");
                break; // Exit the loop if valid
            } else {
                System.out.println("Username is not correctly formatted,please ensure that the password contains at least eight characters, a capital letter, a number, and a specail character.");
            }    
        }
        
        // ---Cellphone number input with validation ---
        String phoneNumber;
        while (true) {
            // Ask user to input their cell phone number with international code
            System.out.println("Enter your cell phone number with international code (e.g., +27698453348): ");
            phoneNumber = input.nextLine();
            if (checkCellPhoneNumber(phoneNumber)) {
                System.out.println("Cell phone number successfully added.");
                break;// Exit loop if valid
            } else {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            }
        }
        
        // Confirmatin of registration
        // Simulate user registration confirmation (function not actually called here)
        System.out.println("registerUser(username, password)"); 
        
        System.out.println("\n----- Login Section -----");
        
        // Loop to allow repeated login attempts
       while (true)  {
        System.out.println("Enter your username to login: ");
        String enteredUsername = input.nextLine();
        
        System.out.println("Enter your password to login: ");
        String enteredPassword = input.nextLine();
        
        // Check credentials using loginUser() method
        if (loginUser(username, password, enteredUsername, enteredPassword)) {
            System.out.println("*****Login Successful*****");
            System.out.println("Welcome back, " + firstname + " " + lastname + "! ,"+ " it's nice to see you again!!");
            break; //Exit the login loop
        } else {
            // Show error message and allow retry
            System.out.println("Login failed: Username or password incorrect.");
            System.out.println("Please try again.\n");
        }
    } //closed login
    }
    
}
