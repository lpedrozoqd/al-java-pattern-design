package co.clarap.al.allPatternDesign.creacion.builder.v3;

public class BuildTester {
    public static void main(String[] args) {
        MakeAMovie makeAMovie = new MakeAMovie(new Rambo());
        makeAMovie.filmMovie();
        Movie movie = makeAMovie.seeMovie();
        System.out.println(movie.genre);
        System.out.println(movie.duration);
        System.out.println(movie.name);

    }    
}
