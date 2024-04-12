import java.util.ArrayList;

public class DinnerTable {

	private ArrayList<Person> personsList=new ArrayList<Person>();



	public DinnerTable(ArrayList<Person> personsList,int number) throws DinnerTableException {
		this.personsList = personsList;
		for(int i=0;i<=personsList.size();i++)
		{
			if (number<=1) {

				throw new DinnerTableException(number); //the construcot throws an acception if number counter is lower or 1. Number count is generated in the main and passed down later.
			}

		}
	}


	public String toString() {
		return "Person 1: " + personsList.get(0) + "Person 2: "+personsList.get(1)+ "Person 3: "+personsList.get(2) +"Person 4: " +personsList.get(3);
	}



}
