class Movie{
    String title;
    String director;
    int year;
    double rating;
    Movie next, prev;

    public Movie(String title, String director, int year, double rating){
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        
    }
}
public class MovieManagement {
    Movie head, tail;

    public void addMovieAtBeginning(String title, String director, int year, double rating){
        Movie newMovie = new Movie(title, director, year, rating);
            if(head == null){
                head = tail = newMovie;
            }else{
                newMovie.next = head;
                head.prev = newMovie;
                head = newMovie;
            }
    }
    public void addAtEnd(String title, String director, int year, double rating){
        Movie newMovie = new Movie(title, director, year, rating);
        if(head == null){
            head = tail = newMovie;
        }else{
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }
    public void addAtPosition(String title, String director, int year, double rating, int position){
        Movie newMovie = new Movie(title, director, year, rating);
        if (position <= 1 || head == null) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }
        Movie temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }
        newMovie.next = temp.next;
        newMovie.prev = temp;
        temp.next.prev = newMovie;
        temp.next = newMovie;
    }

    void removeMovieByTitle(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp == head) head = head.next;
        if (temp == tail) tail = tail.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    void searchMovieByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println(temp.title + " (" + temp.year + ") - Rating: " + temp.rating);
            }
            temp = temp.next;
        }
    }

    void searchMovieByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println(temp.title + " (" + temp.year + ") - Directed by " + temp.director);
            }
            temp = temp.next;
        }
    }

    void updateMovieRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayForword(){
        Movie temp = head;
        while(temp!=null){
            System.out.println(temp.title + " (" + temp.year + ") - "+ temp.rating);
            temp = temp.next;
        }
    }
    public void displayReversed(){
    Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " (" + temp.year + ") - " + temp.rating);
            temp = temp.prev;
        }
    }
    public static void main(String[] args) {
        MovieManagement mm = new MovieManagement();
        mm.addMovieAtBeginning("life", "main hun", 2010, 8.8);
        mm.addMovieAtBeginning("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        
        System.out.println("All Movies:");
        mm.addAtEnd("Tiger zinda h", "salman", 2022, 8);
        mm.addAtEnd("Tiger zinda h111", "salman khan", 2222, 7);

        mm.addAtPosition("The Dark Knight", "Christopher Nolan", 2008, 9.0, 2);
        // mm.displayForword();

        mm.removeMovieByTitle("Tiger zinda h111");
        // mm.displayForword();

        System.out.println("Search by Director (Christopher Nolan):");
        mm.searchMovieByDirector("Christopher Nolan");

        System.out.println("Updating Rating of The Dark Knight to 9.1");
        mm.updateMovieRating("The Dark Knight", 9.1);
        mm.displayForword();
    }
}
