public class LinkedList1{
  Node head;
    class Node{
      String data;
      Node next;
      Node (String data){
        this.data = data;
        this.next = null;
      }
    }
    //Add element at first
    public void addFirst(String data){
      Node newNode = new Node(data);
      if(head == null){
        head = newNode;
        return;
      }
      newNode.next
    }
}