import java.util.ArrayList;
import java.util.List;

public class AdvancedControl {
    private SongLibrary songlib;
    private Sorter sorter;
    private Finder finder;
    private List<Song> currentUserQuery;
    private List<Song> libraryStoring;

    public AdvancedControl(SongLibrary sl){
        this.songlib = sl;
        this.sorter = new Sorter(sl);
        this.finder = new Finder(sl);
        this.currentUserQuery = new ArrayList<>();
        this.libraryStoring = new ArrayList<>();
    }

    public void sortByTitle(){
        sorter.sortByTitleName();
    }

    public void sortByAuthor(){
        sorter.sortByAuthorName();
    }

    public void sortByYear(){
        sorter.sortByPublishingYear();
    }

    //Finders
    public void findLongest(){
        clearQuery();
        this.currentUserQuery.add(finder.longestSongFinder());
        this.songlib.modifyWhereInList(songlib.getMyLibrary().indexOf(currentUserQuery.get(0)));
    }

    public void findByWhom(String authr){
        clearQuery();
        this.libraryStoring = this.songlib.getMyLibrary();
        this.currentUserQuery = finder.songsByWhom(authr);
        this.songlib.modifyPlaylist(currentUserQuery);
    }

    public void findAllAuthors(){
        System.out.println("All authors in playlist: "+ finder.songAuthors());
        
    }


    public void backToLibrary(){
        this.songlib.modifyPlaylist(libraryStoring);
    }

    public void modifySongLib(SongLibrary sl){
        this.songlib = sl;
        sorter.changeLibrary(sl);
        finder.changeLibrary(sl);
    }
    public void clearQuery(){
        if(!(currentUserQuery.isEmpty()))
            this.currentUserQuery.clear();
    }
}
