package tenStrProj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A class to implement the algorithms
 * @author jpd
 *
 */
public class TestAlgos {

	/**
	 * A method to test individual runs.
	 * Let algoType = 0 for initAlgo, other numbers may be assigned for other algorithms.
	 * @param seed
	 * @param trialNumber
	 * @param algoType
	 * @throws IOException 
	 */
	public static String writeFile;
	public static String path;
	public static BufferedWriter writer;
	/**
	 * A method to display the results of the tests.
	 * @param seed
	 * @param trialNumber
	 * @param algoType
	 * @param res
	 * @throws IOException
	 */
	public static void displayResults(String seed, int trialNumber, int algoType, ArrayList<String>res) throws IOException {
		
		
		 String str = "";
		 String algType="";
		 if(algoType==0) {algType="initAlgo";}
		 else {algType="Unknown Algorithm";}
		 
		 str=str+algType+"\nTrial No. = "+trialNumber+"\nStringanalyzed"+seed+"\nNumber of results: "+res.size()+ "\nResults:\n";
		 for(int i=0;i < res.size();i++) {
			 str=str+res.get(i);
			 if(i<res.size()-1) {
				 str=str+", ";
			 }
		 }
		 str=str+"end of result.\n\n\n";
		 
		 writer.write(str);
	}
	/**
	 * Test everything
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException  {
		path = "C:\\Users\\jpd\\Documents\\tortoiseSVNProjects\\JavaProjectForInterview\\workingCopy\\tenStrProj\\";
		writeFile="resultsForAlgorithms.txt";
		writer = new BufferedWriter(new FileWriter(path+writeFile));
		BufferedReader reader = null;
		ArrayList<String> testVals=new ArrayList<String>();
		try {
		    File file = new File(path+"testValuesInitAlgo.txt");
		    reader = new BufferedReader(new FileReader(file));

		    String line;
		    while ((line = reader.readLine()) != null) {
		        testVals.add(line);
		    }

		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        reader.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
		
		
		
		for(int i=0;i<testVals.size();i++) {
			Algo a=new InitAlgo(testVals.get(i));
			a.implementAlgo();
			ArrayList<String> res=a.getResults();
			displayResults(testVals.get(i),i,0,res);
		}

		 writer.close();
		
//		Algo iA=new InitAlgo("1231111234231512351235123564551adfpaoisdfpoaihdpaosdhf");
//		iA.implementAlgo();
//		ArrayList<String> res=iA.getResults();
//		test("1231111234231512351235123564551adfpaoisdfpoaihdpaosdhf",0,0,res);
		
		
		

		
	}
}
