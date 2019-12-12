package firstgitproject;

public class FactGit {

	public static void main(String[] args) {

		// 1! = 1 * 0! = 1
				// 2! = 2 * 1! = 2
				// 5! = 5 * 4! = 120
				// n! = n * (n-1)!
				System.out.println("The factorial using recursive method is : "  +recursiveFact(5));
			//	System.out.println("The factorial using iterative method is : "  +iterativeFact(5));

	}
	public static int recursiveFact(int num){
		if(num == 0)
			return 1;
		return num * recursiveFact(num - 1);
		
	}

}
