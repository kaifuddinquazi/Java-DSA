package Array;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class OwnLinkedList {
    Node head;
    Node tail;
    int size;
    // At at Head
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    // Add at Tail (End)
    void addAtTail(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    // Delete at Head
    void deleteAtHead(){
        if(head == null){
            System.out.println("List is Empty");
        } else if (size == 1){
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    // Display (Printing) list
    void dispaly(){
        Node temp = head;
        if(temp == null) return;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        } 
        System.out.println();

    }
    public static void main(String[] args) {
        OwnLinkedList ll = new OwnLinkedList();
      System.out.println(ll.size);
      ll.addAtTail(20);
      ll.addAtTail(30);
      ll.addAtTail(50); ll.addAtTail(60);
      ll.addAtHead(70);
      ll.dispaly();
      System.out.println(ll.size);
      ll.deleteAtHead();
      ll.dispaly();
        
    }
}
