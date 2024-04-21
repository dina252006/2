public class Test {
    public static void main(String[] args) {
        // Тестируем MyArrayList
        System.out.println("Testing MyArrayList:");
        MyList<Integer> arrayList = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println("Size of arrayList: " + arrayList.size());
        System.out.println("Contents of arrayList:");
        for (Integer num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Тестируем MyLinkedList
        System.out.println("\nTesting MyLinkedList:");
        MyList<Integer> linkedList = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        System.out.println("Size of linkedList: " + linkedList.size());
        System.out.println("Contents of linkedList:");
        for (Integer num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Тестируем MyStack с MyArrayList
        System.out.println("\nTesting MyStack with MyArrayList:");
        MyStack<Integer> stackWithArrayList = new MyStack<>(true);
        for (int i = 0; i < 5; i++) {
            stackWithArrayList.push(i);
        }
        System.out.println("Size of stackWithArrayList: " + stackWithArrayList.size());
        System.out.println("Contents of stackWithArrayList:");
        while (!stackWithArrayList.isEmpty()) {
            System.out.print(stackWithArrayList.pop() + " ");
        }
        System.out.println();

        // Тестируем MyStack с MyLinkedList
        System.out.println("\nTesting MyStack with MyLinkedList:");
        MyStack<Integer> stackWithLinkedList = new MyStack<>(false);
        for (int i = 0; i < 5; i++) {
            stackWithLinkedList.push(i);
        }
        System.out.println("Size of stackWithLinkedList: " + stackWithLinkedList.size());
        System.out.println("Contents of stackWithLinkedList:");
        while (!stackWithLinkedList.isEmpty()) {
            System.out.print(stackWithLinkedList.pop() + " ");
        }
        System.out.println();

        // Тестируем MyQueue с MyArrayList
        System.out.println("\nTesting MyQueue with MyArrayList:");
        MyQueue<Integer> queueWithArrayList = new MyQueue<>(true);
        for (int i = 0; i < 5; i++) {
            queueWithArrayList.offer(i);
        }
        System.out.println("Size of queueWithArrayList: " + queueWithArrayList.size());
        System.out.println("Contents of queueWithArrayList:");
        while (!queueWithArrayList.isEmpty()) {
            System.out.print(queueWithArrayList.poll() + " ");
        }
        System.out.println();

        // Тестируем MyQueue с MyLinkedList
        System.out.println("\nTesting MyQueue with MyLinkedList:");
        MyQueue<Integer> queueWithLinkedList = new MyQueue<>(false);
        for (int i = 0; i < 5; i++) {
            queueWithLinkedList.offer(i);
        }
        System.out.println("Size of queueWithLinkedList: " + queueWithLinkedList.size());
        System.out.println("Contents of queueWithLinkedList:");
        while (!queueWithLinkedList.isEmpty()) {
            System.out.print(queueWithLinkedList.poll() + " ");
        }
        System.out.println();

        // Тестируем MyMinHeap с MyArrayList
        System.out.println("\nTesting MyMinHeap with MyArrayList:");
        MyMinHeap<Integer> heapWithArrayList = new MyMinHeap<>(true);
        int[] nums = {3, 5, 8, 2, 4, 1, 9, 7, 6};
        for (int num : nums) {
            heapWithArrayList.insert(num);
        }
        System.out.println("Contents of heapWithArrayList:");
        while (!heapWithArrayList.isEmpty()) {
            System.out.print(heapWithArrayList.extractMin() + " ");
        }
        System.out.println();

        // Тестируем MyMinHeap с MyLinkedList
        System.out.println("\nTesting MyMinHeap with MyLinkedList:");
        MyMinHeap<Integer> heapWithLinkedList = new MyMinHeap<>(false);
        for (int num : nums) {
            heapWithLinkedList.insert(num);
        }
        System.out.println("Contents of heapWithLinkedList:");
        while (!heapWithLinkedList.isEmpty()) {
            System.out.print(heapWithLinkedList.extractMin() + " ");
        }
        System.out.println();
    }
}
