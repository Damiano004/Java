package progettostudente;

public class Persona {
    private String nome, cognome, eta;
    private char sesso;

    public Persona(String nome, String cognome, String eta, char sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.sesso = sesso;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEta() {
        return eta;
    }

    public String getNome() {
        return nome;
    }

    public char getSesso() {
        return sesso;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\nCognome: "+cognome+"\nEta: "+eta+"\nsesso: "+sesso+"\n";
    }
    
    
}
