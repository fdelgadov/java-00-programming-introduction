public class Course {
	public static void main(String[] args) {
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
