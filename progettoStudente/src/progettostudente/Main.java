package progettostudente;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Damiano", "Purin", "19",'M');
        Studente s1 = new Studente("0013", "Progettazione reti e cloud computing", 
                p1.getNome(), p1.getCognome(), p1.getEta(),p1.getSesso());
        Persona p2 = new Persona("Maria", "Rossi", "29", 'F');
        Lavoratore l1 = new Lavoratore("sarta", "Trento",
                p2.getNome(), p2.getCognome(), p2.getEta(), p2.getSesso());
        System.out.println(s1.toString()+"\n-----------------------");
        System.out.println(l1.toString()+"\n-----------------------");
    }
    
}
