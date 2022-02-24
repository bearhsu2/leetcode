package idv.kuma.medium.remove_covered_intervals;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int result = intervals.length;
        if (result == 0) {
            return 0;
        }

        Queue<int[]> queue = makePriprityQueue(intervals);

        return countCovereds(result, queue);
    }

    private int countCovereds(int result, Queue<int[]> queue) {
        int[] current = queue.poll();
        while (!queue.isEmpty()) {
            int[] next = queue.poll();
            if (current[0] <= next[0] && current[1] >= next[1]) {
                result--;
            } else {
                current = next;
            }
        }
        return result;
    }

    private Queue<int[]> makePriprityQueue(int[][] intervals) {
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        for (int[] interval : intervals)
            queue.offer(interval);
        return queue;
    }
}