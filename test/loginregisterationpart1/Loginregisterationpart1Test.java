/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package loginregisterationpart1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author KatlegoMabe
 */
public class Loginregisterationpart1Test {
    
    public Loginregisterationpart1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of registerUser method, of class Loginregisterationpart1.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String expResult = "";
        String result = Loginregisterationpart1.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateUsername method, of class Loginregisterationpart1.
     */
    @Test
    public void testValidateUsername() {
        System.out.println("validateUsername");
        String username = "";
        String expResult = "";
        String result = Loginregisterationpart1.validateUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validatePassword method, of class Loginregisterationpart1.
     */
    @Test
    public void testValidatePassword() {
        System.out.println("validatePassword");
        String password = "";
        String expResult = "";
        String result = Loginregisterationpart1.validatePassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class Loginregisterationpart1.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        boolean expResult = false;
        boolean result = Loginregisterationpart1.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Loginregisterationpart1.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        boolean expResult = false;
        boolean result = Loginregisterationpart1.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhoneNumber method, of class Loginregisterationpart1.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String phoneNumber = "";
        boolean expResult = false;
        boolean result = Loginregisterationpart1.checkCellPhoneNumber(phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Loginregisterationpart1.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String registeredUsername = "";
        String registeredPassword = "";
        String enteredUsername = "";
        String enteredPassword = "";
        boolean expResult = false;
        boolean result = Loginregisterationpart1.loginUser(registeredUsername, registeredPassword, enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Loginregisterationpart1.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String registeredUsername = "";
        String registeredPassword = "";
        String enteredUsername = "";
        String enteredPassword = "";
        String firstname = "";
        String lastname = "";
        String expResult = "";
        String result = Loginregisterationpart1.returnLoginStatus(registeredUsername, registeredPassword, enteredUsername, enteredPassword, firstname, lastname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Loginregisterationpart1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loginregisterationpart1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
