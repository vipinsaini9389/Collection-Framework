package Assignment;
import java.util.*;
public class priorityqueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> list = new PriorityQueue<>();
		list.add(34);
		list.add(35);
		list.add(36);
		list.add(37);
		list.add(38);
		System.out.println("Old list "+list);
		Integer[] arr=new Integer[list.size()];
		arr=list.toArray(arr);
		
		for(Integer element:arr) {
			System.out.println("Array "+element);
		}

	}

}
