package filesClass;

import java.io.PrintWriter;


public class PrintWriterrr {

	public static void main(String[] args) {
		String data = "This is a text inside the file.";
		
		try {
			PrintWriter output = new PrintWriter("//Users//cesarbeltran//Desktop//TestingFolder//output.txt");
			output.print(data);
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
