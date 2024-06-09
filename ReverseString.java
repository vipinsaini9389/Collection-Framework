//Q5:- Create An ArrayList of 10 String Objects and Reverse All the Strings by using Stack.
package Assignment;
import java.util.ArrayList;
import java.util.Stack;
public class ReverseString {

	public static void main(String[] args) {
	ArrayList<String> list1=new ArrayList<>();
	ArrayList<String> list2=new ArrayList<>();
	Stack<Character> st=new Stack<>();
	list1.add("Diya");
	list1.add("Agastya");
	list1.add("Dhruv");
	list1.add("Kabir");
	list1.add("deep");
	list1.add("Mohit");
	list1.add("Lakshit");
	list1.add("Kavish");
	list1.add("Diya");
	list1.add("Vipin");
	for(String str:list1) {
		for(int i=0;i<str.length();i++) {
			st.push(str.charAt(i));
		}
		String temp="";
		for(int i=0;i<str.length();i++) {
			temp=temp+st.pop();
		}
		list2.add(temp);
	}
	
	System.out.println(list1);
	System.out.println(list2);

	}

}
