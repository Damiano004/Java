package proggestcond;

public class Appartamento {

    private String nome, cognome, nApp;

    public Appartamento(String nome, String cognome, String nApp) {
        this.nome = nome;
        this.cognome = cognome;
        this.nApp = nApp;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getnApp() {
        return nApp;
    }

    @Override
    public String toString() {
        return "Appartamento numero " + nApp + ".\nProprietario: " + nome + " " + cognome + "\n";
    }

}
