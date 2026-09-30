package DataStructures.Task1;
    public class StackLinkedList {
        class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        Node top = null;
        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }
        void pop() {
            if (top == null) {
                System.out.println("Stack is empty.");
            } else {
                System.out.println("Popped: " + top.data);
                top = top.next;
            }
        }
        void peek() {
            if (top == null) {
                System.out.println("Stack is empty.");
            } else {
                System.out.println("Top element: " + top.data);
            }
        }
        void display() {
            Node current = top;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
        public static void main(String[] args) {
            StackLinkedList stack = new StackLinkedList();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Stack:");
            stack.display();
            stack.peek();
            stack.pop();
            System.out.println("After pop:");
            stack.display();
        }
    }

