package DataStructure_April_2017;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}



	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Key k = (Key) o;
		// return Objects.equals(this.firstName, k.firstName) &&
		// Objects.equals(this.lastName, k.lastName);

		boolean isEqual = this.getFirstName().equals(k.getFirstName()) && this.getLastName().equals(k.getLastName());
		return isEqual;
	}
}