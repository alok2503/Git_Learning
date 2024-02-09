package coding_ninjas;

public class PrintSubSequence {
	
	public static void printSubsequence(String input) {
		
		printSubsequence(input,"");
	}
	
	public static void printSubsequence(String input, String outputSofar) {
		
		if(input.length()==0) {
			System.out.println(outputSofar);
			return;
		}
		
		printSubsequence(input.substring(1), outputSofar);
		printSubsequence(input.substring(1), outputSofar+input.charAt(0));
		
	}

	public static void main(String[] args) {
		
		printSubsequence("xy");
		
	}

}
