package jeu;

import cartes.Carte;

public class Sabot {
	
	Carte cartes[];
	int nbCartes;
	public Sabot(int nbCartes) {
		this.nbCartes = nbCartes;
		cartes = new Carte[nbCartes];
	}
	
	public Boolean estVide() {
		if (nbCartes>0)
			return false;
		else 
			return true;
	}
	
	

}
