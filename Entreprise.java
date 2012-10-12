/**
 * 
 */

/**
 * @author moreau
 *
 */
public class Entreprise implements Contactable {
	/**
	 * nom de l'entreprise
	 */
	private String nom;
	
	/*
	 * le contactInfo
	 */
	private Contact contact;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * constructeur qui crée une entreprise
	 */
	public Entreprise(String nom) {
		this.nom = nom;
	}

	public Contact getContactInfo() throws NoContactInfoException {
		// TODO Auto-generated method stub
		if (this.contact == null){
			throw new NoContactInfoException("Pas de contact info");
		}
		return this.contact;
		
	}

	@Override
	public void setContactInfo(Contact contact) {
		// TODO Auto-generated method stub
		this.contact = contact;
	}
}
