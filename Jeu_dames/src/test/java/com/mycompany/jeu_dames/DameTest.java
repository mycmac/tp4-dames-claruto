/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.jeu_dames;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Clara
 */
public class DameTest {
    
    public DameTest() {
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
     * Test of verifieDeplacement method, of class Dame.
     */
    @Test
    public void testVerifieDeplacement() {
        System.out.println("verifieDeplacement");
        int newX = 0;
        int newY = 0;
        Dame instance = null;
        boolean expResult = false;
        boolean result = instance.verifieDeplacement(newX, newY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prise method, of class Dame.
     */
    @Test
    public void testPrise() {
        System.out.println("prise");
        int newX = 0;
        int newY = 0;
        Dame instance = null;
        boolean expResult = false;
        boolean result = instance.prise(newX, newY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
