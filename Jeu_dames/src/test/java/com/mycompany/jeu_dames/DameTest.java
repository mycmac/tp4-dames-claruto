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

    private TableauDeJeu partie;
    private Dame dame;

    @BeforeEach
    public void setUp() {
        // Initialisation d'un tableau de jeu fictif
        partie = new TableauDeJeu();

        // Création d'une Dame
        dame = new Dame(4, 4, true, partie);
        partie.ajouterPeon(dame);
    }

    @Test
    public void testDeplacerValide() {
        assertTrue(dame.deplacer(7, 7), "La Dame devrait pouvoir se déplacer sur une longue diagonale");
        assertEquals(7, dame.x);
        assertEquals(7, dame.y);
    }
    
    @Test
    public void testDeplacerInvalide() {
        assertFalse(dame.deplacer(6, 5), "La Dame ne peut pas se déplacer hors des diagonales");
        assertEquals(4, dame.x);
        assertEquals(4, dame.y);
    }

    @Test
    public void testPriseValide() {
        Peon cible = new Peon(6, 6, false, partie);
        partie.ajouterPeon(cible);
        assertTrue(dame.prise(8, 8), "La Dame devrait capturer un pion sur sa trajectoire");
        assertNull(partie.getPeon(6, 6), "Le pion capturé devrait être supprimé du tableau");
        assertEquals(8, dame.x);
        assertEquals(8, dame.y);
    }
}