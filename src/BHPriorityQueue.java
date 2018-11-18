import java.util.ArrayList;
import java.util.List;

public class BHPriorityQueue<K extends Comparable, V> implements VCPriorityQueue {

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
   */
  @Override
  public boolean isEmpty() {
    return queue.size() <= 0;
  }

  /**
   * Inserts a key-value pair and returns the entry created.
   *
   * @param key the key of the new entry
   * @param value the associated value of the new entry
   */
  @Override
  public Entry enqueue(Comparable key, Object value) throws IllegalArgumentException {
    Entry<K, V> newEntry = new Entry<>(key, value);
    queue.add(newEntry);
    return null;
  }

  /**
   * Returns (but does not remove) an entry with minimal key.
   */
  @Override
  public Entry peek() {
    if (isEmpty(queue)) {
        return null;
    }
  }

  /**
   * Removes and returns an entry with minimal key.
   */
  @Override
  public Entry dequeueMin() {
    return null;
  }

  /**
   * Return the queue
   */
  public List<Entry<K, V>> getQueue() {
    return queue;
  }

  /**
   * Merges another priority queue of the same type.
   */
  @Override
  public VCPriorityQueue merge(VCPriorityQueue other) {
    return null;
  }
}
