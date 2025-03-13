import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Finder {
    private SongLibrary songlib;
    private List<Song> queryList;
    private Song querySingle;

    public Finder(SongLibrary sl){
        this.songlib = sl;
        this.queryList = new ArrayList<>();
    }

    //1 - find the longest song of the playlist
    public Song longestSongFinder(){
        this.querySingle = songlib.getMyLibrary().stream().max(Comparator.comparing(Song::getSecondsDuration)).get();
        return querySingle;
    }

    //2 - find all the songs by X authors, if present
    public List<Song> songsByWhom(String author){
        clearQuery();
        if(songlib.getMyLibrary().stream().anyMatch(x->x.getAuthor() == author)){
            this.queryList = songlib.getMyLibrary().stream().filter(x->x.getAuthor() == author).collect(Collectors.toList());
        }
        return this.queryList;
    }

    //3 - find and print all authors names 
    public List<String> songAuthors(){
        return songlib.getMyLibrary().stream().map(x->x.getAuthor()).distinct().collect(Collectors.toList());
    }

    public void clearQuery(){
        if(!(queryList.isEmpty()))
            this.queryList.clear();
    }

    public void changeLibrary(SongLibrary sl){
        this.songlib = sl;
    }
}
