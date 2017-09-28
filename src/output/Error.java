package output;

public class Error {
	static boolean error = false;
	static boolean divedeByZeroError = false;
	
	static void DivedeByZerroError(){
		error = true;
		divedeByZeroError = true;
	}

}
