import java.util.LinkedList;

public class MessageQueue {
    private final LinkedList<Message> priorityQueue = new LinkedList<>();
    private final LinkedList<Message> normalQueue = new LinkedList<>();
    private final int capacity;

    public MessageQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void sendMessage(Message msg) throws InterruptedException {
        while (getTotalSize() >= capacity) {
            wait();
        }

        if (msg.isPriority()) {
            priorityQueue.addLast(msg);
        } else {
            normalQueue.addLast(msg);
        }

        System.out.println(Thread.currentThread().getName() + " send: " + msg);
        notifyAll();
    }

    public synchronized Message receiveMessage() throws InterruptedException {
        return null;
    }

    private int getTotalSize() {
        return priorityQueue.size() + normalQueue.size();
    }
}
