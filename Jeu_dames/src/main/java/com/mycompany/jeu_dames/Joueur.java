package com.mycompany.jeu_dames;

import java.util.ArrayList;

/**
 * Represents a player in the game. A player has a name, a color, and is
 * associated with a game board.
 */
public class Joueur {

    private String nom;
    private final boolean couleur;
    private final TableauDeJeu partie;

    // 
    /**
     * Constructor to load a game
     * <p>
     * Constructs a player with a specified name, color, and associated game
     * board. </p>
     *
     * @param nom The name of the player.
     * @param couleur The color of the player (true for black or false for
     * white).
     * @param partie The game board associated with the player.
     */
    public Joueur(String nom, boolean couleur, TableauDeJeu partie) {
        this.nom = nom;
        this.couleur = couleur;
        this.partie = partie;
    }

    /**
     * Constructs a player for a new game, where the player’s name is
     * initialized by the player during the game setup.
     *
     * @param couleur The color of the player (true for black or false for
     * white).
     * @param partie The game board associated with the player.
     * @param numeroJoueur The number of the player, used to prompt for the
     * name.
     */
    public Joueur(boolean couleur, TableauDeJeu partie, int numeroJoueur) {
        this.couleur = couleur;
        this.partie = partie;
        //this.initializeNom(numeroJoueur);
    }

    public void tourDeJeu() {

    }

    public String getNom() {
        return nom;
    }

    public boolean isCouleur() {
        return couleur;
    }

    public TableauDeJeu getPartie() {
        return partie;
    }

}
