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
    
 public static String registerUser(String username, String password){
        boolean isUsernameValid = checkUserName(username);
        boolean isPasswordValid = checkPasswordComplexity(password);
        
        if (isUsernameValid && isPasswordValid){
          return "Registration successful.";
        }else if (!isUsernameValid && !isPasswordValid){
           return "Username is not correctly formatted, please ensure that your username contaians an underscore and is more than five characters in length." 
                   +"Password is not correctly formatted; please ensure that the password contains at least eight characters, & capital letter, a number, and a special character.";    
        } else if (!isUsernameValid){
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five character in length.";
        }else {
           return "Password is not correctly formatted; please ensure  that the password contains atleast eight characters, a capital letter, a number, and a special character";  
        }
    }
    
    //Validating username formatted
    public static String validateUsername(String username){
        if (username.contains("_") && username.length() <=5) {
            return "Username successfully captured.";
        } else {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }
    }
    //Validating username formatted
    public static String validatePassword(String password) {
        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasNumber = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*");
        boolean isLongEnough = password.length() >= 8;

        if (hasUppercase && hasNumber && hasSpecial && isLongEnough) {
           return "Password successfully captured.";
        } else {
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
      String regex = "^\\+\\d{1,3}\\d{1,10}$";    // +country_code + number
      String digitsOnly = phoneNumber.replaceAll("[^\\d]","");
      return phoneNumber.matches(regex) && digitsOnly.length() <=13;
    }
    public static boolean loginUser(String registeredUsername,String registeredPassword, String enteredUsername, String enteredPassword) {
        return registeredUsername.equals(enteredUsername) && registeredPassword.equals(enteredPassword);
    }
    public static String returnLoginStatus(String registeredUsername, String registeredPassword, String enteredUsername, String enteredPassword, String firstname, String lastname) {
     if (loginUser(registeredUsername, registeredPassword, enteredUsername, enteredPassword)){
         return "*****Login Successful*****\nWelcome back, " + firstname + " " + lastname + "!";
     } else{
         return "Login failed; Username or password incorrect."; 
     }
    }   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        System.out.println("Enter your First Name:");
        String firstname = input.nextLine();
        
        System.out.println("Enter your Last Name:");
        String lastname = input.nextLine();
        
        //--- Username input with validation---
        String username;
        while (true) {
            System.out.print("Enter your username: ");
            username = input.nextLine();
            if (checkUserName(username)) {
                System.out.println("Username successfully captured.");
                break;
            } else {
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length");
            }
        }
        
        // --- Password input with validation ---
        String password;
        while (true) {
            System.out.println("Enter your password");
            password = input.nextLine();
            if (checkPasswordComplexity(password)) {
                System.out.println("Password successfully captured.");
                break;
            } else {
                System.out.println("Username is not correctly formatted,please ensure that the password contains at least eight characters, a capital letter, a number, and a specail character.");
            }    
        }
        
        // ---Cellphone number input with validation ---
        String phoneNumber;
        while (true) {
            System.out.println("Enter your cell phone number with international code (e.g., +27698453348): ");
            phoneNumber = input.nextLine();
            if (checkCellPhoneNumber(phoneNumber)) {
                System.out.println("Cell phone number successfully added.");
                break;
            } else {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            }
        }
        
        // Confirmatin of registration
        System.out.println("registerUser(username, password)"); 
        
        System.out.println("\n----- Login Section -----");
        
    while (true)  {
        System.out.println("Enter your username to login: ");
        String enteredUsername = input.nextLine();
        
        System.out.println("Enter your password to login: ");
        String enteredPassword = input.nextLine();
        
        if (loginUser(username, password, enteredUsername, enteredPassword)) {
            System.out.println("*****Login Successful*****");
            System.out.println("Welcome back, " + firstname + " " + lastname + "! ,"+ " it's nice to see you again!!");
            break; //Exit the login loop
        } else {
            System.out.println("Login failed: Username or password incorrect.");
            System.out.println("Please try again.\n");
        }
    } //closed login
    }
    
}
