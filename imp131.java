//zigzag linked list
public class imp131 {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;
    public void print(){
        if(head==null){
            System.out.print("null");
            return;
            
        }
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    public void addfirst(int data){
        //create new node
        node newnode = new node(data);
        size++;
        if(head==null){
            head = tail = newnode;
            return;
        }
        //new node next = head
        newnode.next = head;
        //head is newnode
        head = newnode;


    }
    public node middle(node head){
        node slow = head;
        node fast = head.next;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
    public node merge(node head1, node head2){
        node mergedll = new node(-1);
        node temp = mergedll;
        while(head1!=null&&head2!=null){
            if(head1.data<head2.data){
                   temp.next = head1;
                   head1 = head1.next;
                   temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;

        }
        return mergedll.next;
    }
    public node mergesort(node head){
        if(head==null||head.next == null){
            return head;
        }
        //find mid
        node mid = middle(head);
        //left and right mergesort 
        node righthead = mid.next;
        mid.next = null;
        node left = mergesort(head);
        node right = mergesort(righthead);
        //merge
        return merge(left,right);
    }
    public void zigzag(){
        //find mid
        node slow = head;
        node fast = head.next;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        node mid = slow;
        // reverse
        node curr = mid.next;
        mid.next = null;
        node prev = null;
        node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node left = head;
        node right = prev;
        node nextl, nextr;
        while(left!=null&&right!=null){
            nextl = left.next;
            left.next = right;
            nextr = right.next;
            right.next = nextl;

            left = nextl;//update
            right = nextr;//update
        }


    }
    public static void main(String args[]){
        imp131 ll = new imp131();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        // ll.head = ll.mergesort(ll.head);
        // ll.print();
        ll.zigzag();
        ll.print();


    }
}    
    

