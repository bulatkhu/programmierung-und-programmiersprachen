package übung3;

public class Playable extends Artist {
    String title;
    int length;

    public Playable(String artist, String title) {
        this(artist, title, 0);
    }

    public Playable(String artist, String title, int length) {
        super(artist);
        this.title = title;
        this.length = length;
    }

    public void setLength(int hours, int minutes, int seconds) {
        this.length = hours * 60 * 60 + minutes * 60 + seconds;
    }

    public String getDescription() {
        return this.getArtistName() + " - " + title + " (" + getRuntimeString(length) + ")";
    }

    /**
     * Formats a time in seconds into a String with the format hh:mm:ss or mm:ss if hours = 0
     *
     * @param timeInSeconds The time in seconds
     * @return The formatted String
     */
    public static String getRuntimeString(int timeInSeconds) {
        int tAbs = Math.abs(timeInSeconds);
        if (timeInSeconds >= 60 * 60) {
            int hours = Math.floorDiv(tAbs, 60 * 60);
            int minutes = Math.floorDiv(tAbs % (60 * 60), 60);
            int seconds = tAbs % 60;
            return String.format("%02d:%02d:%02d", hours, minutes, seconds);
        } else {
            int minutes = Math.floorDiv(tAbs, 60);
            int seconds = tAbs % 60;
            return String.format("%02d:%02d", minutes, seconds);
        }
    }
}
