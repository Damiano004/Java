package proggestcond;

public class GestioneAppartamento {
    private String sede,titolare;
    private Condominio[] condomini;

    public GestioneAppartamento(String sede, String titolare, Condominio[] condomini) {
        this.sede = sede;
        this.titolare = titolare;
        this.condomini = new Condominio[condomini.length];
        for(int i=0;i<condomini.length;i++){
            this.condomini[i] = new Condominio(condomini[i].getVia(), condomini[i].getnCivico(), condomini[i].getAppartamenti());
        }
    }

    public String getSede() {
        return sede;
    }

    public String getTitolare() {
        return titolare;
    }
    
    @Override
    public String toString(){
        String out="Sede centrale: "+sede+"\nTitolare gestione: "+titolare+"\n\nCondomini:\n";
        for(int i=0;i<condomini.length;i++){
            out+=condomini[i].toString();
        }
        return out;
    }
    
    
}
