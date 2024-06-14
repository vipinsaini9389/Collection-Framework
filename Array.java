package Assignment;
import java.util.*;
public class Array {
   public static void main(String[] args) {
	ArrayList<String> list =new ArrayList<>();
	list.add("Apple");
	list.add("Banana");
	list.add("Cherry");
	System.out.println("Old list"+list);
	String[] arr=new String[list.size()];
	arr=list.toArray(arr);
	for(String element:arr) {
		System.out.println("Array "+ element);
	}
}
}
