/**
 * 
 */

/**
 * @author Antoine
 *
 */
public class ContactTelephonique extends Contact {
	private int numTelephone;

	/**
	 * @return the numTelephone
	 */
	public int getNumTelephone() {
		return numTelephone;
	}

	/**
	 * @param numTelephone the numTelephone to set
	 */
	public void setNumTelephone(int numTelephone) {
		this.numTelephone = numTelephone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String string;
		string = "num¨¦ro de t¨¦l¨¦phone est " + this.getNumTelephone();
		return string;
	}
	
	
}
