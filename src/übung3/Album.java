package übung3;

import java.util.ArrayList;

public class Album implements Playable {
    private final String albumTitle;  // album title
    private final String artist;  // artist name
    private final ArrayList<Track> tracks = new ArrayList<>();  // tracks
    private int length;  // length of the album in seconds

    public Album(String albumTitle, String artist) {
        this.albumTitle = albumTitle;
        this.artist = artist;
    }

    public String getDescription() {
        return albumTitle + " by " + artist + " (" + Playable.getRuntimeString(length) + ")";
    }

    public void setLength(int hours, int minutes, int seconds) {
        this.length = hours * 60 * 60 + minutes * 60 + seconds;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    /**
     * Updates the length of the album by calculating the sum of track lengths
     * Developer Note: Call this after adding tracks!
     */
    public void updateLength() {
        this.length = 0;
        for (Track track :
                tracks) {
            this.length += track.getLength();
        }
    }
}
