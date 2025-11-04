// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N =  Integer.parseInt(args[0]);
		String mode = args[1];
		int current;
		int count;
		for ( int i = 1; i <= N; i++ ){
			current = i;
			count = 1;
			if (current == 1 ){
				if (mode.equals("v")){
					System.out.print(current + " ");
				}
				current = current * 3 + 1;
				count = count + 1;
			}
			while (current != 1) {
				if (mode.equals("v")) {
					System.out.print(current + " ");
				}
				if ( current % 2 == 0 ){
					current = current / 2;
				}
				else{
					current = current * 3 + 1;	
				}
				count = count + 1;
			}
			if (mode.equals("v")) {
				System.out.print(current);
				System.out.println(" (" + count + ")");	
			}
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
