package operazionimat;

public class Operazioni {

    private int a;
    private int b;

    public Operazioni(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    private int somma() {
        int out = a + b;
        return out;
    }

    private int sottrazione() {
        int out = a - b;
        return out;
    }

    private int moltiplicazione() {
        int out = a * b;
        return out;
    }

    private String divisione() {
        String out;
        if (b == 0) {
            if (a == 0) {
                out = "indeterminato";
            } else {
                out = "impossibile";
            }
        } else {
            out = "" + a / b + " con resto " + a % b;
        }
        return out;
    }

    public String stampa() {
        String out="-------------------\n";
        out+= "a=" + a + " b=" + b + "\na+b=" + somma() 
           + "\na-b=" + sottrazione() + "\na*b=" + moltiplicazione() 
           + "\na:b=" + divisione();
        return out;
    }
}
