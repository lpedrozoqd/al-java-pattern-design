package co.clarap.al.allPatternDesign.creacion.builder.v3;

//2do. paso: necesitamos un estudio para hacer la película
public abstract class BuilderMovieStudioAbstract {
    Movie movie = new Movie();
    public abstract void buildName();
    public abstract void buildGenre();
    public abstract void buildDuration();

    Movie getMovie(){
        return movie;
    }
}
