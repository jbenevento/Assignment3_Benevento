public class DLList {

    private DLNode head;

    public DLList() {
        head = null;
    }

    public void addy(Song s) {

        DLNode newSong = new DLNode(s);

        //If list is empty
        if (head == null) {
            head = newSong;
            return;
        }

        //Traverse list to find end
        DLNode current = head;

        while(current.next != null) {
            current = current.next; //update the last node to point to the new node
        }

        //attach new node to the end
        current.next = newSong;
        newSong.prev = current;

    }

    public void removy(int pos){
        //List is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        DLNode current = head;
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

        DLNode previous = current.prev;
        DLNode nextNode = current.next;

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
        DLNode current = head;

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
https://www.geeksforgeeks.org/dsa/introduction-to-doubly-linked-lists-in-java/
https://www.geeksforgeeks.org/dsa/difference-between-singly-linked-list-and-doubly-linked-list/
 */