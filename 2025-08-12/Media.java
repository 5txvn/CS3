interface Playable {
    void play();
    void pause();
    String getInfo();
}

abstract class Media implements Playable {
    private String title;
    private int duration;

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getInfo() {
        return "Title: " + title + ", Duration: " + duration + "s";
    }

    public String getTitle() {
        return title;
    }
    
    public abstract void play();
    public abstract void pause();
}

class Song extends Media {
    private String artist;

    public Song(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }
    
    public void play() {
        System.out.println("Now playing song: " + getTitle() + " by " + artist);
    }
    
    public void pause() {
        System.out.println("Pausing song: " + getTitle());
    }
}

class Podcast extends Media {
    private String host;

    public Podcast(String title, int duration, String host) {
        super(title, duration);
        this.host = host;
    }
    
    public void play() {
        System.out.println("Starting podcast: " + getTitle() + " hosted by " + host);
    }
    
    public void pause() {
        System.out.println("Pausing podcast: " + getTitle());
    }
}