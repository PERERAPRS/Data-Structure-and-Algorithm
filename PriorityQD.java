
/*   
   --------Dessending order priority Queue--------
*/
public class PriorityQD {
    int front,rear,itemCount;
    final int SIZE = 10;
    int[] arry = new int[SIZE];
    public PriorityQD(){
        itemCount = -1;
    }
    
    public static void main(String []arg){
        PriorityQD a = new PriorityQD();
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        a.insert(6);
        a.insert(7);
        a.insert(8);
        a.insert(9);
        a.insert(10);
        a.print();
        a.remove();
        System.out.println();
        System.out.println("After removing ");
        a.print();

    }

    public boolean isEmpty(){
        if(itemCount == -1)
              return true;
        else
             return false;   
        
     }
     public boolean isFull(){
      if(itemCount == SIZE-1)
          return true;
      else 
          return false;
     }
    
     public void insert(int value){
        int i =0;
        if(isFull())
              System.out.println("Queue is full");
        else
           if(isEmpty()){
               arry[0] =  value;
               itemCount ++;
           }
           else{
               for(i = itemCount; i>=0; i--){
                  if(value<arry[i]){
                      arry[i+1] = arry[i];
                  }
                  else
                     break;
               }
               arry[i+1] = value;
               itemCount++;
           }
    }
     public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return -1;}
        else{
          int v =  arry[itemCount-1];
          itemCount--;
          return v;
        }
     }

     public void print(){
        for(int i=0; i<=itemCount; i++){
            System.out.println("Index["+i+"] -> "+arry[i]);
        }
     }
}

