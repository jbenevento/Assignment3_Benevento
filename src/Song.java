public class Song {

    private String title;
    private String artist;
    private double length;

    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;

    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getLength(){
        return length;
    }

    @Override
    public String toString() {
        return "{ songName: " + title +
                ", artist: " + artist +
                ", length: " + String.format("%.2f", length) + " }";
    }


}
