package übung3;

import java.util.ArrayList;

public class Album extends Playable {
    public String albumTitle;  // album title
    public ArrayList<Track> tracks = new ArrayList<>();  // tracks

    public Album(String albumTitle, String artist) {
        super(artist, albumTitle);
    }

    public String getDescription() {
        return albumTitle + " by " + getArtistName() + " (" + getRuntimeString(length) + ")";
    }

    /**
     * Updates the length of the album by calculating the sum of track lengths
     * Developer Note: Call this after adding tracks!
     */
    public void updateLength() {
        this.length = 0;
        for (Track track :
                tracks) {
            this.length += track.length;
        }
    }
}
