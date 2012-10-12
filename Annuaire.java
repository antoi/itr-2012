import java.util.*;

/**
 * 
 */

/**
 * @author Antoine
 *
 */
public class Annuaire {
	
	private List<Contactable> ann;

	public Annuaire(){
		this.ann = new LinkedList<Contactable>();
	}
	
	public void ajout(Contactable c){
		this.ann.add(c);
	}
	
	
	public Contact chercher(String nom){
		Contact c = null;
		for (Contactable contactable : this.ann){
			if (contactable.getNom() == nom){
				try {
					c = contactable.getContactInfo();
				} catch (NoContactInfoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return c;
	}
}
