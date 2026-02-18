public class GenericDLList<T> {

    private GenericDLNode<T> head;

    public GenericDLList() {
        head = null;
    }

    public void addy(T item) {

        GenericDLNode<T> newNode = new GenericDLNode<>(item);

        //If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        //Traverse list to find end
        GenericDLNode<T> current = head;

        while(current.next != null) {
            current = current.next; //update the last node to point to the new node
        }

        //attach new node to the end
        current.next = newNode;
        newNode.prev = current;

    }

    public void removy(int pos){
        //List is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        GenericDLNode<T> current = head;
        int index = 0;

        //traverse to position
        while (current != null && index < pos) {
            current = current.next;
            index++;
        }

        // Remove head
        if (pos == 0) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            return;
        }

        // Remove nodes other than head

        GenericDLNode<T> previous = current.prev;
        GenericDLNode<T> nextNode = current.next;

        if (previous != null) {
            previous.next = nextNode;
        }

        if(nextNode != null) {
            nextNode.prev = previous;
        }
    }

    public String toString() {
        if (head == null) return "Empty List\n";

        String result = "";
        GenericDLNode<T> current = head;

        while (current != null) {
            result += current.data.toString() + "\n";
            current = current.next;
        }
        return result;

    }
}

/*
Sources:
https://www.w3schools.com/java/java_generics.asp
https://www.geeksforgeeks.org/java/how-to-create-a-generic-array-in-java/
https://docs.oracle.com/javase/tutorial/java/generics/types.html

 */