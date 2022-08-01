import java.util.Scanner;
public class QueueUsingLll {
    
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node f = null;
    Node r = null;

    void enqueue(){
        int n;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your data : ");
        int value = sc.nextInt();
        Node new_node = new Node(value);
        if(f == null){
            f = new_node;
            r = new_node;
        }
        else{
            r = new_node;
            new_node = r.next;
        }
        System.out.println("Press 0, If u want to add more data ");
        n = sc.nextInt();
        }while(n == 0);
    }

    void dequeue(){
        if( f == null ){
            System.out.println("Error...Queue is already empty");
        }
        else{
            f = f.next;
        }
    }

    void display(){
        Node temp = f;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        QueueUsingLll queue = new QueueUsingLll();
        queue.enqueue();
        queue.display();
    }

}
