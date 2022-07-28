public class SinglyLL {
    Node head;


    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static SinglyLL insert(SinglyLL list, int data){

        Node new_node = new Node(data);

        if(list.head ==null){
            list.head = new_node;
        }
        else{
            Node temp = list.head;
            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = new_node;

        }
        return list;
    }

    public static void printList(SinglyLL list){
        Node temp = list.head;
        int i=1;
        while(temp !=null){
            System.out.println("Node "+ i+":"+ temp.data);
            temp = temp.next;
            i++;
        }
    }


    public static void main(String[] args){
        SinglyLL list = new SinglyLL();
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        list = insert(list,6);

        printList(list);

    }
}
