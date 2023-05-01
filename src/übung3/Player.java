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
            System.out.println("▶ (00:00/" + Playable.getRuntimeString(track.getLength()) + ") |o--------------| Now Playing: " + track.getDescription());
            Thread.sleep(track.getLength());
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
        for (Track track: album.getTracks()) {
            PlayTrack(track);
        }
    }

    public static void main(String[] args) {
        Artist artist1 = new Artist("Pink Floyd");
        Artist artist2 = new Artist("Godspeed You! Black Emperor");

        Album wywh = new Album("Wish You Were Here", artist1);
        wywh.addTrack(new Track("Shine On You Crazy Diamond, Pts. 1-5", wywh, 13*60+30));
        wywh.addTrack(new Track("Welcome To The Machine", wywh, 7*60+33));
        wywh.addTrack(new Track("Have A Cigar", wywh, 5*60+7));
        wywh.addTrack(new Track("Wish You Were Here", wywh, 5*60+5));
        wywh.addTrack(new Track("Shine On You Crazy Diamond, Pts. 6-9", wywh, 12*60+23));
        wywh.updateLength();

        Album lysf = new Album("Lift Your Skinny Fists Like Antennas to Heaven", artist2);
        lysf.addTrack(new Track("Storm", lysf, 22*60+32));
        lysf.addTrack(new Track("Static", lysf, 22*60+35));
        lysf.addTrack(new Track("Sleep", lysf, 23*60+17));
        lysf.addTrack(new Track("Like Antennas To Heaven...", lysf, 18*60+57));
        lysf.updateLength();

        Player player = new Player();
        player.PlayAlbum(wywh);
        player.PlayAlbum(lysf);
    }

}
