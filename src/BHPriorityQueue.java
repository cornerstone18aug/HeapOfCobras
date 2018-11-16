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
   * @return
   */
  @Override
  public boolean isEmpty() {
    if (queue.size() <= 0) {
      return true;
    }
    return false;
  }

  @Override
  public Entry enqueue(Comparable key, Object value) throws IllegalArgumentException {
    return null;
  }

  @Override
  public Entry peek() {
    return null;
  }

  @Override
  public Entry dequeueMin() {
    return null;
  }

  @Override
  public VCPriorityQueue merge(VCPriorityQueue other) {
    return null;
  }
}
