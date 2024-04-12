
public class SinglePerson extends Person{

	private char partner;

	public char getPartner() {
		return partner;
	}

	public void setPartner(char partner) {
		this.partner = partner;
	}

	public SinglePerson(String firstName, int age, char sex, char relationshipStatus, char partner) {
		super(firstName, age, sex, relationshipStatus);
		this.partner=partner;
	}

	public String toString() {
		return ""+getFirstName()+ " "+getAge()+" "+ getSex()+" "+ getRelationshipStatus()+ " " + partner + "\n";
	}



}
