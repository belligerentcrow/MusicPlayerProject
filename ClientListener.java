public class ClientListener {
    
    public static void main(String[] args) {
        //Creating instances of SongLibrary, a MusicPlayer, and an AdvancedControl
        SongLibrary myLibrary = new SongLibrary();
        MusicPlayer vlc = new MusicPlayer(myLibrary);
        AdvancedControl controls = new AdvancedControl(myLibrary);


        //creating songs
        Song song1 = new Song("Don't Stop Me Now", "Queen", 5*60,1978);
        Song song2 = new Song("Doctor Who Opening 9 Season", "Murray Gold", 60,2018);
        Song song3 = new Song("Smells Like Teen Spirit", "Nirvana", 5*60+1,1991);
        Song song4 = new Song("William Tell Overture", "Rossini", 3*60+6,1829);
        Song song5 = new Song("Colgera's Theme", "Hajime Wakai", 3*60,2023);
        Song song6 = new Song("Bohemian Rhapsody", "Queen", 6*60,1975);
        Song song7 = new Song("Francesca", "Hozier", 4*60+30,2023);
        Song song8 = new Song("London Calling", "The Clash", 3*60+20,1979);
        Song song9 = new Song("Clara's Theme", "Murray Gold",3*60+24,2013);
        Song song10 = new Song("Another One Bites the Dust", "Queen", 3*60+34,1980);

        //adding the songs to the instance of the library
        myLibrary.addSong(song1);
        myLibrary.addSong(song2);
        myLibrary.addSong(song3);
        myLibrary.addSong(song4);
        myLibrary.addSong(song5);
        myLibrary.addSong(song6);
        myLibrary.addSong(song7);
        myLibrary.addSong(song8);
        myLibrary.addSong(song9);
        myLibrary.addSong(song10);

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
        
        //Demostration of the AdvancedControl controls -- Sorter
        controls.sortByTitle();
        vlc.playMusic();

        controls.sortByAuthor();
        vlc.playMusic();

        controls.sortByYear();
        vlc.playMusic();

        System.out.println("Controls = Find songs by Queen");

        //Demostration of the AdvancedControl controls -- Finder
        controls.findByWhom("Queen");
        
        vlc.playMusic();

        System.out.println("Back to library");
        controls.backToLibrary();
        vlc.playMusic();

        System.out.println("Controls = Find songs by The Beatles");
        controls.findByWhom("The Beatles");
        vlc.playMusic();
        
        System.out.println("Back to library");
        controls.backToLibrary();

        controls.findAllAuthors();

    }

    
    
}
