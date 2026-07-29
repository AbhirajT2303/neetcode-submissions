class MyLinkedList {
    Node head;
    Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public int get(int index) {
    Node curr = head;
    int count = 0;
    while (curr != null && count < index) {
        curr = curr.next;
        count++;
    }
    return (curr == null) ? -1 : curr.val;
}

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail == null) tail = newNode;
    }

    public void addAtTail(int val) {
    Node newNode = new Node(val);
    if (head == null) {
        head = newNode;
        tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
}

   public void addAtIndex(int index, int val) {
    if (index == 0) { addAtHead(val); return; }
    Node newNode = new Node(val);
    Node pre = head;
    int count = 0;
    while (pre != null && count < index - 1) { // index-1 not index
        pre = pre.next;
        count++;
    }
    if (pre == null) return;
    newNode.next = pre.next;
    pre.next = newNode;
    if (newNode.next == null) tail = newNode;
}

   public void deleteAtIndex(int index) {
    if (head == null) return;

    // deleting head
    if (index == 0) {
        head = head.next;
        if (head == null) tail = null; // list now empty
        return;
    }

    Node pre = head;
    int count = 0;
    while (pre != null && count < index - 1) {
        pre = pre.next;
        count++;
    }

    if (pre == null || pre.next == null) return; // index out of bounds

    pre.next = pre.next.next;
    if (pre.next == null) tail = pre; // deleted last node, update tail
}
}

class Node {
    int val;
    Node next;
    public Node() {}
    public Node(int val){
        this.val = val;
    }
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */