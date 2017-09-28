package output;

import java.io.IOException;

import input.Tree;

public class Calculation {
	public static void main(String[] args) throws IOException {
		Error error = new Error();
		String a = args[0]; // getString();
		Tree theTree = new Tree();
		theTree.createTree(a, 0);
		try {
			ReadingTree.readingTree(theTree.root);
		} catch (ArithmeticException exc) {
			error.DivedeByZerroError();
		}
		if (Error.error) {
			System.out.print("Error: ");
			if (Error.divedeByZeroError) {
				System.out.println("Dividing By Zero Error");
			}
		} else {
			System.out.println("Answer " + theTree.root.iData);
		}
	}
}
