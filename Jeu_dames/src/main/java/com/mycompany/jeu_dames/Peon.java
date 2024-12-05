/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeu_dames;

/**
 *
 * @author Clara
 */
public class Peon {
    protected int x;
    protected int y;
    protected boolean couleur;
    
    public Peon (int x, int y, boolean couleur) {
        this.x = x;
        this.y = y;
        this.couleur = couleur;
               
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isCouleur() {
        return couleur;
    }

    public void setCouleur(boolean couleur) {
        this.couleur = couleur;
    }
    
    public void deplacer() { //TODO
    }
    
    public void prise() { //TODO
        
    }
}
