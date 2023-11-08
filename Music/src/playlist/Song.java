package playlist;

public class Song {
	private String SongName;
    private String Artist;
    private String Duration;

    public Song(String SongName, String Artist, String Duration) {
        this.SongName = SongName;
        this.Artist = Artist;
        this.Duration = Duration;
    }
    public void showSong(){
    	
        System.out.print(this.getSongName());
        System.out.print("------------->"+this.getArtist());
        System.out.println("------------>"+this.getDuration());
    }

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String SongName) {
        this.SongName = SongName;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }
    
}