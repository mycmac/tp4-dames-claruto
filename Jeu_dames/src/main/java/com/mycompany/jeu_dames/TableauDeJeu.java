/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jeu_dames;

import java.util.ArrayList;

/**
 *
 * @author Clara, Larissa
 */
public class TableauDeJeu {
    public Peon[][] carte;
    public ArrayList<Peon> peonNoir;
    public ArrayList<Peon> peonBlanc;
    
    public static int taille = 10;
    public static int nbPeon = 20;
    
    public TableauDeJeu() {
        ArrayList<Peon> peonNoir = new ArrayList();
        ArrayList<Peon> peonBlanc = new ArrayList();
        Peon carte[][] = new Peon[taille][taille];
    }
    
    /**
     * Initialisation du plateau de jeu
     */
    public void creerTableau() {
        //Creation des peons
        //Couleur: true pour noir, false pour blanc
        for (int i = 0; i <= nbPeon; i++){
            for (int j = 0; j<= taille; j++){
                
                Peon noir = new Peon(0, 0, false);
                Peon blanc  = new Peon(0, 0, true);
                peonNoir.add(noir);
                peonBlanc.add(blanc);
            }
        }
        
        
        
        //peonsNoires dans les cases paires
        //peonsBlanches dans les cases impaires
                
       
    }
    
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
    
}
