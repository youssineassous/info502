public class Media {

    private String titre;
    private StringBuffer cote;
    private int note;

    private static String nomMediatheque;

    public Media() {
        this.titre = "";
        this.cote = new StringBuffer();
        this.note = 0;
    }

    public Media(String titre, StringBuffer cote, int note) {
        this.titre = titre;
        this.cote = cote;
        this.note = note;
    }

    public Media(Media autre) {
        this.titre = autre.titre;
        this.cote = new StringBuffer(autre.cote.toString());
        this.note = autre.note;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public StringBuffer getCote() {
        return new StringBuffer(this.cote);
    }
    
    public void setCote(StringBuffer cote) {
        this.cote = cote;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public static String getNomMediatheque() {
        return nomMediatheque;
    }

    public static void setNomMediatheque(String nom) {
        nomMediatheque = nom;
    }

    @Override
    public Media clone() {
        return new Media(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Media media = (Media) obj;
        return note == media.note && titre.equals(media.titre) && cote.toString().equals(media.cote.toString());
    }

    @Override
    public String toString() {
        return "Titre: " + titre + ", Cote: " + cote + ", Note: " + note;
    }
}
