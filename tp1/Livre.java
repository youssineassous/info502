public class Livre extends Media {
    
    private String auteur;
    private int nbPages;

    public Livre() {
        super(); 
        this.auteur = "";
        this.nbPages = 0;
    }

    public Livre(String titre, StringBuffer cote, int note, String auteur, int nbPages) {
        super(titre, cote, note); 
        this.auteur = auteur;
        this.nbPages = nbPages;
    }


    public Livre(Livre autre) {
        super(autre);
        this.auteur = autre.auteur;
        this.nbPages = autre.nbPages;
    }


    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    @Override
    public String toString() {
        return super.toString() + ", Auteur: " + auteur + ", Nombre de pages: " + nbPages;
    }
}
