/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.jeu_dames;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class TableauDeJeuTest {
    
    public TableauDeJeuTest() {
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
     * Test of creerTableau method, of class TableauDeJeu.
     */
    @Test
    public void testCreerTableau() {
        System.out.println("creerTableau");
        TableauDeJeu instance = new TableauDeJeu();
        instance.creerTableau();
        
        //Test si la position souhaitée a un objet du type Peon
        assertTrue( (instance.getCarte()[0][1]) instanceof Peon);
        assertFalse( (instance.getCarte()[0][0]) != null);
    }

    /**
     * Test of tourDeJeu method, of class TableauDeJeu.
     */
    @Test
    public void testTourDeJeu() {
        System.out.println("tourDeJeu");
        TableauDeJeu instance = new TableauDeJeu();
        instance.tourDeJeu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sauvegarderPartie method, of class TableauDeJeu.
     */
    @Test
    public void testSauvegarderPartie() {
        System.out.println("sauvegarderPartie");
        TableauDeJeu instance = new TableauDeJeu();
        instance.sauvegarderPartie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chargerPartie method, of class TableauDeJeu.
     */
    @Test
    public void testChargerPartie() {
        System.out.println("chargerPartie");
        TableauDeJeu instance = new TableauDeJeu();
        instance.chargerPartie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifierFinPartie method, of class TableauDeJeu.
     */
    @Test
    public void testVerifierFinPartie() {
        System.out.println("verifierFinPartie");
        TableauDeJeu instance = new TableauDeJeu();
        instance.verifierFinPartie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePeon method, of class TableauDeJeu.
     */
    @Test
    public void testRemovePeon() {
        System.out.println("removePeon");
        int x = 0;
        int y = 0;
        TableauDeJeu instance = new TableauDeJeu();
        instance.removePeon(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cheminEstLibre method, of class TableauDeJeu.
     */
    @Test
    public void testCheminEstLibre() {
        System.out.println("cheminEstLibre");
        int x = 0;
        int y = 0;
        int newX = 0;
        int newY = 0;
        TableauDeJeu instance = new TableauDeJeu();
        boolean expResult = false;
        boolean result = instance.cheminEstLibre(x, y, newX, newY);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarte method, of class TableauDeJeu.
     */
    @Test
    public void testGetCarte() {
        System.out.println("getCarte");
        TableauDeJeu instance = new TableauDeJeu();
        Peon[][] expResult = null;
        Peon[][] result = instance.getCarte();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarte method, of class TableauDeJeu.
     */
    @Test
    public void testSetCarte() {
        System.out.println("setCarte");
        Peon[][] carte = null;
        TableauDeJeu instance = new TableauDeJeu();
        instance.setCarte(carte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeonNoir method, of class TableauDeJeu.
     */
    @Test
    public void testGetPeonNoir() {
        System.out.println("getPeonNoir");
        TableauDeJeu instance = new TableauDeJeu();
        ArrayList<Peon> expResult = null;
        ArrayList<Peon> result = instance.getPeonNoir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPeonNoir method, of class TableauDeJeu.
     */
    @Test
    public void testSetPeonNoir() {
        System.out.println("setPeonNoir");
        ArrayList<Peon> peonNoir = null;
        TableauDeJeu instance = new TableauDeJeu();
        instance.setPeonNoir(peonNoir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeonBlanc method, of class TableauDeJeu.
     */
    @Test
    public void testGetPeonBlanc() {
        System.out.println("getPeonBlanc");
        TableauDeJeu instance = new TableauDeJeu();
        ArrayList<Peon> expResult = null;
        ArrayList<Peon> result = instance.getPeonBlanc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPeonBlanc method, of class TableauDeJeu.
     */
    @Test
    public void testSetPeonBlanc() {
        System.out.println("setPeonBlanc");
        ArrayList<Peon> peonBlanc = null;
        TableauDeJeu instance = new TableauDeJeu();
        instance.setPeonBlanc(peonBlanc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of afficheTableau method, of class TableauDeJeu.
     */
    @Test
    public void testAfficheTableau() {
        System.out.println("afficheTableau");
        TableauDeJeu instance = new TableauDeJeu();
        instance.creerTableau();
        instance.afficheTableau();

    }
    
}
