package cartes;

public class Attaque extends Bataille {

	public Attaque(Type type, int nombre) {
		super(type, nombre);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		switch (type) {
		case FEU:
			return "Feu Rouge";
		case ESSENCE:
			return "Pas d'essence";	
		case CREVAISON:
			return "Crevaison";
		default:
			return "accident";
		} 
	}

}
