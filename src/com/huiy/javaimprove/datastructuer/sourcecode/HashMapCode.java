package com.huiy.javaimprove.datastructuer.sourcecode;

import java.util.Map;

/** 
 * 
 * @author : yuanhui 
 * @date   : 2018年6月14日
 * @version : 1.0
 * Hash 散列 将一个任意的长度通过某种算法（hash算法）变成一个固定的值
 * 
 */
public class HashMapCode<K,V> {
	
	 static final int DEFAULT_INITIAL_CAPACITY = 16;
	 
	 static final int MAXIMUM_CAPACITY = 1 << 30;

	 //加载因子系数 ，在容量的3/4时进行扩容
	 static final float DEFAULT_LOAD_FACTOR = 0.75f;
	 
	 transient Entry[] table;
	 
	 int threshold = (int)(DEFAULT_INITIAL_CAPACITY*DEFAULT_LOAD_FACTOR);

	 transient int size;

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
	    	 
	 public V put(K key,V value){
		 
		 return null;
	 }
	 
	 public V putForNullKey(V value){
		 for(Entry<K,V> e = table[0];e != null;e = e.next){
			 if(e.key==null){
				 V oldValue = e.value;
				 e.value = value;		
				 return oldValue;
			 }
		 }
		 //addEntry(0,null,value,0);
		 return null;
	 }
	 
	 void addEntry(int hash,K k,V value,int bucketIndex){
		 Entry<K,V> e = table[bucketIndex];
		 table[bucketIndex] = new Entry(hash,k,value,e);
		 //扩容
		 if(size++>=threshold){
			 //resize(2*table.length);
		 }
	 }
	 
	 public V get(K key){
		 int hash = 4555;
		 int index = 11;
		 for(Entry<K,V> e = table[index];e != null;e = e.next){
			 Object k;
			 if(e.hash==hash && ((k = e.key) == key || key.equals(k))){
				 return e.value;
			 }
		 }
		 return null;
	 }
	 
	 public V getForNullKey(){
		 for(Entry<K,V> e = table[0];e != null;e = e.next){
			 if(e.key==null){
				 return e.value;
			 }
		 }
		 return null;
	 }
	 
}
