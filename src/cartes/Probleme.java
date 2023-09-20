package cartes;

public abstract class Probleme extends Carte {
	
	enum Type {FEU,ESSENCE,CREVAISON,ACCIDENT};
	Type type;

	public Probleme(Type type,int nombre) {
		super(nombre);
		this.type= type;
	}
	@Override
	public int getNombre() {
		return super.getNombre();
	}
	public Type getType() {
		return type;
	}

}
