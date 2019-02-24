package cse360assign2;

/*
 * 	Name: Anthony Salaices
 * 	Class ID: 538
 * 	Assignment Number: 2
 */

public class Calculator {
/* 
 * This class contains the functions that a basic calculator contains from a given
 * input from another file. The methods update the current value of the central
 * variable total, return the value of total, or return an empty string "". The
 * methods in this class are accessed by another test file to become activated.
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
	 * This method returns the current value of the variable total.
	 * 
	 * @return	total	the current value in variable total
	 */

		return total;
	}
	
	public void add (int value) {
	/*
	 * This method takes in an integer and adds it to the variable total and updates
	 * the current value of total.
	 * 
	 * @param	value	the integer entered to be added
	 */
		
		total = total + value;
		
	}
	
	public void subtract (int value) {
	/*
	 * This method takes in an integer and subtracts it from the variable total and
	 * updates the current value of total.
	 * 
	 * @param	value	the integer entered to be subtracted
	 */
		
		total = total - value;
		
	}
	
	public void multiply (int value) {
	/*
	 * This method takes in an integer and multiplies it by the variable total and
	 * updates the current value of total.
	 * 
	 * @param	value	the integer entered to be multiplied
	 */
		
		total = total * value;
		
	}
	
	public void divide (int value) {
	/*
	 * This method takes in an integer and is divided by the variable total and
	 * updates the current value of total.
	 * 
	 * @param	value	the integer entered to be divided by
	 */
		if(value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		
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