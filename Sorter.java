import java.util.Comparator;
import java.util.stream.Collectors;

public class Sorter {
    private SongLibrary songlib;
    public Sorter(SongLibrary sl){
        this.songlib = sl;
    }

    //1 - Sort by Title Name
    public void sortByTitleName(){
        songlib.modifyPlaylist(songlib.getMyLibrary().stream().sorted(Comparator.comparing(Song::getTitle)).collect(Collectors.toList()));
    }

    //2 - Sort by Artist Name
    public void sortByAuthorName(){
        songlib.modifyPlaylist(songlib.getMyLibrary().stream().sorted(Comparator.comparing(Song::getAuthor)).collect(Collectors.toList()));
    }

    //3 - Sort by Publishing Year
    public void sortByPublishingYear(){
        songlib.modifyPlaylist(songlib.getMyLibrary().stream().sorted(Comparator.comparing(Song::getPublishingYear)).collect(Collectors.toList()));
    }

    public void changeLibrary(SongLibrary sl){
        this.songlib = sl;
    }
}
