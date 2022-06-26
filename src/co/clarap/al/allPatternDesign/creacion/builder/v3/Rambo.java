package co.clarap.al.allPatternDesign.creacion.builder.v3;

//3er. necesitamos una idea para filmar una película
public class Rambo extends BuilderMovieStudioAbstract {

    @Override
    public void buildName() {
        this.movie.setName("Rambo");
        
    }

    @Override
    public void buildGenre() {
        this.movie.setGenre("Acción");
        
    }

    @Override
    public void buildDuration() {
        this.movie.setDuration(120);
        
    }
    
}
