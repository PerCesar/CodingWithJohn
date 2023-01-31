package filesClass;

import java.io.FileInputStream;

public class FileInput {

	public static void main(String[] args) {
		try {
		FileInputStream fin=new FileInputStream("//Users//cesarbeltran//Desktop//TestingFolder//sourcefile.txt");
			int i = 0;
			//System.out.println(fin.read())
			while((i=fin.read()) !=-1) {
				System.out.print((char)i);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
