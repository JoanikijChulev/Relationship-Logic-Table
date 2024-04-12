
public class Person {
	private String firstName;
	private int age;
	private char sex;
	private char relationshipStatus;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public char getRelationshipStatus() {
		return relationshipStatus;
	}
	public void setRelationshipStatus(char relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}
	public Person(String firstName, int age, char sex, char relationshipStatus) {
		this.firstName = firstName;
		this.age = age;
		this.sex = sex;
		this.relationshipStatus = relationshipStatus;
	}


}
