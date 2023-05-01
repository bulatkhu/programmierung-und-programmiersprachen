package übung3;

public class Player {

    public Player() {
        System.out.println("\uD834\uDD60 LinAmpPlayer initialized \uD834\uDD60");
    }

    /**
     * Plays a single track (blocking call).
     * Mock implementation at 1000x speed.
     * @param track The track to play.
     */
    public void PlayTrack(Track track) {
        try {
            System.out.println("▶ (00:00/" + Track.getRuntimeString(track.length) + ") |o--------------| Now Playing: " + track.getDescription());
            Thread.sleep(track.length);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Plays all tracks on a given album (blocking call).
     * @param album The album to play.
     */
    public void PlayAlbum(Album album) {
        System.out.println("\uD834\uDD60 Playing " + album.getDescription());
        for (Track track: album.tracks) {
            PlayTrack(track);
        }
    }

    public static void main(String[] args) {
        Album wywh = new Album("Wish You Were Here", "Pink Floyd");
        wywh.tracks.add(new Track("Shine On You Crazy Diamond, Pts. 1-5", wywh, 13*60+30));
        wywh.tracks.add(new Track("Welcome To The Machine", wywh, 7*60+33));
        wywh.tracks.add(new Track("Have A Cigar", wywh, 5*60+7));
        wywh.tracks.add(new Track("Wish You Were Here", wywh, 5*60+5));
        wywh.tracks.add(new Track("Shine On You Crazy Diamond, Pts. 6-9", wywh, 12*60+23));
        wywh.updateLength();

        Album lysf = new Album("Lift Your Skinny Fists Like Antennas to Heaven", "Godspeed You! Black Emperor");
        lysf.tracks.add(new Track("Storm", lysf, 22*60+32));
        lysf.tracks.add(new Track("Static", lysf, 22*60+35));
        lysf.tracks.add(new Track("Sleep", lysf, 23*60+17));
        lysf.tracks.add(new Track("Like Antennas To Heaven...", lysf, 18*60+57));
        lysf.updateLength();

        Player player = new Player();
        player.PlayAlbum(wywh);
        player.PlayAlbum(lysf);
    }

}
