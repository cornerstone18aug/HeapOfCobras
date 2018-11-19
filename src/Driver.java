
public class Driver {

    public static void main(String[] args) {
        DLPriorityQueue DLPrioQue = new DLPriorityQueue();

        // Insert data in the Queue
        DLPrioQue.enqueue(0, "Cero");
        DLPrioQue.enqueue(1, "One");
        DLPrioQue.enqueue(2, "Two");
        DLPrioQue.enqueue(3, "Three");
        DLPrioQue.enqueue(4, "Four");

        // Print the Queue --> DLPrioQue
        for (DLPrioQue queue : DLPrioQue) {
            System.out.println(DLPrioQue.getQueue());
        }
    }
}
