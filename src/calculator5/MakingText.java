package calculator5;

public class MakingText {
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
			if (string.charAt(i) == ' ') {
			} else if (string.charAt(i) == 'x')
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
			for (b++; b > 0; b--)
				temp += ')';
		}
		string = temp;
	}

	void logical() {
		logicalGemo();
		logicalDot();
	}

	void logicalGemo() {
		String temp = "";
		int l = string.length();
		for (int i = 0; i < l-4; i++) {
				// sin
				if ((aNumber(i)) && ((string.charAt(i + 1) == 's') && (string.charAt(i + 2) == 'i')
						&& (string.charAt(i + 3) == 'n'))) {
					temp += string.charAt(i) + '*';
				}
				// cos
				else if ((aNumber(i)) && ((string.charAt(i + 1) == 'c') && (string.charAt(i + 2) == 'o')
						&& (string.charAt(i + 3) == 's'))) {
					temp += string.charAt(i) + '*';
				}
				// tan
				else if ((aNumber(i)) && ((string.charAt(i + 1) == 't') && (string.charAt(i + 2) == 'a')
						&& (string.charAt(i + 3) == 'n'))) {
					temp += string.charAt(i) + '*';
				}
				else temp += string.charAt(i);
				
			}
		string = temp;
	}

	void logicalDot() {
		String temp = "";
		for (int i = 0; i < string.length()-1; i++) {
			if(!(string.charAt(i)=='.')&& !anOperator(i+1)) {
				temp += string.charAt(i);
			}
			else temp += string.charAt(i);
		}
		string = temp;

	}

	boolean anOperator(int i) {
		if (string.charAt(i) == '+')
			return true;
		if (string.charAt(i) == '-')
			return true;
		if (string.charAt(i) == '*')
			return true;
		if (string.charAt(i) == '/')
			return true;
		if (string.charAt(i) == '!')
			return true;
		if (string.charAt(i) == '^')
			return true;
		if (string.charAt(i) == '(')
			return true;
		if (string.charAt(i) == ')')
			return true;
		return false;
	}

	boolean aNumber(int i) {
		if (string.charAt(i) == '0')
			return true;
		if (string.charAt(i) == '1')
			return true;
		if (string.charAt(i) == '2')
			return true;
		if (string.charAt(i) == '3')
			return true;
		if (string.charAt(i) == '4')
			return true;
		if (string.charAt(i) == '5')
			return true;
		if (string.charAt(i) == '6')
			return true;
		if (string.charAt(i) == '7')
			return true;
		if (string.charAt(i) == '8')
			return true;
		if (string.charAt(i) == '9')
			return true;
		if (string.charAt(i) == '.')
			return true;
		else
			return false;

	}
}