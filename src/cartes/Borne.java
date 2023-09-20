package cartes;

public class Borne extends Carte {
	int km;

	public Borne(int km,int nombre) {
		super(nombre);
		this.km=km;
	}
	@Override
	public int getNombre() {
		
		return super.getNombre();
	}
	
	public int getKm() {
		return km;
	}
	
	public String toString() {
		return ""+km+"";
	}

}
