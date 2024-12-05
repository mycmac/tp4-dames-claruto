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
                } else{
                    carteInterface[i][j] = '0';
                }
            }
        }
        
        for (int i = 4; i < 6; i++){
            for (int j=0; j < taille; j++){
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
                } else{
                    carteInterface[i][j] = '0';
                }
            }
        }
    }
    //column letters, lignes a zero
    
    //verificar se position de deplacement existe
    
    public void tourDeJeu() {
        System.out.println("Choississez le peon que vous voulez changer de position: ");
        
    
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
    
    /**
     * Affiche le tableau de jeu avec les colonnes identifiés avec des chiffres et
     * des lignes correspondant à des lettres.
     */
    
    public void afficheTableau(){
        
        System.out.print("     "); // Espace initial pour aligner avec les lettres
        for (int col = 0; col < taille; col++) {
            System.out.print(col + "  "); // Nombre de la colonne
        }
        System.out.println();
    
        for (int i = 0; i < taille; i++) {
            System.out.print((char) ('A' + i) + "    "); // Lettres de l'alphabet
            
            for (int j = 0; j < taille; j++) {
                System.out.print(this.carteInterface[i][j] + "  ");
        }
            System.out.println();
        }

    }
 
}
