// Classe Manager che estende Dipendente
public class Manager extends Dipendente {

    // Attributo teamSize: numero di persone nel team
    private final int teamSize;

    // Costruttore parametrizzato
    public Manager(String nome, String cognome, int eta, double stipendio, int teamSize) {

        // Chiamata al costruttore della superclasse Dipendente
        super(nome, cognome, eta, stipendio);

        // Assegna il valore del teamSize
        this.teamSize = teamSize;
    }

    // Getter per teamSize
    public int getTeamSize() {

        // Restituisce il numero di persone nel team
        return teamSize;
    }

    // Override del metodo astratto calcolaBonus
    @Override
    public double calcolaBonus() {

        // Calcola il bonus come 20% dello stipendio più 50 euro per ogni membro del team
        return getStipendio() * 0.2 + teamSize * 50;
    }

    // Override del metodo info
    @Override
    public void info() {

        // Stampa informazioni del manager con stipendio e bonus formattati a 2 decimali
        System.out.printf("Manager: %s %s, età: %d, stipendio: %.2f, teamSize: %d%n",
                getNome(), getCognome(), getEta(), getStipendio(), teamSize);
    }

    // Override del metodo toString
    @Override
    public String toString() {

        // Restituisce stringa rappresentativa del manager
        return String.format("%s %s, età: %d, stipendio: %.2f, teamSize: %d",
                getNome(), getCognome(), getEta(), getStipendio(), teamSize);
    }
}
