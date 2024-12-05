/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeu_dames;

/**
 *
 * @author Clara
 */
public class Dame extends Peon {
    public Dame(int x, int y, boolean couleur, TableauDeJeu partie) {
        super(x, y, couleur, partie);
    }
    
    
    /**
     * Les dames peuvent se déplacer dans n'importe quelle direction en
     * diagonale, sans limite de distance.
     */
    @Override
    public boolean verifieDeplacement(int newX, int newY, boolean aPris) {
        int deltaX = Math.abs(newX - this.x);
        int deltaY = Math.abs(newY - this.y);

        // Vérifie que le mouvement est diagonal et que le chemin est libre
        return deltaX == deltaY && partie.cheminEstLibre(this.x, this.y, newX, newY);
    }

    /**
     * Override de la prise pour prendre en compte les mouvements à
     * longue distance.
     */
    @Override
    public boolean prise(int newX, int newY) {
        int middleX = (this.x + newX) / 2;
        int middleY = (this.y + newY) / 2;
        
        if (verifieVoisin(middleX, middleY)) {
            partie.removePeon(middleX, middleY);
            return deplacer(newX, newY, true);
        }
        return false;
    }
    
}
