import Enums.MovieGenreEnum;
import Model.Cast;
import Model.Comment;
import Model.Movie;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a movie or actor's name   > ");



        //#region Filmai
        Movie movie1 = new Movie(null, MovieGenreEnum.COMMEDY, 0);
        Movie movie2 = new Movie("The Outlaw Josey Wales", MovieGenreEnum.ACTION, 4);
        Movie movie3 = new Movie("Extinction", MovieGenreEnum.DRAMA, 3);
        Movie movie4 = new Movie("Stripes", MovieGenreEnum.COMMEDY, 2);
        Movie movie5 = new Movie("Where Eagles Dare", MovieGenreEnum.DRAMA, 1);
        Movie movie6 = new Movie("Street Kings", MovieGenreEnum.ACTION, 2);
        Movie movie7 = new Movie("Stigmata", MovieGenreEnum.HORROR, 3);
        Movie movie8 = new Movie("Freaks of Nature", MovieGenreEnum.COMMEDY, 4);
        Movie movie9 = new Movie("Ida", MovieGenreEnum.DRAMA, 5);
        Movie movie10 = new Movie("Inside", MovieGenreEnum.HORROR, 6);
        //#endregion

        //#region add movie to movies ArrayList
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
        //#endregion

        //#region Aktoriai

        movie1.addCast(new Cast("Steve McQueen"));
        movie1.addCast(new Cast("Charles Bronson"));

        movie2.addCast(new Cast("Elisabeth Lindy"));
        movie2.addCast(new Cast("Merry Porter"));

        movie3.addCast(new Cast("Roddy Will"));
        movie3.addCast(new Cast("Cynthia Roxanna"));

        movie4.addCast(new Cast("Gabriel Sharon"));
        movie4.addCast(new Cast("Kathi Nicky"));

        movie5.addCast(new Cast("Brandon Dianna"));
        movie5.addCast(new Cast("Thom Lilah"));

        movie6.addCast(new Cast("Thom Lilah"));
        movie6.addCast(new Cast("Kathi Nicky"));

        movie7.addCast(new Cast("Brandon Dianna"));
        movie7.addCast(new Cast("Gabriel Sharon"));

        movie8.addCast(new Cast("Cynthia Roxanna"));
        movie8.addCast(new Cast("Merry Porter"));

        movie9.addCast(new Cast("Roddy Will"));
        movie9.addCast(new Cast("Steve McQueen"));

        movie10.addCast(new Cast("Elisabeth Lindy"));
        movie10.addCast(new Cast("Charles Bronson"));
        //#endregion

        //#region Komentarai
        movie1.addComment(new Comment("Remake of A. Kurosawas The Seven Samurai."));
        movie1.addComment(new Comment("Silver screen classic!"));

        movie2.addComment(new Comment("To infinity, and beyond!"));
        movie2.addComment(new Comment("I have vision, and the rest of the world wears bifocals."));

        movie3.addComment(new Comment("You just keep thinkin' Butch. That's what you're good at."));
        movie3.addComment(new Comment("What we've got here is failure to communicate."));

        movie4.addComment(new Comment("Go ahead, make my day."));
        movie4.addComment(new Comment("Fasten your seatbelts, it's going to be a bumpy night!"));

        movie5.addComment(new Comment("Here's looking at you, kid."));
        movie5.addComment(new Comment("I'll be back!"));

        movie6.addComment(new Comment("Somebody put me back in the fridge."));
        movie6.addComment(new Comment("No matter what anybody tells you - Words and ideas can change the world."));

        movie7.addComment(new Comment("If you can't be an athlete, be an athletic supporter!"));
        movie7.addComment(new Comment("I've got so many hickies people will think I'm a leper."));

        movie8.addComment(new Comment("Ladies & gentlemen...dingleberries on parade!"));
        movie8.addComment(new Comment("Silver screen classic!"));

        movie9.addComment(new Comment("Well, I'm outta here! I hear that Asteroids machine calling my name from the gameroom, so Peace!"));
        movie9.addComment(new Comment("What's the matter with you? Your life's going down the toilet!"));

        movie10.addComment(new Comment("Old man, you give those dogs another piece of my food, I'm gonna kick ya till yer dead."));
        movie10.addComment(new Comment("Whoops daisies!"));
        //#endregion

            Movie.printMovie(movies, scanner);
    }
}
