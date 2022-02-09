package Graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WaterJugProblemBFS {
    public static boolean canMeasureWater(int x, int y, int target) {
        if(x+y < target){
            return false;
        }
        int []directions = {x, -x, y, -y};
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int dir : directions){
                int total = curr + dir;
                if(total == target){
                    return true;
                }
                if(total > 0 && total < x+y && !visited.contains(total)){
                    visited.add(total);
                    queue.add(total);
                }
            }
        }
        return false;
    }

    public static void main(String []args){
        System.out.println("Can Measure Water: " + canMeasureWater(4, 3, 2));
    }
}
