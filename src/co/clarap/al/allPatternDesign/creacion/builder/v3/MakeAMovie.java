package co.clarap.al.allPatternDesign.creacion.builder.v3;

//4t0. paso: se hace la película
public class MakeAMovie {
    private final BuilderMovieStudioAbstract abstractMovie;

    public MakeAMovie(BuilderMovieStudioAbstract abstractMovie){
        this.abstractMovie = abstractMovie;
    }
        
    public void filmMovie(){
        abstractMovie.buildName();
        abstractMovie.buildGenre();
        abstractMovie.buildDuration();
    }

    public Movie  seeMovie(){
        return abstractMovie.getMovie();
    }
}
