public class SLList {

    private SLNode head;

    public SLList() {
        head = null;
    }

    public void addy(Song s) {

        SLNode newSong = new SLNode(s);

        //If list is empty
        if (head == null) {
            head = newSong;
            return;
        }

        //Traverse list to find end
        SLNode current = head;

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

        SLNode current = head;
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
        SLNode current = head;

        while (current != null) {
            result += "{ songName: "
                    + current.song.getTitle()
                    + ", artist: "
                    + current.song.getArtist()
                    + ", length: "
                    + String.format("%.2f", current.song.getLength())
                    + " }\n";
            current = current.next;
        }
        return result;

    }
}

/*
Sources:
https://www.geeksforgeeks.org/dsa/difference-between-singly-linked-list-and-doubly-linked-list/
https://www.geeksforgeeks.org/dsa/search-an-element-in-a-linked-list-iterative-and-recursive/
https://www.geeksforgeeks.org/dsa/insert-a-node-at-a-specific-position-in-a-linked-list/

 */