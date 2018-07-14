package main;

import java.sql.SQLException;

import model.Chrono;
import model.ModeleDuJeu;
import view.Jframe;




 
public abstract class Main {
	private ModeleDuJeu modele;
	
    /**
     * 
     * lancement du jeu en créant la fenêtre
     */
    public static void main(final String[] args)  {
    	 // création de la fenêtre
    	  Jframe fenetre = new Jframe();
    	// dimensionnement de la fenêre "au plus juste" suivant
          // la taille des composants qu'elle contient
    	  fenetre.pack();
    	  // centrage sur l'écran
          fenetre.setLocationRelativeTo(null);
       // affichage
          fenetre.setVisible(true);
          
    }
  
}
