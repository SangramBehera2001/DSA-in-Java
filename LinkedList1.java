public class LinkedList1{
  Node head;
  private int size;
  LinkedList1(){
    this.size = 0;
  }
    class Node{
      String data;
      Node next;
      Node (String data)
      {
        this.data = data;
        this.next = null;
        size++;
      }
    }
    //Add element at first
    public void addFirst(String data)
    {
      Node newNode = new Node(data);
      if(head == null)
        {
          head = newNode;
          return;
        }
      newNode.next = head;
      head = newNode;
    }
      //Add element at last
      public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
          head = newNode;
          return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
          currNode.next = newNode;
      }
      //Delete First element
      public void deleteFirst(){
        if(head == null){
          System.out.println("The list is empty");
          return;
        }
        size--;
        head = head.next;
      }
      //Delete Last element
      public void deleteLast(){
        if(head == null){
          System.out.println("The list is empty");
          return;
        }
        size--;
        if(head.next == null){
          head = null;
          return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
          lastNode = lastNode.next;
          secondLast = secondLast.next;
        }
        secondLast.next = null;
      }
      //Print The LinkedList
      public void printList(){
        if(head == null){
          System.out.println("The List is Empty");
          return;
        }
        Node currNode = head;
        while(currNode != null){
          System.out.print(currNode.data + "->");
          currNode = currNode.next;
        }
        System.out.println("null");
      }
      //Size Of the LinkedList
      public int getSize(){
        return size;
    }
      public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
      }
      }
    

