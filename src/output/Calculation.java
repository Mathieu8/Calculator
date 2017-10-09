package output;


import input.Tree;

public class Calculation {
	// public static void main(String[] args) {
	Error error = new Error();
	String question; // getString();
	static Double answer;
	String ErrorNote;

	public void makeTree() {
		System.out.println("inside calculation");
		Tree theTree = new Tree();
		theTree.createTree(question, 0);
		try {
			ReadingTree.readingTree(theTree.root);
		} catch (ArithmeticException exc) {
			error.DivedeByZerroError();
		}
		ErrorNote = error.ErrorCheck();
		answer = theTree.root.iData;
		
	}
	
	public void setQuestion(String temp){
		question = temp;
	}
	
	public double returnAnswer() {
		return answer;
	}
	
	public String returnError() {
		return ErrorNote;
	}
}
