// circularQueue
class circularQueue{
    static class Queue{
        static int arr[],size, front, rear;
//constructor
        Queue(int n){
         arr = new int[n];
         size = n;
         front = rear = -1;
        }
//check isEmpty condition
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
//check full condition
        public static boolean isFull(){
            return rear +1 == front;
        }
//add element in queue
        public static void add(int ele){
            // check full condition
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
//add element at first
                if(front == -1){
                    front = 0;
                }
                rear = (rear+1)%size;
                arr[rear] = ele;
            
        }

//remove element from queue

        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int res = arr[front];
            if(front == rear){
                front = rear = -1;
            }
            else{
            front = (front +1)% size;
            }
            return res;
        }

//peek function
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
            }  
            return arr[front]; 
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.remove();
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        q.peek();
    }
}