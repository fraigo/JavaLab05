package lab05;

/**
 * Name class
 * Used to store and validate the forst and last name 
 * @author Francisco Igor
 *
 */
public class Name {

	/**
	 * Name (first or last) 
	 */
	String name;
	
	/**
	 * Basic constructor 
	 * @param name Name
	 * @throws Exception
	 */
	public Name(String name) throws Exception{
		setName(name);
	}
	
	/**
	 * Sets the name
	 * @param name Name
	 * @throws Exception
	 */
	public void setName(String name) throws Exception{
		if (name==null){
			throw new InvalidArgumentException("String must not be null");
		}
		if (name.length()==0){
			throw new InvalidArgumentException("String must not be empty");
		}
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Name other = (Name) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name;
	}
	
	
}
