public class Film extends Media {

    private String realisateur;
    private int annee;

    public Film() {
        super();  
        this.realisateur = "";
        this.annee = 0;
    }

    public Film(String titre, StringBuffer cote, int note, String realisateur, int annee) {
        super(titre, cote, note); 
        this.realisateur = realisateur;
        this.annee = annee;
    }


    public Film(Film autre) {
        super(autre);  
        this.realisateur = autre.realisateur;
        this.annee = autre.annee;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public Film clone() {
        return new Film(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Film film = (Film) obj;
        return annee == film.annee && realisateur.equals(film.realisateur);
    }

    @Override
    public String toString() {
        return super.toString() + ", Réalisateur: " + realisateur + ", Année: " + annee;
    }
}
