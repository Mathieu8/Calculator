package calculator5;

public class MakingText {
	String numbers = "1234567890.";
	String operators = "+-*/^!()abcdefghijklmnopqrstuvwxyz";
	String string = "";
	boolean empty = true;

	void addChar(char c) {
		empty = false;
		string += c;
	}

	void addInt(int i) {
		empty = false;
		string += i;
	}

	void addString(String s) {
		empty = false;
		string += s;
	}

	void newString(String s) {
		string = s;
	}

	void removeChar() {
		String temp = "";
		for (int i = 0; i < string.length(); i++) {
			temp += string.charAt(i);
		}
		string = temp;
	}

	void deleteString() {
		string = "";
	}

	boolean setClear() {
		return empty;
	}

	void readable() {
		String temp = "";
		int b = 0;
		for (int i = 0; i < string.length(); i++) {
			//System.out.println(temp);
			if (string.charAt(i) == ' ') {
			} else if (string.charAt(i) == 'x')
				temp += '*';
			else if (string.charAt(i) == 'X')
				temp += '*';
			else if (string.charAt(i) == '(') {
				b += 1;
				temp += '(';
			} else if (string.charAt(i) == ')') {
				if (b <= 0) {
				} else {
					temp += ')';
					b -= 1;
				}
			}

			else
				temp += string.charAt(i);
		}
		if (b != 0) {
			b--;
			for (b++; b > 0; b--) {
				temp += ')';
				System.out.println(temp);
			}
		}
		string = temp;
		//System.out.println(string);
	}

	void logical() {
		readable();
		logicalGemo();
		logicalDot();
	}

	void logicalGemo() {
		//System.out.println("Logical Gemo");
		String temp = "";
		int l = string.length();
		for (int i = 0; i < l; i++) {
			//System.out.println(temp);
			if (i < l - 4) {
				// sin
				if ((aNumber(i)) && ((string.charAt(i + 1) == 's') && (string.charAt(i + 2) == 'i')
						&& (string.charAt(i + 3) == 'n'))) {
					temp = temp + string.charAt(i) + "*";
				} else if ((aNumber(i)) && ((string.charAt(i + 1) == 'c') && (string.charAt(i + 2) == 'o')
						&& (string.charAt(i + 3) == 's'))) {
					temp = temp + string.charAt(i) + "*";
				} else if ((aNumber(i)) && ((string.charAt(i + 1) == 't') && (string.charAt(i + 2) == 'a')
						&& (string.charAt(i + 3) == 'n'))) {
					temp = temp + string.charAt(i) + "*";
				} else
					temp += string.charAt(i);
				
			} else
				temp += string.charAt(i);

		}
		//System.out.println(temp);
		string = temp;
	}

	void logicalDot() {
		
		//System.out.println();
		//System.out.println("logical dot");
		String temp = "";
		
		for (int i = 0; i < string.length() - 1; i++) {
			//System.out.print(temp);
			if ((string.charAt(i) == '.') && anOperator(i + 1)) {
				//System.out.println(" A ");
				//temp += string.charAt(i);
			} else {
				//System.out.println(" B ");
				temp += string.charAt(i);
			}
		}
		
		temp += string.charAt(string.length()-1);
		string = temp;
		//System.out.println(string);

	}

	boolean anOperator(int i) {
		char ch = string.charAt(i);
		String CH = "" + ch;
		return operators.contains(CH);
	}

	boolean aNumber(int i) {
		char ch = string.charAt(i);
		String CH = "" + ch;
		return numbers.contains(CH);

	}
}