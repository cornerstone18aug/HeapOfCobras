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
    return newEntry;
  }

  /**
   * Returns (but does not remove) an entry with minimal key.
   */
  @Override
  public Entry peek() {
    // We get the first entry that was entered with the min value
    Entry<K, V> minValue = queue.get(0);

    // We find the entry with the minimum value
    for (Entry<K, V> entry : queue) {
      if (entry.getKey().compareTo(minValue.getKey()) < 0) {
        minValue = entry;
      }
    }
    // We return the entry with the minimum value
    return minValue;
  }

  /**
   * Removes and returns an entry with minimal key.
   */
  @Override
  public Entry dequeueMin() {
    int minIndex = 0;

    for (int i = 1; i < queue.size(); i++) {
      if (queue.get(i).getKey().compareTo(queue.get(minIndex).getKey()) < 0) {
        minIndex = i;
      }
    }
    return queue.remove(minIndex);
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
    ALPriorityQueue<K, V> otherQ = ((ALPriorityQueue) other);

    for (Entry<K, V> entry : otherQ.getQueue()) {
      this.queue.add(entry);
    }
    return this;
  }
}
