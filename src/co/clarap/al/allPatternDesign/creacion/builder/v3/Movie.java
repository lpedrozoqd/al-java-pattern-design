package co.clarap.al.allPatternDesign.creacion.builder.v3;

//1er. paso: necesitamos la película
public class Movie {
    public String name;
    public String genre;
    public int duration;

    public void setName(String name) {
        this.name = name;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

}
