import java.util.Scanner;
public class StackUsingLl {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }    
    }
    Node top = null;

    void push(){
        int n;
       do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your data : ");
        int response = sc.nextInt();
        Node new_node = new Node(response);
        if(top == null){
            top = new_node;
        }
        else {
            new_node.next = top;
            top = new_node;
        }
        System.out.println("Press 0, If u want to add more data.");
        n = sc.nextInt();
       }while(n == 0);
    }

    void pop(){
        if(top == null){
            System.out.println("Stack is already empty");
        }
        else{
            top = top.next;
        }
    }

    void display(){
        Node temp = top;
        System.out.println("Stack is - ");
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLl stack = new StackUsingLl();
        stack.push();
        stack.display();
    }
}
