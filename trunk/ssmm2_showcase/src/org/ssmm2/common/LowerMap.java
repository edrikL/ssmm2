package org.ssmm2.common;
import java.util.HashMap;
import java.util.Map;

public class LowerMap<K, V> extends HashMap<K, V> {
	
	private static final long serialVersionUID = 2990141598626804481L;

	public LowerMap() {
		super();
	}
	
	public LowerMap(int initialCapacity) {
		super(initialCapacity);
	}
	
	public LowerMap(int initialCapacity, float loadFactor){
		super(initialCapacity,loadFactor);
	}
	
    public LowerMap(Map<? extends K, ? extends V> m) {
         super(m);
    }

	@SuppressWarnings("unchecked")
	public V put(K key, V value) {
		if (key instanceof String)
			key = (K) key.toString().toLowerCase();
		return super.put(key, value);
	}

}
