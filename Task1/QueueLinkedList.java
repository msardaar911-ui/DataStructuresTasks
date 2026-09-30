package DataStructures.Task1;
public class QueueLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node front = null;
    Node rear = null;
    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Removed: " + front.data);
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }
    void peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }
    void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue:");
        queue.display();
        queue.peek();
        queue.dequeue();
        System.out.println("After dequeue:");
        queue.display();
    }
}