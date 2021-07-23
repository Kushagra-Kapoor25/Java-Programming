package application;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=0;i<10;i++) {
			list.add(i);
		}
		
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		
		
	}

}

