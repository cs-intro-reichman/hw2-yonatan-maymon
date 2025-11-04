// Computes an approximation of PI.

import javax.swing.event.InternalFrameAdapter;

public class CalcPi {
	public static void main(String [] args) {
		int count = Integer.parseInt(args[0]); 
	    double approximatedPiValue = 1;
		int denominator = 3;
		for (int i =1; i < count; i++ ){
			if (i % 2 == 1){
				approximatedPiValue = approximatedPiValue - 1.0 / denominator;
			}
			else{
				approximatedPiValue = approximatedPiValue + 1.0 / denominator;
			}
			denominator = denominator + 2;
		}
		System.out.println("pi according to Java: " + Math.PI + "\n" + "pi, approximated:     "
		 + approximatedPiValue * 4.0);
	}
}
