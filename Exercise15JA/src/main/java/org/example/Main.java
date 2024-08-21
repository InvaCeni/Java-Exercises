package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator()
                .setTitle("Inception")
                .setDirector("Christopher Nolan")
                .setYearOfRelease(2010)
                .setGenre("Science Fiction")
                .setDistributor("Warner Bros")
                .createMovie();

        System.out.println(movie);
    }
}