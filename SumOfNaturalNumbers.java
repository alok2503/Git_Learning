package coding_ninjas;

public class SumOfNaturalNumbers {
	
	public static void main(String[] args) {
		
		int n =5;
		System.out.println(sum(n));
	}

	private static int sum(int n) {
		
		if(n==1) {
			return n;
		}
		
		return n+sum(n-1);
	}

}
