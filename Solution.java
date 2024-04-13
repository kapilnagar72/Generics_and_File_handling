package Generics_and_File_handling;

public class Solution<K ,V> {
    private K key;
    private V value;

    public Solution(K key, V value) {
    this.key = key;
    this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
