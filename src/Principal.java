import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		System.out.println(generatePassword(true, true, false, true, 13));
	}

	public static String generatePassword(boolean lowercase, boolean uppercase, boolean num, boolean symbol, int length) {
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

	public static void generateTxt(String pass, String location, String route,String name) throws IOException{
		String name1=name;
		if(name==null){
			name1="Password";
		}
		String route1=route;
		if (route1==null){
        route1 ="C:/"+name1+".txt";
		}else{
//TODO method to change \ into /
		}
        File Txt = new File(route1);
       
        if(Txt.exists()) {
        	try{
                FileWriter fw=new FileWriter(route1,true);
                fw.write("		"+location+" --> "+pass+"		");
                fw.close();
            }catch(IOException e){
                System.out.println("Error E/S: "+e);
            }
        } else {
        	 BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(Txt));
            bw.write(location+" --> "+pass+"		");
            bw.close();
        }
       
	}
}
