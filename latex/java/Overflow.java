public class Overflow {

	public static void main(String[] args) {
		
		byte numberOne, numberTwo;
		
		numberOne = 127;
		numberTwo = (byte) (numberOne + 1);
		System.out.println(numberTwo);

	}

}
