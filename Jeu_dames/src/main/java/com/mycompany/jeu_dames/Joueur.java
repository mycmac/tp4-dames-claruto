/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeu_dames;

import java.util.ArrayList;

/**
 *
 * @author Clara
 */
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
