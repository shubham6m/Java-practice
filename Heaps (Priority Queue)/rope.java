import java.util.PriorityQueue;

public class rope {
    static class row implements Comparable<row> {
        int soilder; 
        int idx;
        
        public row(int soilder, int idx){
            this.soilder = soilder;
            this.idx = idx;
        }

        @Override
        public int compareTo(row r2){
            if(this.soilder == r2.soilder){
                return this.idx - r2.idx;
            }else{
            return this.soilder - r2.soilder;
            }
        }
    }
    public static void main(String[] args) {
        int army[][] = {{1,0,1,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}};
        
        int k = 4;

        PriorityQueue <row> pq = new PriorityQueue<>();
        for(int i =0; i<army.length; i++){
            int count = 0;
            for(int j =0; j<army[0].length; j++){
                //this line means if soilder's value is 1 then add 1 in count otherwise add 0
               count += army[i][j] == 1 ? 1:0;
            }
            pq.add(new row(count, i));
        }

        for(int i =0; i<k; i++){
            System.out.println("R" + pq.remove().idx);
        }

    //     int ropes[] = {2, 3, 4, 7, 4};

    //     PriorityQueue<Integer> pq = new PriorityQueue<>();
    //     for(int i = 0; i<ropes.length; i++){
    //         pq.add(ropes[i]);
    //     }
    //     int sum = 0;
    //     while (pq.size()>1) {
    //         int min1 = pq.remove();
    //         int min2 = pq.remove();
    //         sum += min1 + min2;
    //         pq.add(min1 + min2);
    //     } 
    //     System.out.println("minimum cost to add ropes is "+ sum);
    }
}
