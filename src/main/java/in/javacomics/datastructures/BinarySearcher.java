package in.javacomics.datastructures;

public class BinarySearcher<V extends Comparable<V>> implements Searcher<V>{

	@Override
	public int search(V[] inputArray,V searchKey) {
		return search(inputArray,searchKey,0,inputArray.length-1);
		
	}

	private int search(V[] inputArray, V searchKey, int startIndex, int endIndex) {
		int mid = (startIndex+endIndex)/2;
		if(inputArray[mid].equals(searchKey)) return mid;
		if(inputArray[mid].compareTo(searchKey)>0){
			return search(inputArray,searchKey, 0, mid-1);
		}else{
			return search(inputArray,searchKey,mid+1,endIndex);
		}
	}


}
