package com.mycompany.jeu_dames;

import java.util.ArrayList;

public class Joueur {
    private String nom;
    private boolean couleur;
    private TableauDeJeu partie;
    
    public Joueur(String nom, boolean couleur, TableauDeJeu partie) {
        this.nom = nom;
        this.couleur = couleur;
        this.partie = partie;
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
