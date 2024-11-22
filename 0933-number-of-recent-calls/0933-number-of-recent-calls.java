class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>(); // Initialize the queue
    }

    public int ping(int t) {
        // Add the new request to the queue
        queue.add(t);

        // Remove requests that are outside the 3000ms window
        while (queue.peek() < t - 3000) {
            queue.poll(); // Remove the oldest request
        }

        // The size of the queue is the number of valid requests
        return queue.size();
    }
}