package application;

class Ring<E> {
	private E[] items;
	private int writePosition = 0;
	private int numberOfItems = 0;

	@SuppressWarnings("unchecked")
	public Ring(int size) {
		items = (E[]) new Object[size];
	}

	public void add(E element) {
		items[writePosition++] = element;

		if (writePosition == items.length) {
			writePosition = 0;
		}

		if (++numberOfItems > items.length) {
			numberOfItems = items.length;
		}
	}

	public int size() {
		return numberOfItems;
	}

	public E get(int index) {
		return items[index];
	}

}

public class App {

	public static void main(String[] args) {
		Ring<Integer> ring = new Ring<>(3);
		ring.add(1);
		ring.add(2);
		ring.add(3);
		ring.add(4);
		ring.add(5);
		
		for(int i=0;i<ring.size();i++) {
			System.out.println(ring.get(i));
		}
	}

}
