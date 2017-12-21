
package in.javacomics.datastructures;

public class InsertionSorter<E extends Comparable<E>>  implements Sorter<E>{

	@Override
	public E[] sort(E[] inputList) {
		for(int i=1; i<inputList.length;i++){
			E key = inputList[i];
			int j=i-1;
			while(j>0 && inputList[j].compareTo(key)>0){
				inputList[j+1]=inputList[j];
				j--;
			}
			 inputList[j+1]= key;
		}
			
		return inputList;
	}

}
