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
 * variable total, return the value of total, or return the history of all 
 * operations completed thus far in the class. The methods in this class are 
 * accessed by another test file and do not call one another.
*/
	
	private int total;
	private String history;
	
	public Calculator () {
	/*
	 * This method is the constructor of the class and assigns initial values to the
	 * variables contained.
	 */
		
		total = 0;  // not needed - included for clarity
		history = "0";
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
	 * the current value of total. It also updates the string history putting on
	 * that another operation has been called.
	 * 
	 * @param	value	the integer entered to be added
	 */
		
		history = history + " " +  "+" + " " + value;
		total = total + value;
		
	}
	
	public void subtract (int value) {
	/*
	 * This method takes in an integer and subtracts it from the variable total and
	 * updates the current value of total. It also updates the string history putting on
	 * that another operation has been called.
	 * 
	 * @param	value	the integer entered to be subtracted
	 */
		
		history = history + " " +  "-" + " " + value;
		total = total - value;
		
	}
	
	public void multiply (int value) {
	/*
	 * This method takes in an integer and multiplies it by the variable total and
	 * updates the current value of total. It also updates the string history putting on
	 * that another operation has been called.
	 * 
	 * @param	value	the integer entered to be multiplied
	 */
		
		history = history + " " +  "*" + " " + value;
		total = total * value;
		
	}
	
	public void divide (int value) {
	/*
	 * This method takes in an integer and is divided by the variable total and
	 * updates the current value of total. It also updates the string history putting on
	 * that another operation has been called.
	 * 
	 * @param	value	the integer entered to be divided by
	 */
		
		history = history + " " +  "/" + " " + value;
		if(value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}
		
	}
	
	public String getHistory () {
	/*
	 * This method returns a string that displays the history of operations
	 * accessed in the class. The string is updated every time one of the
	 * core methods are activated based on the operation being completed and
	 * the value being inserted.
	 * 
	 * @return	history		string containing operation history
	 */
		
		return history;
	}
}