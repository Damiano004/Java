package proggestcond;

public class Main {

    public static void main(String[] args) {
        Appartamento a11 = new Appartamento("Damiano", "Purin", "1");
        Appartamento a12 = new Appartamento("Giacomo", "Leopardi", "7");
        Appartamento a13 = new Appartamento("Valeria", "Minati", "16");
        Appartamento a21 = new Appartamento("Federica", "Purin", "3");
        Appartamento a22 = new Appartamento("Beatrice", "Girani", "6");
        Appartamento a31 = new Appartamento("Filippo", "Rizza", "3");
        Appartamento a32 = new Appartamento("Luigi", "Rossi", "19");
        Appartamento[] a1 = {a11, a12, a13};
        Appartamento[] a2 = {a21, a22};
        Appartamento[] a3 = {a31, a32};

        Condominio c1 = new Condominio("Cenone", "19", a1);
        Condominio c2 = new Condominio("nuova", "17", a2);
        Condominio c3 = new Condominio("Accademia", "231", a3);
        Condominio[] c12 = {c1, c2, c3};

        GestioneAppartamento g = new GestioneAppartamento("Milano", "Andrea Rosmini", c12);
        System.out.println(g.toString());
    }

}
