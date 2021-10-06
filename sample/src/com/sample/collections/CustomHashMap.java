/**
 * 
 */
package com.sample.collections;

/**
 * @author Ramesh_Mamidala
 *
 */
public class CustomHashMap<K, V> {
	
	private Entry<K,V>[] table; // Array of Entry or Nodes
	private int capacity = 4; // initial capacity
	
	static class Entry<K,V> {
		K key;
		V value;
		Entry<K,V> next;
		
		public Entry(K key, V value, Entry<K,V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
			
		}
		
	}
	@SuppressWarnings("unchecked")
	public CustomHashMap() {
		table = new Entry[capacity];
		
	}

}
