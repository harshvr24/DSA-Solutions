import java.util.PriorityQueue;

class MedianFinder {
    private PriorityQueue<Integer> maxh; // max heap for smaller half
    private PriorityQueue<Integer> minh; // min heap for larger half

    public MedianFinder() {
        maxh = new PriorityQueue<>((a, b) -> Integer.compare(b, a)); // max heap
        minh = new PriorityQueue<>(); // min heap
    }

    public void addNum(int num) {
        if (maxh.isEmpty() || num <= maxh.peek()) {
            maxh.offer(num);
        } else {
            minh.offer(num);
        }

        // Balance the heaps
        if (maxh.size() > minh.size() + 1) {
            minh.offer(maxh.poll());
        } else if (maxh.size() < minh.size()) {
            maxh.offer(minh.poll());
        }
    }

    public double findMedian() {
        if (maxh.size() == minh.size()) {
            return (maxh.peek() + minh.peek()) / 2.0;
        } else {
            return maxh.peek();
        }
    }
}
