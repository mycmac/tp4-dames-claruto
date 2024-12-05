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
 * @author augustoarrojo
 */
public class JoueurTest {

    private Joueur joueur;

    public JoueurTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        TableauDeJeu mockTableau = new TableauDeJeu();  // Assuming a constructor that works without arguments or mock it
        this.joueur = new Joueur("Player 1", true, mockTableau);  // Initialize the Joueur object with proper arguments
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNom method, of class Joueur.
     */
    @Test
    public void testGetNom() {
        assertEquals("Player 1", joueur.getNom());  // Test the name getter
    }

    /**
     * Test of isCouleur method, of class Joueur.
     */
    @Test
    public void testIsCouleur() {
        assertTrue(joueur.isCouleur(), "Le couleur du joueur doit être noir");  // True represents black player (assuming)
    }

    /**
     * Test of getPartie method, of class Joueur.
     */
    @Test
    public void testGetPartie() {
        TableauDeJeu mockTableau = new TableauDeJeu();  // Assuming a constructor that works without arguments or mock it
        assertEquals(mockTableau, joueur.getPartie(), "The game board should match the one associated with the player");
    }

    /**
     * Test of tourDeJeu method, of class Joueur.
     */
    @Test
    public void testTourDeJeu() {
        System.out.println("tourDeJeu");
        Joueur instance = null;
        instance.tourDeJeu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirPosX method, of class Joueur.
     */
    @Test
    public void testConvertirPosX() {
        assertEquals(0, joueur.convertirPosX('A')); // Example test case
    }
}
