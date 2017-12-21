package in.javacomics.datastructures.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class HashMap<K,V> implements Map<K, V>{
	
	private static final int DEFAULT_CAPCAITY = 10;
	private Node<K,V>[] table;
	private int capacity;
	
	@SuppressWarnings("unchecked")
	private HashMap() {
		capacity=DEFAULT_CAPCAITY;
		table= (Node<K, V>[]) new Object[capacity];
	}
	

	private HashMap(int capacity) {
		super();
		this.capacity = capacity;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(Object key) {
		int bucketNumber = calculateHash(key);
		Node<K,V> temp = table[bucketNumber];
		while(temp!=null && !temp.key.equals(key)){
			temp=temp.nextNode;
		}
		if(temp!=null) return temp.value;
		return null;
	}

	@Override
	public V put(K key, V value) {
		int bucketNumber = calculateHash(key);
		if(table[bucketNumber]==null){
			table[bucketNumber]=new Node<K,V>(key, value, null);
			return null;
		}
		Node<K,V> temp = table[bucketNumber];
		while(temp.nextNode!=null && !temp.key.equals(key)){
			temp=temp.nextNode;
		}
		if(temp.nextNode==null){
			temp.nextNode= new Node<K,V>(key, value, null); 
		}else{
			V oldValue = temp.value;
			temp = new Node<K,V>(key, value, null);
			return oldValue;
		}
		return null;
		
	}

	private int calculateHash(Object key) {
		return key.hashCode()%capacity;
	}


	@Override
	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
	private class Node<K,V>{
		private K key;
		private V value;
		private Node<K,V> nextNode;
		private Node(K key, V value, Node<K, V> nextNode) {
			super();
			this.key = key;
			this.value = value;
			this.nextNode = nextNode;
		}
		public K getKey() {
			return key;
		}
		public V getValue() {
			return value;
		}
		public Node<K, V> getNextNode() {
			return nextNode;
		}
		
		
	}
 
}
