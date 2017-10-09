package output;

public class Error {
	 boolean error = false;
	 boolean makeNoSenseError = false;
	 boolean divedeByZeroError = false;
	
	void DivedeByZerroError(){
		error = true;
		divedeByZeroError = true;
	}
	
	 void MakesNoSenseError() { 
	error = true;
	makeNoSenseError = true;
	}
	
	String ErrorCheck(){
		if (error){
			if (makeNoSenseError) {
				return "ERROR: Calculation doesn't make sense";
			}
			if (divedeByZeroError) {
				return "ERROR: Divede by zero Error";
			}
		}
		
		return "";
	}

}
