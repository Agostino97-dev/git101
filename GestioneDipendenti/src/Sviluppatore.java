// Classe Sviluppatore che estende Dipendente
public class Sviluppatore extends Dipendente {

    // Attributo linguaggioPreferito: linguaggio di programmazione principale
    private final String linguaggioPreferito;

    // Costruttore parametrizzato
    public Sviluppatore(String nome, String cognome, int eta, double stipendio, String linguaggioPreferito) {

        // Chiamata al costruttore della superclasse Dipendente
        super(nome, cognome, eta, stipendio);

        // Assegna il linguaggio preferito
        this.linguaggioPreferito = linguaggioPreferito;
    }

    // Getter per linguaggioPreferito
    public String getLinguaggioPreferito() {

        // Restituisce il linguaggio preferito
        return linguaggioPreferito;
    }

    // Override del metodo astratto calcolaBonus
    @Override
    public double calcolaBonus() {

        // Calcola il bonus come 10% dello stipendio base
        return getStipendio() * 0.1;
    }

    // Override del metodo info
    @Override
    public void info() {

        // Stampa informazioni dello sviluppatore con stipendio e bonus formattati a 2 decimali
        System.out.printf("Sviluppatore: %s %s, età: %d, stipendio: %.2f, linguaggioPreferito: %s%n",
                getNome(), getCognome(), getEta(), getStipendio(), linguaggioPreferito);
    }

    // Override del metodo toString
    @Override
    public String toString() {

        // Restituisce stringa rappresentativa dello sviluppatore
        return String.format("%s %s, età: %d, stipendio: %.2f, linguaggioPreferito: %s",
                getNome(), getCognome(), getEta(), getStipendio(), linguaggioPreferito);
    }
}
