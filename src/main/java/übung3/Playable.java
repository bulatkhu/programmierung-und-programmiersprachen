package übung3;

public interface Playable {
    void setLength(int hours, int minutes, int seconds);

    String getDescription();

    /**
     * Formats a time in seconds into a String with the format hh:mm:ss or mm:ss if hours = 0
     *
     * @param timeInSeconds The time in seconds
     * @return The formatted String
     */
    static String getRuntimeString(int timeInSeconds) {
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
