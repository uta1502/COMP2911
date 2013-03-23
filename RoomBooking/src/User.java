import java.util.LinkedList;

public class User {
	private String name;
	private LinkedList<Reservation> reservations = new LinkedList<Reservation>();
	
	public User(String aName) {
		setName(aName);
	}

	/**
	 * Get the name of the current user.
	 * @return A String that specifies the name of the
	 * current user.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the name of the user.
	 * @param name A String that specifies the name of the user.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void addReservation() {
		
	}
}
