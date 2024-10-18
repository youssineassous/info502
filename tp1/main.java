public class main {
    public static void main(String[] args) {
        Livre livre1 = new Livre("1984", new StringBuffer("A1B2C3"), 9, "George Orwell", 328);

        System.out.println(livre1);

        livre1.setAuteur("Orwell");
        livre1.setNbPages(350);

        System.out.println("Après modification : " + livre1);
        System.out.println("\n");

        Film film1 = new Film("Inception", new StringBuffer("D4E5F6"), 10, "Christopher Nolan", 2010);
        System.out.println(film1);

        film1.setRealisateur("Nolan");
        film1.setAnnee(2012);
        System.out.println("Après modification : " + film1);

        Film film2 = new Film(film1);
        System.out.println("Copie du film : " + film2);

        System.out.println("Les deux films sont-ils égaux ? " + film1.equals(film2));
    }
}
