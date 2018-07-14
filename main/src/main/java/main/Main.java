package main;

import java.sql.SQLException;

import model.Chrono;
import model.ModeleDuJeu;
import view.Jframe;




 
public abstract class Main {
	private ModeleDuJeu modele;
	
    /**
     * 
     * lancement du jeu en cr�ant la fen�tre
     */
    public static void main(final String[] args)  {
    	 // cr�ation de la fen�tre
    	  Jframe fenetre = new Jframe();
    	// dimensionnement de la fen�re "au plus juste" suivant
          // la taille des composants qu'elle contient
    	  fenetre.pack();
    	  // centrage sur l'�cran
          fenetre.setLocationRelativeTo(null);
       // affichage
          fenetre.setVisible(true);
          
    }
  
}
