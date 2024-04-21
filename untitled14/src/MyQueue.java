public class MyQueue<T> {
    private MyList<T> list;

    public MyQueue(boolean useArrayList) {
        if (useArrayList) {
            list = new MyArrayList<>();
        } else {
            list = new MyLinkedList<>();
        }
    }

    public void offer(T item) {
        list.add(item);
    }

    public T poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = list.get(0);
        list.remove(0);
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return list.size();
    }
}
