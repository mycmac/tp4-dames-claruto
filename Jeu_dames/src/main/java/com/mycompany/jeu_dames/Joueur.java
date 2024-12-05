package com.mycompany.jeu_dames;

import java.util.ArrayList;
import java.util.Scanner;

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
        this.initializeNom(numeroJoueur);
    }

    /**
     * Initializes the player's name by prompting the user for input. This
     * method ensures that the name is not empty.
     *
     * @param numeroJoueur The player's number, used to display the prompt.
     */
    private void initializeNom(int numeroJoueur) {
        System.out.println("Écrivez le nom du joueur " + numeroJoueur + " : ");

        String nomLu = "";
        Scanner sc = new Scanner(System.in);

        // Loop to ensure the name is not empty
        do {
            nomLu = sc.nextLine().trim(); // trim() removes the blanks at the beginning and the end
            if (nomLu.isEmpty()) {
                System.out.println("Le nom ne peut pas être vide. Essayez encore : ");
            }
        } while (nomLu.isEmpty());

        this.nom = nomLu;
    }

    /**
     * Gets the name of the player.
     *
     * @return The name of the player.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Gets the color of the player.
     *
     * @return true if the player is black, false if the player is white.
     */
    public boolean isCouleur() {
        return couleur;
    }

    /**
     * Gets the game board associated with the player.
     *
     * @return The game board associated with the player.
     */
    public TableauDeJeu getPartie() {
        return partie;
    }

    public void tourDeJeu() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Peon> mesPeons = new ArrayList<>();
        ArrayList<Peon> adversairesPeons = new ArrayList<>();
        Peon peonTrouve = null;
        // The color of the player (true for black or false for white)
        if (this.couleur) {
            mesPeons = partie.getPeonNoir();
            adversairesPeons = partie.getPeonBlanc();
        } else {
            adversairesPeons = partie.getPeonNoir();
            mesPeons = partie.getPeonBlanc();
        }

        do {
            // Read the column
            System.out.print("Entrez la colonne (A-J) : ");
            char colonneChar = scanner.next().charAt(0);

            // Check the validity of the column
            int colonne = convertirPosX(colonneChar);
            while (colonne == -1) {
                System.out.print("Colonne invalide ! Entrez à nouveau la colonne (A-J) : ");
                colonneChar = scanner.next().charAt(0);
                colonne = convertirPosX(colonneChar);
            }

            // Read the row
            System.out.print("Entrez la ligne (0-9) : ");
            int ligne = scanner.nextInt();

            // Check the validity of the row
            while (ligne < 0 || ligne > 9) {
                System.out.print("Ligne invalide ! Entrez à nouveau la ligne (0-9) : ");
                ligne = scanner.nextInt();
            }

            // Iterate over all peons in the 'myPeons' list
            for (Peon peon : mesPeons) {
                // Check if the peon's position matches the provided column and row
                if (peon.getX() == colonne && peon.getY() == ligne) {
                    peonTrouve = peon;  // Store the found peon
                    break;  // Stop iterating once the peon is found
                }
            }

        } while (peonTrouve == null);
    }

    /**
     * Converts a column character (A-j) to its corresponding index (0-9).
     * <p>
     * This method maps the letters 'A' to 'j' to the respective index values 0
     * to 9. It is case-insensitive, meaning both lowercase and uppercase
     * letters are accepted. If an invalid column is provided, the method
     * returns -1.
     * </p>
     *
     * @param column The column character to be converted (A-j,
     * case-insensitive).
     * @return The corresponding index of the column (0-9), or -1 if the column
     * is invalid.
     */
    public int convertirPosX(char column) {
        int posXint;
        // Convert the column to uppercase to handle both cases
        posXint = switch (Character.toUpperCase(column)) {
            case 'A' ->
                0;
            case 'B' ->
                1;
            case 'C' ->
                2;
            case 'D' ->
                3;
            case 'E' ->
                4;
            case 'F' ->
                5;
            case 'G' ->
                6;
            case 'H' ->
                7;
            case 'I' ->
                8;
            case 'J' ->
                9;
            default ->
                -1;
        };

        return posXint;
    }
}
