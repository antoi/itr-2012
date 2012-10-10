/**
 * 
 */

/**
 * @author moreau
 *
 */
public class Employe extends Personne {

	/**
	 * num巖o d'employ�
	 */
	private int numero;
	
	/**
	 * Entreprise dans laquelle travaille l'employ�
	 */
	Entreprise entreprise;
	
	/**
	 * le chef 
	 */
	private Employe chef;
	
	/**
	 * @return the entreprise
	 */
	public Entreprise getEntreprise() {
		return entreprise;
	}

	/**
	 * @param entreprise the entreprise to set
	 */
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param anneeNaissance
	 */
	public Employe(String nom, String prenom, boolean sexe, int anneeNaissance,int numero, Entreprise entreprise) {
		super(nom, prenom, sexe, anneeNaissance);
		this.numero = numero;
		this.entreprise = entreprise;
		this.chef = null;
	}
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param anneeNaissance
	 * @param numero
	 * @param entreprise
	 * @param chef
	 */
	public Employe(String nom, String prenom, boolean sexe, int anneeNaissance,
			int numero, Entreprise entreprise, Employe chef) {
		super(nom, prenom, sexe, anneeNaissance);
		this.numero = numero;
		this.entreprise = entreprise;
		this.chef = chef;
	}

	/* (non-Javadoc)
	 * @see Personne#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" - travaille chez "+entreprise.getNom()+
		", num巖o "+this.numero;
	}

	public static void main(String[] args) {
		Entreprise comac = new Entreprise("Comac");
		Manager e0 = new Manager("Mao", "Zedong", true, 1893, 1976, comac, null);
		Employe e1 = new Employe("Dassault","Marcel",true,1910,354,comac,e0);
		Employe e2 = new Employe("Sarkozy","Nicolas",true,1940,335, comac, e0);
		
		System.out.println(e1);
		System.out.println(e2);
		
		e1.dirChef();
		e2.dirChef();
		e0.dirChef();
	}

	/**
	 * @return the chef
	 */
	public Employe getChef() {
		return chef;
	}

	/**
	 * @param chef the chef to set
	 */
	public void setChef(Employe chef) {
		this.chef = chef;
	}
	
	public void dirChef(){
		if (this.chef == null){
			System.out.println(this.getNom() + " est le patron");
		} else {
			System.out.println( this.getNom() + " a pour chef " + this.chef.getNom());
		}
	}

}
