package übung3;

public class Album extends Playlist {
    private final Artist artist;  // artist name

    public Album(String albumTitle, Artist artist) {
        super(albumTitle);
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }
}
