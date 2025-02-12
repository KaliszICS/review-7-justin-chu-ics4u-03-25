public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd(int hello) {
		if (hello % 2 == 0) {
			return "Even";
		}

		else {
			return "Odd";
		}
	}

	public static String teacherOrStudent (String hallo) {
		if (hallo.equals("Kalisz")) {
			return "Teacher";
		}

		else {
			return "Student";
		}
	}
	
	public static int fartherFromZero (int baka) {
		if (baka > 0) {
			return baka + 5;
		}

		else {
			if (baka < 0) {
				return baka - 5;
			}

			else {
				return 0;
			}
		}
	}

	public static String isFive(int isitfive) {
		if (isitfive == 5) {
			return "The number is Five";
		}

		else {
			return "The number is not Five";
		}
	}

	public static String positiveOrNegative(int positivenegative) {
		if (positivenegative > 0) {
			return "Positive";
		}

		else {
			return "Negative";
		}
	}

	public static String highOrLow(int overahunned) {
		if (overahunned > 100) {
			return "High";
		}

		else {
			return "Low";
		}
	}

	public static String isHello(String helloquestionmark) {
		if (helloquestionmark.equals("Hello")) {
			return "The word is Hello";
		}

		else {
			return "The word is not Hello";
		}
	}


}
