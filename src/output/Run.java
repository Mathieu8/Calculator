package output;

public class Run extends Calculation {
	public static void main(String[] args) {
		Calculation test = new Calculation();
		test.question = "10+2";
		test.makeTree();
		double answer = Calculation.answer;
		System.out.println("antwoord is:  " + answer);
		
	}
}
