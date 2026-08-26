package p0380_insert_delete_getrandom_o_1;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/insert-delete-getrandom-o1/">380. Insert Delete GetRandom O(1)</a>
 * <br><br>
 * Difficulty: Medium
 */
public class RandomizedSet {

    private final Map<Integer, Integer> map;
    private final List<Integer> list;
    private final Random rand;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int idxToRemove = map.get(val);
        int lastElement = list.getLast();

        list.set(idxToRemove, lastElement);
        map.put(lastElement, idxToRemove);

        list.removeLast();
        map.remove(val);

        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}