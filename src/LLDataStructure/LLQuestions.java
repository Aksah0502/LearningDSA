package LLDataStructure;

// Move to Line 103 For Question Practice
public class LLQuestions {

    Node head;
    private int size;

    LLQuestions() {
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

        while(temp!= null){
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


    /// /////////////////////////////////////////////////////////////////////////

    /* Q.1 : Remove Duplicates from Sorted Linked List(LeetCode Easy).
    // Eg: 1->1->2->4->4  --> 1-> 2-> 4

    public void removeDuplicates(){

        if (head == null || head.next == null) {
            // Empty or single node list → no duplicates
            return;
        }

        Node node = head;

        while(node.next != null ){
            if(node.data.equals(node.next.data)) {
                node.next = node.next.next;  // Skip the duplicate node
                size--;
            }else{
                node = node.next;
            }
        }
    }*/
/// ////////////////////////////////////////////////////////////////////////////////


    /* Q.2: Merge two sorted Linked List (LeetCode Easy).
    // Eg:- 1->2->4   && 1->2->2->3->4->4   => 1->2->2->2->3->4->4->4

    // Solution: Using Two pointer approach, where both pointer will be started from head, then compare to each other.
    // Whoever is small, added to temporary LL(let's say "ans") then move pointer to next.
    // While loop will run till any of the list become empty, then add all the remaining element of other list to "ans".

    public static LLQuestions mergeList(LLQuestions listFirst, LLQuestions listSecond){

        Node f = listFirst.head;
        Node s = listSecond.head;

        LLQuestions ans = new LLQuestions();

        while(f!=null && s!=null){
            if(f.data.compareTo(s.data) < 0){ // Since we have taken data as string, so using compareTo() which is suitable for String.
                // You can't directly apply operators like <, >, <= etc. on the string. Works only for int, float etc.
                ans.addLast(f.data);
                f = f.next; // moving pointer to next node
            }else{
                ans.addLast(s.data); // if node of second list is smaller, then add to ans.
                s= s.next;// Move pointer to next node.
            }
        }

        while(f!= null){
            ans.addLast(f.data);
            f = f.next;
        }

        while(s!= null){
            ans.addLast(s.data);
            s = s.next;
        }

        return ans;
    }*/
/// ///////////////////////////////////////////////////////////////////////////////////////////


    /* Q.3: Detect LinkedList Cycle (LeetCode Easy).
    // To solve this type of detect cycle questions, try to use fast-slow pointer method. Timw Complexity = O(n)
    // In this method we use two pointers, starting from head. Now slow pointer moves to one node, and fast pointer moves to 2 nodes.
    // If at any point they meet, means cycle is detected. If not then return false.
    // Eg: LinkedList Cycle
    //     1->2->4->6-> 8
    //           |      |
    //           4<-6<- 7


    public boolean hasCycle(Node head){

        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }*/
/// ////////////////////////////////////////////////////////////////////////////////////////


    /*Q.4: Find the length of cycle present in the Linked List (LeetCode Easy).
    // Approach:- once s and f meet. keep f but move s till it reaches again to f.
    // Use do-while loop as we need loop to move s once before starting loop.

    public int cycleLength(Node head){

        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){

                int length = 0;
                do{
                    slow = slow.next;// can take temp = slow too.
                    length++;
                }while(fast!=slow);

                return length;
            }
        }
        return 0;
    }*/
/// ////////////////////////////////////////////////////////////////////////////////


    /* Q.5 : Return the node from which cycle is being started(LeetCode Easy).
    // Eg: 1-> 4 -> 5
    //         |    |
    //         9 <- 6  Ans = node: 01

    //Approach: 1. Find the length of cycle  2. Move 's' ahead by length of cycle times
    //3. Now move 's' and 'f' one by one, both now meet at start of cycle.

    public Node cycleStart(Node head){

        Node fast = head;
        Node slow = head;

        int length  = 0;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                length  = cycleLength(slow); // LeetCode Question, so using above cycleLength function.
                break;
            }
        }

        if(length == 0){
            return null;
        }
       //Find the start of cycle
        Node f = head;
        Node s = head;
        while(length>0){
            s = slow.next;
            length--;
        }
        // Keep moving forward until both meet

        while(f  != s){
            f =  fast.next;
            s =  slow.next;
        }
        return f;
    }*/
/////////////////////////////////////////////////////////////////////////////////


    /* Q.6: Find the Middle element of Linked List(LeetCode Easy).

    public Node sortList(Node head){

        Node f = head;
        Node s = head;

        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }*/

/// /////////////////////////////////////////////////////////////////////////

/* Q.7: Reverse a linked list(Assuming No tail is given) (LeetCode Easy).
    // Approach : Using Iterative method not recursion as tail is unknown.
    // Will Use three pointers prev(which points to null), present(Start from head), and then nextNode(refer to upcoming/next node).
    // One by one during each iteration, we would flip present to point back to prev instead of next.
    // The moment present reaches to last node(i.e.), it point back to second last node as all the previous nodes were made to point back up to null.
     // Then return prev(Which is now new head), as linked is now reversed.

// https://leetcode.com/problems/reverse-linked-list/submissions/
// google, apple, amazon, microsoft interview Question
public Node reverseList(Node head) {
    if (head == null) {
        return head;
    }
    Node prev = null;
    Node present = head;
    Node next = present.next;

    while (present != null) {
        present.next = prev;
        prev = present;
        present = next;
        if (next != null) {
            next = next.next;
        }
    }
    return prev;
}*/

// See Reverse a linked list using Recursion(Skipping as I didn't get it).





    public static void main(String[] args) {

     /* Q.1:
        LLQuestions list = new LLQuestions();
        list.addLast("1");
        list.addLast("1");
        list.addLast("2");
        list.addLast("4");
        list.addLast("4");
        list.printList();


        list.removeDuplicates();
        list.printList();*/

        /* Q.2:
        LLQuestions listFirst = new LLQuestions();
        LLQuestions listSecond = new LLQuestions();

        listFirst.addLast("1");
        listFirst.addLast("2");
        listFirst.addLast("2");
        listFirst.addLast("5");

        listFirst.printList();

        listSecond.addLast("1");
        listSecond.addLast("1");
        listSecond.addLast("3");
        listSecond.addLast("7");
        listSecond.addLast("9");

        listSecond.printList();

        LLQuestions ans = LLQuestions.mergeList(listFirst, listSecond);
        ans.printList();*/



    }

}
