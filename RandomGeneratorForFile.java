package tenStrProj;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RandomGeneratorForFile {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\jpd\\Documents\\tortoiseSVNProjects\\JavaProjectForInterview\\workingCopy\\tenStrProj\\";
		String fName="testValuesInitAlgo.txt";

		int trials = 1000;
		int length = 75;
		String[] values=new String[trials];
		for(int i=0;i<trials;i++) {
			values[i]="";
			for(int j=0;j<length;j++) {
				int r=(int) Math.round(10*Math.random());
				values[i]=values[i]+r;
			}
		}


		BufferedWriter bw = null;

			String str ="";
			for(int i=0;i<trials;i++) {
				str=str+values[i];
				if(i<trials-1)str=str+"\n";							//I don't want that extra line at the end.
			}
			//Specify the file name and path here
			File file = new File(path+fName);

			/* This logic will make sure that the file
			 * gets created if it is not present at the
			 * specified location*/
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(str);
			System.out.println("File written Successfully");

			bw.close();
	}
}
