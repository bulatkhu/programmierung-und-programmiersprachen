package übung3;

public class Track extends Playable {
    public String album;  // track album

    public Track(String trackTitle, String artist, String album, int length) {
        super(artist, trackTitle, length);
        this.album = album;
    }
}
