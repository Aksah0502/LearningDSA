package LLDataStructure;


public class SinglyLinkedList {


    Node head;
    private int size;

    SinglyLinkedList() {
        size = 0;
    }
    public class Node{
       String data;
       Node next;

       Node(String data){
         this.data = data;
         this.next = null; // Just creating individual node, initially not pointing to any node.
         size++;
       }
    }

    public void addFirst(String data){
        Node newNode = new Node(data); // creating new node and passing data.
        newNode.next = head; // nextNode is now point to previous first node.
        head = newNode;  // head is now pointing to newNode.
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        //If the linked list is empty
        if(head == null){
            head = newNode;
            return;
        }

        //Assuming no info regarding tail of linked list
        Node lastNode = head;   //Storing the value of head in a temporary node var.
        while(lastNode.next != null){
            lastNode = lastNode.next ; // moving one by one till the last node, i.e. tail
        }

        lastNode.next = newNode;
    }

    public void printList(){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
// Head is moved to second node. The old first node is now unreferenced and will be garbage collected.
        head = this.head.next;
        size--;
    }

    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        size--;
        // If only one node exists.
        if(head.next == null) {
            head = null; // Removing the last node means the list becomes empty, so head=null
            return;
        }

        Node currNode = head; //currNode will end up at the second-last node.
        Node lastNode = head.next; // lastNode will end up at the last node
        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null; //Break the link to the last node. Now second-last becomes the new last node.

    }

    //To quickly know how many elements are in the list without traversing it.
    public int getSize() {
        return size; // Time complexity: O(1).
    }




    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();


        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());


        list.removeFirst();
        list.printList();


        list.removeLast();
        list.printList();




    }
}
