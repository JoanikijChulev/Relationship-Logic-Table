
public class InRelationshipPerson extends Person{

	private String firstName;


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public InRelationshipPerson(String name, int age, char sex, char relationshipStatus,String firstName) {
		super(name, age, sex, relationshipStatus);
		this.firstName=firstName;
	}

	public String toString() {
		return ""+getFirstName()+ " "+getAge()+" "+ getSex()+" "+ getRelationshipStatus()+ " "  + firstName + "\n";
	}

}
