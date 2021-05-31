package Model;

import Helpers.HelperFunctions;

import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
    //Atributai
    private int id;
    private String title;
    private Enum genre;
    private int rating;
    private ArrayList<Cast> actor;
    private ArrayList<Comment> commentText;
    private static ArrayList<Movie> movies;

    //#region Getteriai ir Setteriai
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Enum getGenre() {
        return genre;
    }

    public void setGenre(Enum genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<Cast> getActor() {
        return actor;
    }

    public void setActor(ArrayList<Cast> actor) {
        this.actor = actor;
    }

    public ArrayList<Comment> getCommentText() {
        return commentText;
    }

    public void setCommentText(ArrayList<Comment> commentText) {
        this.commentText = commentText;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }


//#endregion

    // Konstruktorius
    public Movie(String title, Enum genre, int rating) {
        this.id = HelperFunctions.generateNewId();
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.actor = new ArrayList<Cast>();
        this.commentText = new ArrayList<Comment>();
        this.movies = new ArrayList<Movie>();


//        if (this.title == null) {
//            System.out.println("TITLE ERROR!");
//        } else {
//            System.out.println(this.title);
//        }
//
//        if (this.rating < 1 || this.rating > 5) {
//            System.out.println("RATING ERROR!");
//        } else {
//            System.out.println(this.rating);
//        }

    }

    //#region kitos funkcijos


    // pridedu komentarus prie filmu
    public void addComment(Comment comment) {
        if (comment != null) {
            this.commentText.add(comment);
        }
    }

    //pridedu aktorius prie filmu
    public void addCast(Cast cast) {
        if (cast != null) {
            this.actor.add(cast);
        }
    }

    // Spausdinu komentarus
    public void printCommentSheet() {
        for (Comment i : this.commentText) {
            System.out.println("'" + i.getCText() + "'");
        }
    }

    // Spausdinu aktorius
    public void printCastSheet() {
        for (Cast i : this.actor) {
            System.out.println(i.getActorName());
        }
    }


    // Paieska + atspausdina filmo informacija
    public static void printMovie(ArrayList<Movie> movies, Scanner scanner) {
        while (true) {
            String search = scanner.nextLine();
            for (Movie i : movies) {
                if (search.equals(i.title)) {
                    System.out.println(i.title);
                    System.out.println("Starring: ");
                    i.printCastSheet();
                    System.out.println("Look at these comments: ");
                    i.printCommentSheet();
                    if (i.rating < 1 || i.rating > 5) {
                        System.out.println("RATING ERROR!");
                    } else {
                        System.out.println("Rating of this movie is: " + i.rating);
                    }
                } else {
                    i.castLoop(search);
                }
            }
            System.out.println("Search >>> ");
        }
    }

    // Ieskau kokiuose filmuose vaidina aktoriai
    public void castLoop(String search) {
        for (Cast i : this.actor) {
            if (search.equals(i.getActorName())) {
                if (this.title == null) {
                    System.out.println("TITLE ERROR!");
                } else {
                    System.out.println(this.genre + " " + this.title);
                }
            }
        }
    }
}

//#endregion


