package coding_ninjas;

public class FactorialNumber {
	
	public static void main(String[] args) {
		
		int n=5;
		System.out.println(fact(n));
	}

	private static int fact(int n) {
		
		if(n==1) {
			return n;
		}
		
		return n*fact(n-1);
	}

}
