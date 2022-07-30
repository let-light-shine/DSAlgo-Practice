public class MergeSortedLL {


        public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

/* public static ListNode insert(ListNode list, int val){
        ListNode new_data = new ListNode(val);
        if(list.val == 0){
            list.val = val;
        }
        else{
        ListNode temp = list;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_data;
        new_data.next = null;

    }
        return list;
    }*/

        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            else if (l2 == null) {
                return l1;
            }
            else if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            }
            else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }

        }
    public static void printList(ListNode list){
        ListNode temp = list;
        int i=1;
        while(temp !=null){
            System.out.println("Node "+ i+":"+ temp.val);
            temp = temp.next;
            i++;
        }
    }
        public static void main(String[] args) {
            ListNode l1 = new ListNode(1,null);
            l1.next = new ListNode(2,null);
            l1.next.next = new ListNode(4,null);

            ListNode l2 = new ListNode(1,null);
            l2.next = new ListNode(3,null);
            l2.next.next = new ListNode(4,null);

            ListNode l3 = new ListNode();
            l3 = mergeTwoLists(l1,l2);
            printList(l3);


        }
    }

