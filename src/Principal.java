
public class Principal {

	public static String generatePassword(boolean lowercase, boolean uppercase, boolean num, boolean symbol,
			int length) {
		/*
		 * This method will create the random password. Depending on the
		 * parameters defined by the user it will work in different ways.
		 */

		// The password will be generated using a StringBuilder.
		StringBuilder password = new StringBuilder();

		/*
		 * A while loop will generate the password's characters one by one until
		 * the password has the same length as the user defined. To do this we
		 * are using a counter
		 */
		int counter = 0;
		while (counter < length) {
			int randomchar = (int) (Math.random() * 1000);

			if (lowercase) {
				if ((randomchar >= 97) && (randomchar <= 122)) {
					password.append((char) randomchar);
					counter++;
				}
			}

			if (uppercase) {
				if ((randomchar >= 65) && (randomchar <= 90)) {
					password.append((char) randomchar);
					counter++;
				}
			}

			if (num) {
				if ((randomchar >= 48) && (randomchar <= 57)) {
					password.append((char) randomchar);
					counter++;
				}
			}

			if (symbol) {
				if ((randomchar >= 33) && (randomchar <= 47)) {
					password.append((char) randomchar);
					counter++;
				}
			}

		}
		return password.toString();
	}

	public static void main(String[] args) {
		System.out.println(generatePassword(true, true, false, true, 13));
	}

}
