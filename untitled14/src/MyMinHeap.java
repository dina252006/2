public class MyMinHeap<T extends Comparable<T>> {
    private MyList<T> list;

    public MyMinHeap(boolean useArrayList) {
        if (useArrayList) {
            list = new MyArrayList<>();
        } else {
            list = new MyLinkedList<>();
        }
    }

    public void insert(T item) {
        list.add(item);
        heapifyUp(list.size() - 1);
    }

    public T extractMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        T min = list.get(0);
        int lastIndex = list.size() - 1;
        T last = list.get(lastIndex);
        list.set(0, last);
        list.remove(lastIndex);
        heapifyDown(0);
        return min;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (list.get(index).compareTo(list.get(parentIndex)) < 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallestIndex = index;

        if (leftChildIndex < list.size() && list.get(leftChildIndex).compareTo(list.get(smallestIndex)) < 0) {
            smallestIndex = leftChildIndex;
        }
        if (rightChildIndex < list.size() && list.get(rightChildIndex).compareTo(list.get(smallestIndex)) < 0) {
            smallestIndex = rightChildIndex;
        }

        if (smallestIndex != index) {
            swap(index, smallestIndex);
            heapifyDown(smallestIndex);
        }
    }

    private void swap(int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
