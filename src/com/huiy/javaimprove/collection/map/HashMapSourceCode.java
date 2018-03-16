package com.huiy.javaimprove.collection.map;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** 
 * HashMap底层源码
 * @author : yuanhui 
 * @date   : 2018年3月8日
 * @version 1.0
 */
public class HashMapSourceCode<K,V> 
extends AbstractMap<K,V>
implements Map<K,V>{
 
	static final int DEFAULT_INITIAL_CAPACITY = 16;
    transient Entry[] table;
    transient int size;
    int threshold;
	
    
    public V put(K key,V value){
    	if(key==null)
    		putForNullKey(value);
    	int hash = hash(key.hashCode());
    	int i = indexFor(hash,table.length);
    	for(Entry<K,V> e = table[i];e != null;e = e.next){
    		 Object k;
    		if(e.hash == hash && ((k=e.key)==key || key.equals(k))){
    			V oldValue = e.value;
    			e.value = value;
    			return oldValue;
    		}
    	}
    	addEntry(hash,key,value,i);
    	return null;
    }
	
    
    public V get(Object key){
    	if(key==null)
    		getForNullKey();
    	int hash = hash(key.hashCode());
    	for(Entry<K,V> e = table[indexFor(hash,table.length)];e != null;e = e.next){
   		 	Object k;
   		 	if(e.hash == hash && ((k=e.key)==key || key.equals(k))){
	   			return e.value;
	   		}
    	}
    	return null;
    }
    
    
	private V putForNullKey(V value){
		for(Entry<K,V> e = table[0];e!=null;e=e.next){
			if(e.key==null){
				V oldValue = e.value;
				e.value = value;
				return oldValue;
			}
		}
		addEntry(0,null,value,0);
		return null;
	}
	
	private V getForNullKey(){
		for(Entry<K,V> e = table[0];e!=null;e=e.next){
			if(e.key==null){
				return e.value;
			}
		}
		return null;
	}
	
	/**
	 * @param hash key的hash值
	 * @param key
	 * @param value
	 * @param bucketIndex 数组下标
	 */
	void addEntry(int hash,K key,V value,int bucketIndex){
		Entry<K,V> e = table[bucketIndex];
		table[bucketIndex] = new Entry<K,V>(hash,key,value,e);
		 if (size++ >= threshold)
	            resize(2 * table.length);
	}
	
	void resize(int newCapacity){
		
	}
	
	static int hash(int hashCode){
		return hashCode;
	}
	
	static int indexFor(int hash,int length){
		return hash & length-1;
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

        public final K getKey() {
            return key;
        }

        public final V getValue() {
            return value;
        }

        public final V setValue(V newValue) {
	    V oldValue = value;
            value = newValue;
            return oldValue;
        }

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

        public final int hashCode() {
            return (key==null   ? 0 : key.hashCode()) ^
                   (value==null ? 0 : value.hashCode());
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        /**
         * This method is invoked whenever the value in an entry is
         * overwritten by an invocation of put(k,v) for a key k that's already
         * in the HashMap.
         */
        void recordAccess(HashMap<K,V> m) {
        }

        /**
         * This method is invoked whenever the entry is
         * removed from the table.
         */
        void recordRemoval(HashMap<K,V> m) {
        }
    }
	
	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
