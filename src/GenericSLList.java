public class GenericSLList <T> {


    private GenericSLNode<T> head;

    public GenericSLList() {
        head = null;
    }

    public void addy(T item) {

        GenericSLNode<T> newSong = new GenericSLNode<>(item);

        //If list is empty
        if (head == null) {
            head = newSong;
            return;
        }

        //Traverse list to find end
        GenericSLNode<T> current = head;

        while(current.next != null) {
            current = current.next; //update the last node to point to the new node
        }

        //attach new node to the end
        current.next = newSong;

    }

    public void removy(int pos){
        //List is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        //remove the head
        if (pos == 0) {
            head = head.next;
        }

        GenericSLNode<T> current = head;
        int index = 0;

        //traverse to the node before the one we are trying to remove
        while (current != null && index < pos - 1) {
            current = current.next;
            index++;
        }

        //set the pointer of the node before the one we are trying to remove
        //to the node after the removed node
        current.next = current.next.next;
    }

    public String toString() {
        if (head == null) return "Empty List\n";

        String result = "";
        GenericSLNode<T> current = head;

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
