package tenStrProj;

import java.util.ArrayList;

/**
 * An implementation of my first algorithm
 * @author jpd
 *
 */
public class InitAlgo extends Algo {
	private static String findTenStrings;
	private static ArrayList<String> valid10Strs;

	/**
	 * constructor
	 * @param s
	 */
	public InitAlgo(String s) {
		super(s);
		findTenStrings=s;
		valid10Strs=new ArrayList<String>();
	}

	/**
	 * implement the algorithm;
	 */
	@Override
	public void implementAlgo() {
		char[] c =findTenStrings.toCharArray();
		int n = findTenStrings.length();

		for(int i = 0;i<n;i++) {
			int sum =0;
			String candidateStr="";

			for(int j=i;j<n;j++){
				if(!Character.isDigit(c[j])) {
					continue;
				}

				int temp=Character.getNumericValue(c[j]);
				sum += temp;

				if(sum>10)
					continue;
				String s = ""+c[j];
				candidateStr=candidateStr+s;

				if(sum==10) {
					valid10Strs.add(candidateStr);
					continue;
				}
			}
		}
	}

	/**
	 * Return results
	 * @return
	 */
	public ArrayList<String> getResults(){
		return valid10Strs;
	}

	/**
	 * A testing method
	 * basic tests
	 * @param args
	 */
	public static void main(String[] args) {
		Algo iA1=new InitAlgo("1234567895555555");
		iA1.implementAlgo();
		ArrayList<String> iA1Res=iA1.getResults();

		System.out.println("iA1 Results");
		if(iA1Res.size()>0) {
			System.out.println(iA1Res.size());
			for(int i= 0;i<iA1Res.size();i++) {
				System.out.println(iA1Res.get(i));
			}
		}else {
			System.out.println("No valid 10 string results!\n");
		}

		Algo iA2=new InitAlgo("this isn't supposed to yield any valid results");
		iA2.implementAlgo();
		ArrayList<String> iA2Res=iA2.getResults();

		System.out.println("iA2 Results");
		if(iA2Res.size()!=0) {
			System.out.println(iA2Res.size());
			for(int i= 0;i<iA2Res.size();i++) {
				System.out.println(iA2Res.get(i));
			}
		}else {
			System.out.println("No valid 10 string results!\n");
		}


		Algo iA3=new InitAlgo("123455 not a number insert 55821928374655");
		iA3.implementAlgo();
		ArrayList<String> iA3Res=iA3.getResults();

		System.out.println("iA3 Results");
		if(iA3Res.size()!=0) {
			System.out.println(iA3Res.size());
			for(int i= 0;i<iA3Res.size();i++) {
				System.out.println(iA3Res.get(i));
			}
		}else {
			System.out.println("No valid 10 string results!\n");
		}
	}
}
