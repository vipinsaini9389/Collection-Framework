//Q2:- Create A LinkedList of 10 String Objects in SmallLetters and Convert Them into UpperCase.

package Assignment;

import java.util.LinkedList;

public class ConvertUpperCase {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("orange");
		list.add("kiwi");
		list.add("strawberry");
		list.add("watermelon");
		list.add("pineapple");
		list.add("grape");
		list.add("apple");
		list.add("mango");
		list.add("banana");
		list.add("apple");
		
		System.out.println(list);
		
		for (int i=0;i<=list.size()-1;i++) {
			String s=list.get(i).toUpperCase();
					System.out.println(s);
		}
	}

}
