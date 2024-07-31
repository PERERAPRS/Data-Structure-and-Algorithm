public class CircularQ {
    final int SIZE = 10;
    int[] arry = new int[SIZE];
    int rear,front;
    public CircularQ(){
       this.front = -1;
       this.rear = -1;
    }

    public static void main(String []arg){
        CircularQ ob = new CircularQ();
        ob.enqueue(1);
        ob.enqueue(2);
        ob.enqueue(3);
        ob.enqueue(4);
        ob.enqueue(5);
        ob.enqueue(6);
        ob.enqueue(7);
        ob.enqueue(8);
        ob.enqueue(9);
        ob.enqueue(10);
        ob.display();
        System.out.println();
        System.out.println("This element removed : "+ob.dequeue());
        System.out.println();
        ob.display();
        System.out.println();
        ob.enqueue(90);
        ob.display();
        System.out.println();
        System.out.println("This element removed : "+ob.dequeue());
        System.out.println();
        ob.display();
        System.out.println();
        ob.enqueue(80);
        ob.display();
    } 
    
    public boolean isFull(){
        if(front == 0 && rear == SIZE-1)
                return true;
        else
           return false;
    }
    public boolean isEmpty(){
        if(front == -1 && rear == -1)
                return true;
        else 
             return false;
    }

    public void enqueue(int value){
       if(isFull())
            System.out.println("Circular queue is full !");
        else{
            if(front == -1){
                arry[0] = value;
                front = 0;
                rear = 0;
            }
            else{
                rear = (rear+1)%SIZE;
                arry[rear] = value;
            }
        }
    }
    public int dequeue(){
        int value = 0;
        if(isEmpty())
            System.out.println("Circular Queue is Empty !");
        else{
            if(front == rear){
               value = arry[front];
               front = -1;
               rear = -1;
            }
            else{
                value = arry[front];
                front = (front+1)%SIZE;;
            }
        }
        return value;
    }

    public void display(){
        int i ;
        if(isEmpty())
           System.out.println("Empty Circular queue !");
        else{
            System.out.println("Front : "+front);
            System.out.println("Rear : "+rear);
            
               for (i = front; i != rear; i = (i + 1) % SIZE)
                  System.out.print(arry[i] + " ");
                System.out.println(arry[i]);
                System.out.println("Rear -> " + rear);
            }
           
    }
}
