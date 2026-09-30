package DataStructures.Task2;
public class CircularQueue {
    int[] queue;
    int front;
    int rear;
    int size;
    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full.");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = data;

        System.out.println("Inserted: " + data);
    }
    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Removed: " + queue[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }
    void peek() {

        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % size;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        System.out.println("Circular Queue:");
        cq.display();
        cq.dequeue();
        cq.dequeue();
        cq.enqueue(50);
        cq.enqueue(60);
        System.out.println("After circular insertion:");
        cq.display();
        cq.peek();
    }
}
