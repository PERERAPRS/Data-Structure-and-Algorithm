class Queue{
   int front ,rear,size = 5;

   int[] que = new int[size];
   public Queue(){
     this.front = -1;
     this.rear = -1;
   }
    public static void main(String []args){
       Queue q = new Queue();
       q.enqueue(1);
       q.enqueue(2);
       q.enqueue(4);
       q.enqueue(3);
       q.enqueue(6);
       q.display();
       System.out.println();
       System.out.println("----Deque one element---- ");
       System.out.println("Dequeue element : "+q.dequeue());
       System.out.println();
       q.display();
       
    }

   public boolean isEmpty(){
      if(rear == -1 && front == -1)
            return true;
      else
           return false;   
      
   }
   public boolean isFull(){
    if(front == 0 && rear == size-1)
        return true;
    else 
        return false;
   }
   public void enqueue(int data){
      if(isFull())
             System.out.println("Queue is full !");
      else if(isEmpty()){
           que[0] = data;
           rear = 0;
           front = 0;
      }
      else{
        rear = rear + 1;
        que[rear] = data; 
          
      }
   }
   public void display(){
      System.out.println("Front : "+front);
      System.out.println("Rear : "+rear);
     if(!isEmpty()){
        for(int i=front;i<=rear;i++)
             System.out.print(que[i]+"\t");

     }
     else
       System.out.println("Queue is empty!");
   }
   public int  dequeue(){
    int del = 0;
    if(isEmpty())
         System.out.println("Queue is Empty !");
    else if (front >= rear){
          del= que[front];
          front =-1;
          rear =-1;
     }
    else{
        del= que[front];
        front++;
     }
     return del;
   }
   public int peek(){
    if(!isEmpty())
         return que[front];
    else 
       System.out.println("Queue is Empty !");
       return -1;
   } 

}