package cartes;

public class Botte extends Probleme {

	public Botte(Type type, int nombre) {
		super(type, nombre);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String toString() {
		switch (type) {
		case FEU:
			return "Vehicule prioritaire";
		case ESSENCE:
			return "Citerne d'essence";	
		case CREVAISON:
			return "INCREVABLE";
		default:
			return "as du volant";
		} 
		
	}

}
