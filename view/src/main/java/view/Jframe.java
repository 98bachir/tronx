package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Constantes;
import model.ModeleDuJeu;



public class Jframe extends JFrame implements Constantes{
	private ModeleDuJeu modele;
	/**
	 * toute la vue avec le l'affichage dans un conteneur (content)
	 */
	private static final long serialVersionUID = 1L;

	public Jframe()  {
		this.setTitle("TRON");
		//titre de la fenêtre
		this.modele = new ModeleDuJeu();
		//créer le modèle du jeu
	    this.setLocationRelativeTo(null); 
	    //fermeture de l'application lorsque la fenêtre est fermée
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //pas de redimensionnement possible pour la fenêtre
	    setResizable(false);
	    // créer un conteneur(content) qui affichera le jeu
	    final JPanel content = new JPanel() {
	    	protected void paintComponent(Graphics g) {
	    		super.paintComponent(g);
	    		Jframe.this.modele.affichage(g);
	    		//affichage du modèle du jeu 
	    	}
	    };
	    content.setBackground(Color.BLACK); 
	    //met le fond d'écran en noir
	   
	    //le listener gérant les entrées au clavier
	    content.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
          	  Jframe.this.modele.gestionDuClavier(e);
          	  Jframe.this.modele.gestionDuClavier_2(e);
            }
      });
	    //dimension de le content 
	    content.setPreferredSize(new Dimension(
          		NBRE_DE_COLONNES * CASE_EN_PIXELS,
                  NBRE_DE_LIGNES * CASE_EN_PIXELS));
	    //s'assurer du focus pour le listener clavier 
	    setFocusable(false);
        content.setFocusable(true);
        // ajoute le content à la fenêtre
        setContentPane(content);
        
        //créer un thread infini
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                  while (true) {//boucle infinie , a chaque fois que la boucle est exécutée la methode clacul du jeu et appelée
                	  Jframe.this.modele.calcul();
                	  content.repaint();
                	  try {
                          Thread.sleep(DELAY);
                    } catch (InterruptedException e) {
                          
                    }
               }
            }
	});
        //lance le thread
        thread.start();
}
}