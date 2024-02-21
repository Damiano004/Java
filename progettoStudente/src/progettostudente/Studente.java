package progettostudente;

public class Studente extends Persona{
    
    private String matricola, corso;

    public Studente(String matricola, String corso, String nome, String cognome, String eta, char sesso) {
        super(nome, cognome, eta, sesso);
        this.matricola = matricola;
        this.corso = corso;
    }

    public String getMatricola() {
        return matricola;
    }

    public String getCorso() {
        return corso;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCorso frequentato: "+corso+"\nMatricola: "+matricola;
    }

    
    
}
