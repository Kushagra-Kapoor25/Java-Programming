package application;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3));
		list.clear();
		System.out.println(list);
	}

}
