class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        Node temp = head;
        Node nn= new Node(x);
        if(head == null) return nn;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = nn;
        nn.next = null;
        return head;
    }
}
