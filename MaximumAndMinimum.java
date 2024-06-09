//Q3:- Create A Vector of 10 Integer Objects and Find Maximum and minimum value from them.

package Assignment;


import java.util.Collections;
import java.util.Vector;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		 Vector<Integer> vc=new Vector<>();
		 vc.add(12);
		 vc.add(6);
		 vc.add(2);
		 vc.add(82);
		 vc.add(32);
		 vc.add(72);
		 vc.add(92);
		 vc.add(42);
		 vc.add(62);
		 vc.add(52);
		 
		 int max = Collections.max(vc);
		 int min = Collections.min(vc);
		 
		 System.out.println("Maximum "+max);
		 System.out.println("Minimum "+min);
	}

}
