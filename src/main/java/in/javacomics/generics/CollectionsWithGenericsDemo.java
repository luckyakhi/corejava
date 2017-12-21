package in.javacomics.generics;

import java.util.ArrayList;

public class CollectionsWithGenericsDemo {

	public static void main(String[] args) {
		MyArrayList sortableList = new MyArrayList();
		sortableList.add("item1");
	}

}
class MyArrayList extends ArrayList<String>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6635421276528375509L;
	
}