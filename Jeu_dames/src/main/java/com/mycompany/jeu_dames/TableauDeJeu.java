/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeu_dames;

import java.util.ArrayList;

/**
 * Classe TableauDeJeu
 * @author Clara, Larissa
 */
public class TableauDeJeu {
    /**
     * Stockage des positions des peons dans le jeu.
     */
    public Peon[][] carte;
    
    /**
     * Carte pour affichage à l'écran. N = peons noir, B = peons blancs.
     */
    public char[][] carteInterface;
    
    public ArrayList<Peon> peonNoir;
    public ArrayList<Peon> peonBlanc;
    
    public static int taille = 10;
    public static int nbPeon = 20;
    
    public TableauDeJeu() {
        this.peonNoir = new ArrayList<>();
        this.peonBlanc = new ArrayList<>();
        this.carte = new Peon[taille][taille];
        this.carteInterface = new char[taille][taille];
        
    }
    
    /**
     * Initialisation du plateau de jeu.
     */
    public void creerTableau() {
        //Creation des peons
        //Couleur: true pour noir, false pour blanc
        
        //Creation et placement des peons noires
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < taille; j++){
                if ((i + j) % 2 != 0) { // Seulement dans les cases noires
                    Peon noir = new Peon(i, j, false, this);
                    peonNoir.add(noir);
                    carte[i][j] = noir;
                    carteInterface[i][j] = 'N';
                }
            carteInterface[i][j] = '0';
            }
        }
        
        //Creation et placement des peons blanches
        for (int i = 6; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if ((i + j) % 2 != 0) { // Seulement dans les cases noires
                    Peon blanc = new Peon(i, j, true, this);
                    peonBlanc.add(blanc);
                    carte[i][j] = blanc;
                    carteInterface[i][j] = 'B';
                }
                carteInterface[i][j] = '0';
            }
        }
    }
    //column letters, lignes a zero
    
    //verificar se position de deplacement existe
    
    public void tourDeJeu() {
        
    
    }
    
    public void sauvegarderPartie() {
        
    }
    
    public void chargerPartie() {
        
    }
    
    public void verifierFinPartie() {
        
    }
    
    public void removePeon(int x, int y){
        
    }
    
    public boolean cheminEstLibre(int x, int y, int newX, int newY){
      return true;  
    }

    public Peon[][] getCarte() {
        return carte;
    }

    public void setCarte(Peon[][] carte) {
        this.carte = carte;
    }

    public ArrayList<Peon> getPeonNoir() {
        return peonNoir;
    }

    public void setPeonNoir(ArrayList<Peon> peonNoir) {
        this.peonNoir = peonNoir;
    }

    public ArrayList<Peon> getPeonBlanc() {
        return peonBlanc;
    }

    public void setPeonBlanc(ArrayList<Peon> peonBlanc) {
        this.peonBlanc = peonBlanc;
    }
    
    public void afficheTableau(){
        
    }
    
    
}
