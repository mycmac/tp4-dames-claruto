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


public class PeonTest {

    private TableauDeJeu partie;
    private Peon peonNoir;
    private Peon peonBlanc;

    @BeforeEach
    public void setUp() {
        // Initialisation d'un tableau de jeu fictif
        partie = new TableauDeJeu();

        // Création de deux pions (noir et blanc)
        this.peonNoir = new Peon(4, 4, true, partie); // noir
        this.peonBlanc = new Peon(5, 5, false, partie); // blanc

        // Ajout des pions au tableau fictif
        partie.ajouterPeon(peonNoir);
        partie.ajouterPeon(peonBlanc);
    }
    
    @Test
    public void testDeplacerValide() {
        assertTrue(peonNoir.deplacer(5, 5), "Le pion noir devrait pouvoir se déplacer en diagonale");
        assertEquals(5, peonNoir.x);
        assertEquals(5, peonNoir.y);
    }

    @Test
    public void testDeplacerInvalide() {
        assertFalse(peonNoir.deplacer(4, 6), "Le pion noir ne peut pas se déplacer verticalement");
        assertEquals(4, peonNoir.x);
        assertEquals(4, peonNoir.y);
    }

    @Test
    public void testPriseValide() {
        Peon cible = new Peon(5, 5, false, partie);
        partie.ajouterPeon(cible);
        assertTrue(peonNoir.prise(6, 6), "Le pion noir devrait capturer le pion blanc");
        assertNull(partie.getPeon(5, 5), "Le pion capturé devrait être supprimé du tableau");
        assertEquals(6, peonNoir.x);
        assertEquals(6, peonNoir.y);
    }
    
    @Test
    public void testPromotion() {
        peonNoir.deplacerTest(5, 9);
        assertTrue(peonNoir.estPromu(), "Le pion noir devrait être promu en Dame");
    }
   
}

