//Q1:- Create An ArrayList to add 10 Integer Objects and print only Prime Numbers from them.


package Assignment;

import java.util.ArrayList;
public class PrimeNumbers {
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
     
	public static void main(String[] args)throws Exception {
		ArrayList<Integer> List=new ArrayList<>();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		List.add(6);
		List.add(7);
		List.add(8);
		List.add(9);
		List.add(10);
		System.out.println("Prime numbers in the list are:");
        for(int i=0;i<=List.size()-1;i++) {
        	int num=List.get(i);
        	if (isPrime(num)) {
        		System.out.println(num);
        	}
        }
	}
}


