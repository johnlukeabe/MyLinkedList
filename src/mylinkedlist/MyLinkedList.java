package mylinkedlist;

import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList<String> myll = new LinkedList<String>();
		
		System.out.println("size:" + myll.size());
		myll.add(1, "Brand");
		System.out.println(myll);
		myll.add(0, "Cho'Gath");
		System.out.println(myll);
		myll.addFirst("Darius");
		System.out.println(myll);
		myll.addLast("Ezreal");
		System.out.println(myll);
		System.out.println("size:" + myll.size());
		System.out.println(myll.getFirst());
		System.out.println(myll.getLast());
		System.out.println(myll.get(2));
		myll.removeFirst();		
		System.out.println(myll);
		myll.removeLast();
		System.out.println(myll);
		myll.remove(1);
		System.out.println(myll);
	}
}
