public class ClientListener {
    
    public static void main(String[] args) {
        //Creating a SongLibrary and a MusicPlayer
        SongLibrary myLibrary = new SongLibrary();
        MusicPlayer vlc = new MusicPlayer(myLibrary);

        //creating two songs
        Song song1 = new Song("Don't Stop Me Now", "Queen", 5*60);
        Song song2 = new Song("Doctor Who Opening 9 Season", "Murray Gold", 60);

        //adding the songs to the instance of the library
        myLibrary.addSong(song1);
        myLibrary.addSong(song2);

        //creating two more songs
        Song song3 = new Song("Smells Like Teen Spirit", "Nirvana", 5*60+1);
        Song song4 = new Song("William Tell Overture", "Rossini", 3*60+6);
        Song song5 = new Song("Colgera's Theme", "Hajime Wakai", 3*60);
        Song song6 = new Song("Bohemian Rhapsody", "Queen", 6*60);
        Song song7 = new Song("Francesca", "Hozier", 4*60+30);
        Song song8 = new Song("London Calling", "The Clash", 3*60+20);
        Song song9 = new Song("Clara's Theme", "Murray Gold",3*60+24);
        Song song10 = new Song("Another One Bites the Dust", "Queen", 3*60+34);



        //adding them to the library
        myLibrary.addSong(song3);
        myLibrary.addSong(song4);
        myLibrary.addSong(song5);

        //using the "vlc" player
        vlc.playMusic();
        vlc.switchMode();
        vlc.nextSong();
        vlc.playMusic();
        vlc.switchMode();
        vlc.switchMode();

        vlc.nextSong();
        vlc.playMusic();

        vlc.nextSong();
        vlc.playMusic();

        vlc.nextSong();
        vlc.playMusic();

        vlc.prevSong();
        vlc.playMusic();

        vlc.switchMode();
        vlc.playMusic();
    }

    
    
}
