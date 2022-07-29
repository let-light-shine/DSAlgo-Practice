public class SinglyLL2 {
    Node head;


    public static class Node{
        int data;
        Node next;
        Node(){
            next =null;
        }

        Node(int data){
            this.data = data;
            next = null;
        }

    }

    public static SinglyLL2 insert(SinglyLL2 list, int data){
        Node new_node = new Node(data);

        if(list.head == null){
            list.head = new_node;
        }
        else {

            //Node temp = new Node();
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return list;

    }


    public static void printList(SinglyLL2 list){
        if(list.head == null){
            System.out.println("List is empty!");
        }
        Node temp = list.head;
        int i=1;
        while(temp != null){
            System.out.println("Node " + i +": "+ temp.data);
            temp = temp.next;
            i++;
        }
    }


    public static void main(String[] args){
        SinglyLL2 list = new SinglyLL2();

        printList(list);

        list = insert(list,1);
        list = insert(list,1);
        list = insert(list,1);
        list = insert(list,1);

        printList(list);

    }
}
