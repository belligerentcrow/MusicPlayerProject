public class Song {
    private String title;
    private String author;
    private int secondsDuration;
    private int publishingYear;
    
    /** Constructor needs the title, the author, and the duration in seconds. 
     * @param t : The title of the song
     * @param au : The author of the song
     * @param durat : The duration of the song, in seconds
    */
    public Song(String t, String au, int durat, int pubYear){
        this.title = t;
        this.author = au; 
        this.secondsDuration = durat;
        this.publishingYear = pubYear;
    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public int getSecondsDuration() {
        return secondsDuration;
    }
    public int getPublishingYear() {
        return publishingYear;
    }

    /**Override the toString method in order to print song details.*/ 
    @Override
    public String toString(){
        return this.title + " by " + this.author + " - " + (this.secondsDuration)/60 + "m" + ", published in: "+ this.publishingYear;
    }
}
