package cartes;

public class Parade extends Bataille {

	public Parade(Type type, int nombre) {
		super(type, nombre);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		switch (type) {
		case FEU:
			return "Feu Vert";
		case ESSENCE:
			return "essence";	
		case CREVAISON:
			return "roue de secours";
		default:
			return "reparations";
		} 
	}

}
