package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class Coordinate{
    int x;
    int y;

    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class MinimumStepByKnightOnInfiniteBoard {

    public static int minimumKnightMove(int x, int y){
        int []xDir = {-2, -2, -1, -1, 1, 1, 2, 2};
        int []yDir = {-1, 1, -2, 2, -2, 2, -1, 1};

        int moves = 0;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0, 0));
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                Coordinate p = queue.remove();
                if(p.x == x && p.y == y){
                    return moves;
                }
                for(int j=0; j<xDir.length; j++){
                    int newPx = p.x + xDir[j];
                    int newPy = p.y + yDir[j];
                    queue.add(new Coordinate(newPx, newPy));
                }
            }
            moves++;
        }
        return  -1;
    }

    public static void main(String []args){
        System.out.println(minimumKnightMove(5, 6));
    }
}
