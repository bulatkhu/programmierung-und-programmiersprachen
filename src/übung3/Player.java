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
     * @param playlist The album to play.
     */
    public void PlayPlaylist(Playlist playlist) {
        System.out.println("\uD834\uDD60 Playing " + playlist.getDescription());
        for (Track track: playlist.getTracks()) {
            PlayTrack(track);
        }
    }

    public static void main(String[] args) {
        Artist artist1 = new Artist("Pink Floyd");
        Artist artist2 = new Artist("Godspeed You! Black Emperor");

        Album wywh = new Album("Wish You Were Here", artist1);

        Track track1 = new Track("Shine On You Crazy Diamond, Pts. 1-5", artist1, wywh, 13*60+30);

        wywh.addTrack(new Track("Shine On You Crazy Diamond, Pts. 1-5", artist1, wywh, 13*60+30));
        wywh.addTrack(new Track("Welcome To The Machine", artist1, wywh, 7*60+33));
        wywh.addTrack(new Track("Have A Cigar", artist1, wywh, 5*60+7));
        wywh.addTrack(new Track("Wish You Were Here", artist1, wywh, 5*60+5));
        wywh.addTrack(new Track("Shine On You Crazy Diamond, Pts. 6-9", artist1, wywh, 12*60+23));

        Album lysf = new Album("Lift Your Skinny Fists Like Antennas to Heaven", artist2);

        Track track2 = new Track("Storm", artist2, lysf, 22*60+32);

        lysf.addTrack(new Track("Storm", artist2, lysf, 22*60+32));
        lysf.addTrack(new Track("Static", artist2, lysf, 22*60+35));
        lysf.addTrack(new Track("Sleep", artist2, lysf, 23*60+17));
        lysf.addTrack(new Track("Like Antennas To Heaven...", artist2, lysf, 18*60+57));

        Playlist playlist = new Playlist("Ambient Rock");
        playlist.addTrack(track1);
        playlist.addTrack(track2);


        Player player = new Player();
        player.PlayPlaylist(wywh);
        player.PlayPlaylist(lysf);
        player.PlayPlaylist(playlist);
    }

}
