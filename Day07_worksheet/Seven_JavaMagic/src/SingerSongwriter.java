public class SingerSongwriter extends Singer{

    public SingerSongwriter(String name) {
        super(name);
    }

    public void writeSong(String title) {
        System.out.println("Writing song with title: " + title);
    }
}
