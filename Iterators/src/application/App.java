package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		ArrayList <Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5));
		
//		for(Iterator<Integer> it = numbers.iterator();it.hasNext();) {
//			Integer number = it.next();
//			System.out.println(number);
//		}
		
//		Iterator<Integer> it = numbers.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		for( var it= numbers.listIterator();it.hasNext();) {
			var number = it.next();
			if(number == 2) {
				it.remove();
			}
			else if (number == 3){
				it.add(10);
			}
			else if (number == 1){
				it.set(100);
			}
			// System.out.println(number);
		}
		
		numbers.forEach(System.out::println);
	}

}
