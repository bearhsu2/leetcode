package idv.kuma.easy.last_stone_weight;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int lastStoneWeight(int[] stones) {

        Queue<Integer> queue = new PriorityQueue<>(1, (o1, o2) -> o2 - o1);

        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() >= 2) {

            int first = queue.poll();
            int second = queue.poll();

            int diff = first - second;

            if (diff > 0) {
                queue.offer(diff);
            }

        }

        return queue.isEmpty()
                ? 0
                : queue.poll();
    }
}
