import java.util.*;

public class CustomHashMap<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private final int SIZE = 16;
    private Entry<K, V>[] table;

    public CustomHashMap() {
        table = new Entry[SIZE];
    }

    private int getIndex(K key) {
        return key.hashCode() % SIZE;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Entry<K, V> newNode = new Entry<>(key, value);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Entry<K, V> current = table[index];
            while (current.next != null && !current.key.equals(key)) {
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
            } else {
                current.next = newNode;
            }
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        Entry<K, V> current = table[index];
        while (current != null) {
            if (current.key.equals(key)) return current.value;
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        Entry<K, V> current = table[index], prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) table[index] = current.next;
                else prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
    }
}