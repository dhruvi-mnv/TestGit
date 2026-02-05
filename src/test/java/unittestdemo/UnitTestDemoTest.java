/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package unittestdemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dhruv
 */
public class UnitTestDemoTest {
    
    /**
     * Test of Greet method, of class UnitTestDemo.
     */
    @Test
    public void testGreet() {
        UnitTestDemo utd = new UnitTestDemo();
        assertEquals("Hello World!!", utd.greet());
    }
    
}
