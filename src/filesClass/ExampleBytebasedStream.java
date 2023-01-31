package filesClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleBytebasedStream {

	public static void main(String[] args)throws IOException {
	       FileInputStream in = null;
	       FileOutputStream out = null;
	       try {
	           in = new FileInputStream("//Users//cesarbeltran//Desktop//TestingFolder//sourcefile.txt");
	           out = new FileOutputStream("/Users//cesarbeltran//Desktop//TestingFolder//sampleOutput4.txt");
	           int c;
	           while ((c = in.read()) != -1) { // read byte by byte
	               out.write(c); // write byte by byte}
	               System.out.println("Reading and Writing has been success!!");
	           }
	       }
	           catch(Exception e){
	               System.out.println(e);
	           }finally {
	               if (in != null) {
	                   in.close();
	               }
	               if (out != null) {
	                   out.close();
	               }  }
	       }
	   }

