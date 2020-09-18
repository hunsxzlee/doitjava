package chapter12;

public class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K kay, V value) {
		this.key = key;
		this.value = value;
	}
	
	public void setKey(K key) { this.key = key; }
	public void setValue(V value) {this.value = value; }
	public K getKey()	{ return key; }
	public V getValue()	{ return value; }
}
