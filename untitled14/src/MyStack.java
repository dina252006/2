public class MyStack<T> {
    private MyList<T> list;

    public MyStack(boolean useArrayList) {
        if (useArrayList) {
            list = new MyArrayList<>();
        } else {
            list = new MyLinkedList<>();
        }
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = list.get(size() - 1);
        list.remove(size() - 1);
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(size() - 1);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return list.size();
    }
}
