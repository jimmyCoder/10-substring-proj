package tenStrProj;

import java.util.ArrayList;

/**
 * The super class of all algorithms
 * @author jpd
 *
 */
public abstract class Algo {
	private String findTenStrings;
	private ArrayList<String> valid10Strs;
	public Algo(String s) {
		findTenStrings=s;
	}
	/**
	 * Implement the algorithm.
	 */
	abstract public void implementAlgo();
	public ArrayList<String> getResults(){
		return valid10Strs;
		
	}
}
