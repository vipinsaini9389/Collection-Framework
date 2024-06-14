package Assignment;
import java.util.*;
public class Remove {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(67);
		list.add(69);
		list.add(64);
		list.add(63);
		System.out.println("Old List" + list);
		if(!list.isEmpty()) {
			list.removeFirst();
		}
		if(!list.isEmpty()) {
			list.removeLast();
		}
		System.out.println("New List"+list);

	}

}
