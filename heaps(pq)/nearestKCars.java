import java.util.*;
public class nearestKCars{
    static class Point implements Comparable<Point>{
        int x,y,disSq, idx;
        public Point(int x, int y, int disSq, int idx){
            this.x = x;
            this.y = y;
            this.disSq = disSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.disSq - p2.disSq;
        }
    }
    public static void main(String args[]){
        int pts[][] = {{5,-1}, {3,3,}, {-2,4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i =0; i<pts.length; i++){
            int disSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], disSq, i));
        }

        for(int i =0;i<k; i++){
        System.out.println("C"+pq.remove().idx);
        }
    }
}
