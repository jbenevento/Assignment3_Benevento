public class AList {

private Song[] songsList;
private int size;
private int maxSize;

    public AList() {
        maxSize = 10;
        songsList = new Song[maxSize];
        size = 0;


    }

    public void addy(Song p) {
        if (size == maxSize){
            maxSize *= 2;
            Song[] newList = new Song[maxSize];

            for (int i = 0; i < size; i++){
                newList[i] = songsList[i];
            }

            songsList = newList;
        }

        songsList[size] = p;
        size++;
    }

    public void removy(int pos) {

        for(int i = pos; i < size - 1; i++) {
                songsList[i] = songsList[i + 1];
        }

        size--;
    }

    public String toString() {
    if (size == 0) return "Empty List\n";

    String result = "";
    for (int i = 0; i < size; i++) {
        result += "{ songName: "
               + songsList[i].getTitle()
               + ", artist: "
               + songsList[i].getArtist()
               + ", length: "
               + String.format("%.2f", songsList[i].getLength())
               + " }\n";
    }
    return result;

    }
}
