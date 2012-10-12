/**
 * 
 */

/**
 * @author Antoine
 *
 */
public interface Contactable {

	public abstract Contact getContactInfo() throws NoContactInfoException;
	
	public abstract void setContactInfo(Contact contact);
	
	public abstract String getNom();

}
