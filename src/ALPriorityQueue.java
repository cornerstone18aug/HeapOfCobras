import java.util.ArrayList;
import java.util.List;

public class ALPriorityQueue<K extends Comparable, V> implements VCPriorityQueue {

  List<Entry<K, V>> queue = new ArrayList<>();

  /**
   * Returns the number of items in the priority queue.
   */
  @Override
  public int size() {
    int size = queue.size();
    return size;
  }

  /**
   * Tests whether the priority queue is empty.
   * @return
   */
  @Override
  public boolean isEmpty() {
    if (queue.size() <= 0) {
      return true;
    }
    return false;
  }

  /**
   * Inserts a key-value pair and returns the entry created.
   * @param key the key of the new entry
   * @param value the associated value of the new entry
   * @return
   * @throws IllegalArgumentException
   */
  @Override
  public Entry enqueue(Comparable key, Object value) throws IllegalArgumentException {
    Entry<K, V> newEntry = new Entry<>(key, value);
    queue.add(newEntry);
    return newEntry;
  }

  /**
   * Returns (but does not remove) an entry with minimal key.
   * @return
   */
  @Override
  public Entry peek() {
    return null;
  }

  /**
   * Removes and returns an entry with minimal key.
   * @return
   */
  @Override
  public Entry dequeueMin() {
    return null;
  }

  /**
   * Merges another priority queue of the same type.
   * @param other
   * @return
   */
  @Override
  public VCPriorityQueue merge(VCPriorityQueue other) {
    return null;
  }
}
