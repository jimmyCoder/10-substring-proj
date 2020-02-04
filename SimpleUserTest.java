package tenStrProj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * A class that allows the user to make tests.
 * @author jpd
 *
 */
public class SimpleUserTest {
	/**
	 * A very simple TUI for users.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//Enter data using BufferReader
		String input="";
		BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a String value for which you would like me to list all of the 10 Substrings.");
		System.out.println("When you are done, type 'exit' to finish.");
		while(input!="exit") {


	        // Reading data using readLine 
	        input = reader.readLine();
	        InitAlgo al=new InitAlgo(input);
	        al.implementAlgo();
			ArrayList<String> iA3Res=al.getResults();

			System.out.println("Results from String");
			if(iA3Res.size()!=0) {
				System.out.println("Number of Results: "+iA3Res.size()+"\n");
				for(int i= 0;i<iA3Res.size();i++) {
					System.out.print(iA3Res.get(i)+", ");
				}
			}else {
				System.out.println("No valid 10 string results!\n");
			}System.out.println();


			//If the user wishes to continue, display the message again.
	        if(input!="exit") {
	    		System.out.println("Please enter a String value for which you would like me to list all of the 10 Substrings.");
	    		System.out.println("When you are done, type 'exit' to finish.");
	        }
		}System.out.println("Thank you for using the Simple User Test program!!\nHave a good day!");

	}
}
