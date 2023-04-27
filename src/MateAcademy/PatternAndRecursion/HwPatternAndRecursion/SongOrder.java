package MateAcademy.PatternAndRecursion.HwPatternAndRecursion;

public class SongOrder {

    private final String singer;
    private final String songName;

    private SongOrder(String singer, String songName) {
        this.singer = singer;
        this.songName = songName;
    }

    private SongOrder(String singer) {
        this(singer, null);
    }

    public static SongOrder of(String singer) {
        return new SongOrder(singer);
    }

    public static SongOrder of(String singer, String songName) {
        return new SongOrder(singer, songName);
    }

    @Override
    public String toString() {
        if (singer == null) {
            return "You haven't chosen a singer. Please make your choice)";
        } else if (songName == null) {
            return "Play any " + singer + " song";
        } else {
            return "Play " + singer + " song called \"" + songName + "\"";
        }
    }
}

