/* File name : Course.java */
package first;

/**
* <h1>Course</h1>
* The Course program implements an application that
* calculate the final score of one course.
* <p>
* <b>Note:</b> The program require three parameters:
* - The three parameter is obtain since default Array 'args' of main method
* - String: name of student.
* - double: laboratory score.
* - double: theory score.
*
* @author  Richart Smith Escobedo Quispe
* @version 1.0
* @since   2020-04-01
*/
public class Course {

	public static void main(String[] args) {
		//
		final double LABORATORY_PERCENT = 0.4;
		String nameS;
		double laboratoryS, theoryS, finalS;
		
		nameS = args[0];
		laboratoryS = Double.parseDouble(args[1]);
		theoryS = Double.parseDouble(args[2]);
		
		finalS = (1-LABORATORY_PERCENT)*theoryS
				+ LABORATORY_PERCENT*laboratoryS;
		
		System.out.println(nameS + " has obtain final score " + (short) finalS );		

	}

}
