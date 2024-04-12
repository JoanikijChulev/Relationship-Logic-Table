// Name:Joanikij Chulev.
// This project is all my own work.
// I have not knowingly allowed others to copy my work

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestDinnerTable {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String inputWhile="no";

		do {

			System.out.println("Please enter the name of the guest data file: ");
			String insertText=input.next();
			try {
				BufferedReader text=new BufferedReader(new FileReader("src/"+insertText+".txt")); //we use this line of code to read a directed file.
				String sum;
				DinnerTable dinnerTable; //we create the object
				ArrayList<Person> persons=new ArrayList<Person>(); //we create an arraylist FOR the bject.
				int number=0;
				while( (sum=text.readLine())!=null)
				{
					String []arrayText=sum.split(" "); //splits the string in the regards of the txt file
					if(arrayText[4].length()==1)
					{

						persons.add(new SinglePerson(arrayText[0],Integer.parseInt(arrayText[1]),arrayText[2].charAt(0),arrayText[3].charAt(0),arrayText[4].charAt(0)));
						if(arrayText[4].equals("y")) {
							number++; //we add elements to the arraylist  //number counter counts numbers of singles looking
							//the constructor is using data from the arrayText through its array split.
						}
					}
					else {
						persons.add(new InRelationshipPerson(arrayText[0],Integer.parseInt(arrayText[1]),arrayText[2].charAt(0),arrayText[3].charAt(0),arrayText[4]));
					}				//the constructor is using data from the arrayText through its array split.	
				}
				try {
					dinnerTable=new DinnerTable(persons,number); 
					System.out.println(dinnerTable.toString()); //we print out if there is no thrown exception

				} catch (DinnerTableException e) {
					System.out.println(e.getNumberSinglesLooking());
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Do you want to try another guest data file? (y/n): ");
			inputWhile=input.next();
		}while(!inputWhile.equals("n"));  //when we input n the program stops
	}

}