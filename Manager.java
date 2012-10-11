import java.util.LinkedList;

/**
 * 
 */

/**
 * @author moreau
 * une classe Manager
 */
public class Manager extends Employe {
	/**
	 * liste des personnes sous les ordres du Manager
	 */
	private LinkedList<Employe> employes;
	
	/**
	 * sup巖ieur hi巖archique
	 * 
	 * pour le patron de l'entreprise, le sup巖ieur vaudra null
	 */
	private Manager manager;
	
	/**
	 * @return the manager
	 */
	public Manager getManager() {
		return manager;
	}

	/* (non-Javadoc)
	 * @see Employe#toString()
	 */
	@Override
	public String toString() {
		return "MANAGER "+super.toString();
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	/**
	 * ajoute un employ��la liste des gens sous les ordres du 
	 * manager
	 * @param nouveau l'employ��ajouter
	 */
	public void ajouteEmploye(Employe nouveau) {
		// ajout �la liste des nouveaux
		this.employes.add(nouveau);
		
		// on v巖ifie si nouveau est lui-m恗e un Manager
		if (nouveau instanceof Manager) {
			// sous-classement
			Manager m1 = (Manager) nouveau;
			m1.setManager(this);
		}
	}
	
	/**
	 * donne le nombre d'employ�s sous les ordres d'un manager
	 */
	public int nombreEmployes() {
		int s = this.employes.size();
		for (Employe e : this.employes) {
			if (e instanceof Manager) {
				Manager m = (Manager) e;
				s += m.nombreEmployes();
			}
		}
		return s;
	}
	
	/**
	 * afficher la hierarchie d'un manager sur le modele
	 * A a pour chef B
	 * B a pour chef C
	 * C a pour chef D
	 * D est le patron
	 */
	void afficheHierarchie() {
		if (this.manager == null) {
			System.out.println(this.getNomComplet()+" est le patron");
		}
		else {
			System.out.println(this.manager.getNomComplet()+" est le chef de "+this.getNomComplet());
			this.manager.afficheHierarchie();
		}
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param anneeNaissance
	 * @param numero
	 * @param entreprise
	 */
	public Manager(String nom, String prenom, boolean sexe, int anneeNaissance,
			int numero, Entreprise entreprise, Employe chef) {
		super(nom, prenom, sexe, anneeNaissance, numero, entreprise, chef);
		this.employes = new LinkedList<Employe>();
	}
	public Manager(String nom, String prenom, boolean sexe, int anneeNaissance,
			int numero, Entreprise entreprise) {
		super(nom, prenom, sexe, anneeNaissance, numero, entreprise);
		this.employes = new LinkedList<Employe>();
	}
	
	public int numEmploye(){
		int n = 0;
		
		for (Employe e : this.employes){
			if(e instanceof Manager){
				n++;
				n += ((Manager) e).numEmploye();
			} else {
				n++;
			}
		}
		
		return n;
	}

}
