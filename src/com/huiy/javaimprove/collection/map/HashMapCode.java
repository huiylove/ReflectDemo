package com.huiy.javaimprove.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2018年1月24日
 * @version 1.0
 */
public class HashMapCode<K,V> implements Map<K,V>{

	  /**
     * The default initial capacity - MUST be a power of two.
     */
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    /**
     * The maximum capacity, used if a higher value is implicitly specified
     * by either of the constructors with arguments.
     * MUST be a power of two <= 1<<30.
     */
    static final int MAXIMUM_CAPACITY = 1 << 30;

    /**
     * The load factor used when none specified in constructor.
     */
    static final float DEFAULT_LOAD_FACTOR = 0.75f;

    /**
     * The table, resized as necessary. Length MUST Always be a power of two.
     */
    transient Entry[] table;

    /**
     * The number of key-value mappings contained in this map.
     */
    transient int size;

    /**
     * The next size value at which to resize (capacity * load factor).
     * @serial
     */
    int threshold;

    /**
     * The load factor for the hash table.
     *
     * @serial
     */
    final float loadFactor;

    /**
     * The number of times this HashMap has been structurally modified
     * Structural modifications are those that change the number of mappings in
     * the HashMap or otherwise modify its internal structure (e.g.,
     * rehash).  This field is used to make iterators on Collection-views of
     * the HashMap fail-fast.  (See ConcurrentModificationException).
     */
    transient volatile int modCount;
    
    public HashMapCode(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal initial capacity: " +
                                               initialCapacity);
        if (initialCapacity > MAXIMUM_CAPACITY)
            initialCapacity = MAXIMUM_CAPACITY;
        if (loadFactor <= 0 || Float.isNaN(loadFactor))
            throw new IllegalArgumentException("Illegal load factor: " +
                                               loadFactor);

        // Find a power of 2 >= initialCapacity
        int capacity = 1;
        while (capacity < initialCapacity)
            capacity <<= 1;

        this.loadFactor = loadFactor;
        threshold = (int)(capacity * loadFactor);
        table = new Entry[capacity];
        init();
    }
    
    void init() {
    }
    
	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("apple",12);
		map.remove("apple");
		
	}
	
	 @Override
	public V put(K key, V value) {
	        if (key == null)
	            return putForNullKey(value);
	        int hash = hash(key.hashCode());
	        int i = indexFor(hash, table.length);
	        for (Entry<K,V> e = table[i]; e != null; e = e.next) {
	            Object k;
	            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
	                V oldValue = e.value;
	                e.value = value;
	                e.recordAccess(this);
	                return oldValue;
	            }
	        }

	        modCount++;
	        addEntry(hash, key, value, i);
	        return null;
	   }
	 
	   static int hash(int h) {
	        // This function ensures that hashCodes that differ only by
	        // constant multiples at each bit position have a bounded
	        // number of collisions (approximately 8 at default load factor).
	        h ^= (h >>> 20) ^ (h >>> 12);
	        return h ^ (h >>> 7) ^ (h >>> 4);
	    }
	 
	 	/**
	     * Offloaded version of put for null keys
	     */
	    private V putForNullKey(V value) {
	        for (Entry<K,V> e = table[0]; e != null; e = e.next) {
	            if (e.key == null) {
	                V oldValue = e.value;
	                e.value = value;
	                e.recordAccess(this);
	                return oldValue;
	            }
	        }
	        modCount++;
	        addEntry(0, null, value, 0);
	        return null;
	    }
	    
	    static class Entry<K,V> implements Map.Entry<K,V> {
	        final K key;
	        V value;
	        Entry<K,V> next;
	        final int hash;

	        /**
	         * Creates new entry.
	         */
	        Entry(int h, K k, V v, Entry<K,V> n) {
	            value = v;
	            next = n;
	            key = k;
	            hash = h;
	        }

	        @Override
			public final K getKey() {
	            return key;
	        }

	        @Override
			public final V getValue() {
	            return value;
	        }

	        @Override
			public final V setValue(V newValue) {
		    V oldValue = value;
	            value = newValue;
	            return oldValue;
	        }

	        @Override
			public final boolean equals(Object o) {
	            if (!(o instanceof Map.Entry))
	                return false;
	            Map.Entry e = (Map.Entry)o;
	            Object k1 = getKey();
	            Object k2 = e.getKey();
	            if (k1 == k2 || (k1 != null && k1.equals(k2))) {
	                Object v1 = getValue();
	                Object v2 = e.getValue();
	                if (v1 == v2 || (v1 != null && v1.equals(v2)))
	                    return true;
	            }
	            return false;
	        }

	        @Override
			public final int hashCode() {
	            return (key==null   ? 0 : key.hashCode()) ^
	                   (value==null ? 0 : value.hashCode());
	        }

	        @Override
			public final String toString() {
	            return getKey() + "=" + getValue();
	        }

	        /**
	         * This method is invoked whenever the value in an entry is
	         * overwritten by an invocation of put(k,v) for a key k that's already
	         * in the HashMap.
	         */
	        void recordAccess(HashMapCode<K,V> m) {
	        }

	        /**
	         * This method is invoked whenever the entry is
	         * removed from the table.
	         */
	        void recordRemoval(HashMapCode<K,V> m) {
	        }
	    }
	    
	    void addEntry(int hash, K key, V value, int bucketIndex) {
	    	Entry<K,V> e = table[bucketIndex];
	            table[bucketIndex] = new Entry<K,V>(hash, key, value, e);
	            if (size++ >= threshold)
	                resize(2 * table.length);
	    }
	    
	    void resize(int newCapacity) {
	        Entry[] oldTable = table;
	        int oldCapacity = oldTable.length;
	        if (oldCapacity == MAXIMUM_CAPACITY) {
	            threshold = Integer.MAX_VALUE;
	            return;
	        }

	        Entry[] newTable = new Entry[newCapacity];
	        transfer(newTable);
	        table = newTable;
	        threshold = (int)(newCapacity * loadFactor);
	    }
	    
	    /**
	     * Transfers all entries from current table to newTable.
	     */
	    void transfer(Entry[] newTable) {
	        Entry[] src = table;
	        int newCapacity = newTable.length;
	        for (int j = 0; j < src.length; j++) {
	            Entry<K,V> e = src[j];
	            if (e != null) {
	                src[j] = null;
	                do {
	                    Entry<K,V> next = e.next;
	                    int i = indexFor(e.hash, newCapacity);
	                    e.next = newTable[i];
	                    newTable[i] = e;
	                    e = next;
	                } while (e != null);
	            }
	        }
	    }
	    
	    /**
	     * Returns index for hash code h.
	     */
	    static int indexFor(int h, int length) {
	        return h & (length-1);
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
			// TODO Auto-generated method stub
			return null;
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

}
