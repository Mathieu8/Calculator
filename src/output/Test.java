package output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import input.Node;
import input.Tree;

public class Test {
	public static void main(String[] args) throws IOException {
		Error error = new Error();
		String a = args[0]; //getString();
		Tree theTree = new Tree();
		theTree.createTree(a, 0);

		ReadingTree.readingTree(theTree.root);
		if (Error.error) {
			System.out.print("Error: ");
			if (Error.divedeByZeroError) {
				System.out.println("Dividing By Zero Error");
			}
		} else {
			System.out.println("Answer " + theTree.root.iData);
		}
		
		
		System.out.println("function that are accepted:");
		System.out.println(
				"plus( + ), minus( - ), multiplcation( * or x ), division( / ), modulus( % ), power( ^ ), factorial( ! ), sine( sin( ) ), cosine( cos( ) ), tangent( tan( ) and parentheses( ( ) )");
		System.out.print("insert: ");
		String a1 = getString();
		Tree theTree1 = new Tree();
		theTree1.createTree(a1, 0);

		ReadingTree.readingTree(theTree1.root);
		if (Error.error) {
			System.out.print("Error: ");
			if (Error.divedeByZeroError) {
				System.out.println("Dividing By Zero Error");
			}
		} else {
			System.out.println("Answer " + theTree1.root.iData);
		}
	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
