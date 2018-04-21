package lab05;

public class Biography extends Book {
	
	String subject;
	
	public Biography(Name firstName, Name lastName, String title, int yearPublished, String subject) throws Exception{
		super(firstName, lastName, title, yearPublished);
		setSubject(subject);
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			// Avoids comparing using parent equals() method to compare only the subject 
			//return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Biography other = (Biography) obj;
		if (subject == null) {
			if (other.subject != null) {
				return false;
			}
		} else if (!subject.equals(other.subject)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Biography [subject=" + subject + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", title=" + title
				+ ", yearPublished=" + yearPublished + "]";
	}
	
	
	
	

}
