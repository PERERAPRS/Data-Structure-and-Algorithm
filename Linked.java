//import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
       this.data = data;
       this.next = null;
    }
}
class Linked{
    Node head;
    int size;


public static void main(String []at){
    Linked a = new Linked();
    a.insertfront(12);
    a.insertfront(14);
    a.insertfront(15);
    a.display();
    System.out.println(a.toString());
    System.out.println();
    a.insertmid(5);
    System.out.println();
    a.display();
    System.out.println();
    a.insertat_lat(20);
    a.display();
    System.out.println();
    System.out.println("delete at mid element : "+a.deletefrom_middle());
    a.display();
    System.out.println();
    System.out.println("delete at front element : "+a.deletefront());
    a.display();
    System.out.println();
    System.out.println("delete at Last : "+a.deleteLast());
    a.display();
}


public void insertfront(int value){
     Node newnode = new Node(value);
     size++;
     if(head == null)
           head = newnode;
     else{
        newnode.next = head;
        head = newnode;
     }
}
public void insertmid(int value){
     Node newnode = new Node(value);
     if(head == null){
           head = newnode;
     }
    else{
        Node temp,current;
        int count;
        if(size%2==0)count = size/2;
        else count = (size+1)/2;
        temp = head;
        current = null;
        for(int i=0; i<count; i++){
          current = temp;
          temp = temp.next;
        }
        current.next = newnode;
        newnode.next = temp;
        
        size++;

}
}
public void insertat_lat(int value){
    Node newnode = new Node(value);
    if(head == null)
           head = newnode;
    else{
        Node temp = head,current = null;
        for(int i=0;i<=(size-1);i++){
             current = temp;
             temp = temp.next;
        }
        current.next = newnode;
        newnode.next = null;
        size++;
    }


}
public int deletefront(){
    int temp;
    if(head == null){
         System.out.println("Linked list is Empty!");
         return -1;}
    else{
        temp = head.data;
        head = head.next;
    }
    size--;
    return temp;
}
public int deletefrom_middle(){
    Node temp,current,prev;
    int cont,tm;
    if(head == null){
         System.out.println("Linked list is Empty!");
         return -1;
        }
    else{
        current = null;
        prev = null;
        temp = head;
        if(size%2==0) cont = size/2;
        else cont = (size+1)/2;
        for(int i=0;i<cont;i++){
            prev = current;
            current = temp;
            temp = temp.next;
        } 
        tm = current.data;
        prev.next = prev.next.next;
        size--;
        
        return tm;
    }
}
public int deleteLast(){
    Node temp = head,current = null;
    int retn;
    if(head == null){
        System.out.println("Linked list is Empty!");
        return -1;
    }
    else{
        
        for(int i=0;i<size-1;i++) {
            current = temp;
            temp = temp.next;
        }
        retn = temp.data;
        current.next = null;
        size--;
        return retn;
    }
}
void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
public String toString(){
    return "\nSize of Linked list :"+Integer.toString(size);
} 
}