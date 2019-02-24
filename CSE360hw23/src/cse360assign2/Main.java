package cse360assign2;

public class Main {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		myCalculator.add(1);
		myCalculator.subtract(1);
		myCalculator.add(6);
		myCalculator.multiply(5);
		myCalculator.divide(0);
		myCalculator.add(20);
		myCalculator.divide(6);
		System.out.println(myCalculator.getHistory());
	}

}
