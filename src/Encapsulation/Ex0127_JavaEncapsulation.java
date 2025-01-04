package Encapsulation;

public class Ex0127_JavaEncapsulation {
    public static void main(String[] args) {
        Movie movie = new Movie();

        movie.setter("Doraemon: Nobita's Earth Symphony", "Kazuaki lmai", 115);
        movie.getter();
        System.out.println(movie.getMovieDetails());

    }

    static class Movie {
        private String title;
        private String director;
        private int duration;

        public void setter(String title, String director, int duration) {
            this.title = title;
            this.director = director;
            this.duration = duration;
        }

        public void getter() {
            System.out.println("Title: " + title);
            System.out.println("Director: " + director);
            System.out.println("Duration: " + duration + " minutes");
        }

        public String getMovieDetails() {
            return "Title: " + title + ", director: " + director + ", duration: " + duration + " minutes";
        }
    }
}
