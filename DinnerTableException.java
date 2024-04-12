
public class DinnerTableException extends Exception{

	int number;

	public DinnerTableException(int number) {
		this.number = number;
	}


	public String getNumberSinglesLooking()
	{

		return "Problems with dinner table..." + "\nNumber of single looking = " +number;
	} //prints out the numbers of singles that are looking through this method in the exception.



}
