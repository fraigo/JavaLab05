package lab05;

/**
 * Book class
 * @author franciscoigor@gmail.com
 *
 */
public class Book implements Comparable<Book>{
	
	private static final int MAX_YEAR_PUBLISHED = 2017;
	Name firstName;
	Name lastName;
	String title;
	int yearPublished;
	
	
	
	/**
	 * Constructor for book
	 * @param firstName
	 * @param lastName
	 * @param title
	 * @param yearPublished
	 */
	public Book(Name firstName, Name lastName, String title, int yearPublished) throws Exception {
		setFirstName(firstName);
		setLastName(lastName);
		setTitle(title);			
		setYearPublished(yearPublished);			
	}

	public final void setFirstName(Name firstName) {
		this.firstName = firstName;
	}
	
	public final Name getFirstName() {
		return firstName;
	}
	
	public final void setLastName(Name lastName) {
		this.lastName = lastName;
	}
	
	public final Name getLastName() {
		return lastName;
	}
	
	public final void setTitle(String title) throws Exception {
		if (title==null){
			throw new InvalidArgumentException("String must not be null");
		}
		if (title.length()==0){
			throw new InvalidArgumentException("String must not be empty");
		}
		this.title = title;
	}
	
	public final String getTitle() {
		return title;
	}
	
	public final void setYearPublished(int yearPublished) throws Exception {
		if (yearPublished>MAX_YEAR_PUBLISHED){
			throw new InvalidBookDateException("Invalid year");
		}
		this.yearPublished = yearPublished;
	}
	
	public final int getYearPublished() {
		return yearPublished;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearPublished;
		return result;
	}

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
		Book other = (Book) obj;
		// Only check title and yearPublished
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		if (yearPublished != other.yearPublished) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Book [firstName=" + firstName + ", lastName=" + lastName
				+ ", title=" + title + ", yearPublished=" + yearPublished + "]";
	}

	@Override
	public int compareTo(Book other) {
		if (other.getYearPublished()>this.getYearPublished()){
			return -1;
		} else if (other.getYearPublished()<this.getYearPublished()){
			return 1;
		} else {
			return 0;
		}
	}
	
}
