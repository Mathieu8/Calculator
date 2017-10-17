package output;

public class Run  {
	public static void main(String[] args) {
		/*
		Calculation test = new Calculation();
		test.question = "10+2";
		test.makeTree();
		double answer = Calculation.answer;
		System.out.println("antwoord is:  " + answer);
*/
		try {
		int a = 5;
		int b = 0;
		System.out.println(d(a,b));
	} catch (ArithmeticException exc) {
		System.out.println("error");
	}
	}
	
	static public int d(int a, int b) {
		return a/b;
	}
}
