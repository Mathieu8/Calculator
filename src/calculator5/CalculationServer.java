package calculator5;

import output.Calculation;

public class CalculationServer {
	front cl;
	Calculation cal = new Calculation();
	
	String question;// = cl.text.string;
	double answer;
	String ErrorNote;
	boolean EnterPressed = false;
	String finalAnswer;

	void runCalculation() {
		cal.setQuestion(question);
		cal.makeTree();
		importData();
		
		if (isThereAError()) {
			finalAnswer = ErrorNote;
		} else {
			finalAnswer = Double.toString(answer);
		}
		System.out.println("finalAnswer " + finalAnswer);
		System.out.println("finalAnswer " + finalAnswer);
		

	}

	boolean isThereAError() {
		if (ErrorNote.indexOf("ERROR") == -1) {
			return false;
		} else {
			return true;
		}
	}

	void importData() {
		answer = cal.returnAnswer();
		ErrorNote = cal.returnError();

	}

}
/*
 * static int Tree(String command, String calculation) throws Exception {
 * System.out.println("just inside making tree"); Process pro =
 * Runtime.getRuntime().exec(command + " (" + calculation + ")");
 * printLines(command + " stdout:", pro.getInputStream()); printLines(command +
 * " stderr:", pro.getErrorStream()); pro.waitFor(); // int uitkomst = pro;
 * return 0; }
 * 
 * private static void printLines(String cmd, InputStream ins) throws Exception
 * { String line = null; BufferedReader in = new BufferedReader( new
 * InputStreamReader(ins)); while ((line = in.readLine()) != null) {
 * System.out.println(cmd + " " + line); } }
 * 
 * }
 */