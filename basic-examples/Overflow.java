/* File name : Overflow.java */
package first;

/**
* <h1>Overflow</h1>
* The HelloWorld program implements an application that
* show overflow in data types using the data type  'byte'.
* <p>
* <b>Note:</b> Java byte data type has size 1 byte for integers since -128 to 127.
*
* @author  Richart Smith Escobedo Quispe
* @version 1.0
* @since   2020-04-01
*/
public class Overflow {

	public static void main(String[] args) {
		
		byte numberOne, numberTwo;
		
		numberOne = 127;
		numberTwo = (byte) (numberOne + 1);
		System.out.println(numberTwo);

	}

}
