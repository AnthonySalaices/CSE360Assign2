package cse360assign2;

/*
 * 	Name: Anthony Salaices
 * 	Class ID: 538
 * 	Assignment Number: 2
 */

public class Calculator {
/* 
 * This class contains the functions that a basic calculator contains from a given
 * input from another file. The methods in the file can be activated in another
 * file and without activation, the class essentially does nothing. However, in it's
 * current state, the class does nothing but return 0 in one method and an empty string
 * "" in another.
*/
	
	private int total;
	
	public Calculator () {
	/*
	 * This method is the constructor of the class and assigns initial values to the
	 * variables contained.
	 */
		
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
	/*
	 * This method is to access the variable total in this class from any alternate 
	 * file that requires it. However, as is, this will only return the integer value
	 * 0.
	 * 
	 * @return		the integer 0, in this case
	 */
		return 0;
	}
	
	public void add (int value) {
	/*
	 * This method, presumably, takes in an integer and adds it to another and
	 * updates the variable total. However, in it's current state, this method
	 * does nothing.
	 * 
	 * @param	value	the integer entered to be added
	 */
		
	}
	
	public void subtract (int value) {
	/*
	 * This method, presumably, takes in an integer and subtracts it from another
	 * and updates the variable total. However, in it's current state, this method
	 * does nothing.
	 * 
	 * @param	value	the integer entered to be subtracted
	 */
		
	}
	
	public void multiply (int value) {
	/*
	 * This method, presumably, takes in an integer and multiplies it by another
	 * and updates the variable total. However, in it's current state, this method
	 * does nothing.
	 * 
	 * @param	value	the integer entered to be multiplied
	 */
		
	}
	
	public void divide (int value) {
	/*
	 * This method, presumably, takes in an integer and is divided by another
	 * and updates the variable total. However, in it's current state, this method
	 * does nothing.
	 * 
	 * @param	value	the integer entered to be divided by
	 */
		
	}
	
	public String getHistory () {
	/*
	 * This method, presumably, gives the history of the values that the variable
	 * total has been. However, in it's current state, it will always return an empty
	 * string "".
	 * 
	 * @return		in this case, an empty string ""
	 */
		return "";
	}
}