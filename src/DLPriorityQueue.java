import java.util.ArrayList;
import java.util.List;

public class DLPriorityQueue<K extends Comparable, V> implements VCPriorityQueue {

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
   * @param key   the key of the new entry
   * @param value the associated value of the new entry
   */
  @Override
  public Entry enqueue(Comparable key, Object value) throws IllegalArgumentException {
    // Create a new Entry in for the Queue
    Entry<K, V> newEntry = new Entry<>(key, value);
    // We add a new Entry in the Queue
    queue.add(newEntry);
    // We order after add the new Entry
    queue.sort();
    // We return the Entry that was created
    return newEntry;
  }

  /**
   * Returns (but does not remove) an entry with minimal key.
   */
  @Override
  public Entry peek() {
    // We reuse empty() to know if the queue is full or not
    // and depend of that value we return null or the first value
    if (isEmpty(queue) == true) {
      return null;
    }
    return queue.get(0);
  }

  /**
   * Removes and returns an entry with minimal key.
   */
  @Override
  public Entry dequeueMin() {
    if (isEmpty(queue) == true) {
      return null;
    }
    // New entry
    Entry<K, V>> newEntry = new ArrayList<>();
    // Returns a entry with the minimal value
    newEntry.peek();
    // We remove and return the minimal entry in the Queue
    return queue.remove(newEntry);
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
