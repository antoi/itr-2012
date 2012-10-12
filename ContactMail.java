
public class ContactMail extends Contact {
	private String email;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String string = new String();
		string = "l'address d'email est " + this.getEmail();
		return string;
	}

	/**
	 * @param email
	 */
	public ContactMail(String email) {
		super();
		this.email = email;
	}
	
	
	
}
