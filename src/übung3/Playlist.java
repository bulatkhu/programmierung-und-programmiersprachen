package übung3;

import java.util.ArrayList;

public class Playlist implements Playable {
    private int length;  // length of the album in seconds
    private final String title;
    private final ArrayList<Track> tracks = new ArrayList<>();  // tracks

    public Playlist(String title) {
        this.title = title;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void addTrack(Track track) {
        tracks.add(track);
        this.updateLength();
    }

    public void setLength(int hours, int minutes, int seconds) {
        this.length = hours * 60 * 60 + minutes * 60 + seconds;
    }

    public int getLength() {
        return length;
    }

    public String getDescription() {
        return title + " (" + Playable.getRuntimeString(getLength()) + ")";
    }

    /**
     * Updates the length of the album by calculating the sum of track lengths
     * Developer Note: Call this übung7_example.example.after adding tracks!
     */
    private void updateLength() {
        this.length = 0;
        for (Track track :
                tracks) {
            this.length += track.getLength();
        }
    }

}
