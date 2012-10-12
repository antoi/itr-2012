/**
 * 
 */

/**
 * @author Antoine
 *
 */
public class ContactPoste extends Contact {

	private String poste;

	/**
	 * @return the poste
	 */
	public String getPoste() {
		return poste;
	}

	/**
	 * @param poste the poste to set
	 */
	public void setPoste(String poste) {
		this.poste = poste;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String string = new String();
		string = "l'address postale est " + this.getPoste();
		return string;
	}

	/**
	 * @param poste
	 */
	public ContactPoste(String poste) {
		super();
		this.poste = poste;
	}
	
}
