package übung3;

public class Track implements Playable {
    private final String trackTitle;  // album title
    private final Album album;  // track album
    private int length;  // length of the track in seconds


    public Track(String trackTitle, Album album, int length) {
        this.trackTitle = trackTitle;
        this.album = album;
        this.length = length;
    }

    public void setLength(int hours, int minutes, int seconds) {
        this.length = hours * 60 * 60 + minutes * 60 + seconds;
    }

    public int getLength() {
        return length;
    }

    public String getDescription() {
        return this.album.getArtist() + " - " + trackTitle + " (" + Playable.getRuntimeString(length) + ")";
    }
}
