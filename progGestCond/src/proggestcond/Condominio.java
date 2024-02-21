package proggestcond;

public class Condominio {
    private String via,nCivico;
    private Appartamento[] appartamenti;

    public Condominio(String via, String nCivico, Appartamento[] appartamenti) {
        this.via = via;
        this.nCivico = nCivico;
        this.appartamenti = new Appartamento[appartamenti.length];
        for(int i=0;i<appartamenti.length;i++){
            this.appartamenti[i] = new Appartamento(appartamenti[i].getNome(),appartamenti[i].getCognome(),appartamenti[i].getnApp());
        }
    }

    public Appartamento[] getAppartamenti() {
        return appartamenti;
    }

    public String getVia() {
        return via;
    }

    public String getnCivico() {
        return nCivico;
    }
    
    @Override
    public String toString(){
        String out="-----------------------------------\n"
                + "Condominio in Via "+via+" n."+nCivico+"\n";
        out+="\nResidenti:\n";
        for(int i=0;i<appartamenti.length;i++){
            out+=appartamenti[i].toString()+"\n";
        }
        return out;
    }
    
    
}
