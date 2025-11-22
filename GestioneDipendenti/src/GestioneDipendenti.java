import java.util.ArrayList;
import java.util.List;

// Classe per gestire una collezione di dipendenti
public class GestioneDipendenti<T extends Dipendente> {

    // Lista interna per memorizzare i dipendenti
    private final List<T> dipendenti;

    // Costruttore: inizializza la lista dei dipendenti
    public GestioneDipendenti() {
        dipendenti = new ArrayList<>(); // crea una nuova ArrayList vuota
    }

    // Metodo per aggiungere un dipendente alla lista
    public void aggiungiDipendente(T dipendente) throws DipendenteException {

        // Controllo: non si possono aggiungere dipendenti null
        if (dipendente == null) {
            throw new DipendenteException("Dipendente nullo non può essere aggiunto");
        }

        // Aggiunge il dipendente alla lista
        dipendenti.add(dipendente);
    }

    // Metodo per stampare tutti i dipendenti usando info()
    public void stampaTutti() {

        // Ciclo su tutti i dipendenti nella lista
        for (T d : dipendenti) {

            // Stampa le informazioni di ciascun dipendente
            d.info();
        }
    }

    // Metodo per trovare tutti i dipendenti con stipendio maggiore di un certo valore
    public List<T> trovaDipendentiConStipendioMaggioreDi(double soglia) {

        // Lista temporanea per memorizzare i risultati
        List<T> risultati = new ArrayList<>();

        // Ciclo su tutti i dipendenti
        for (T d : dipendenti) {

            // Se lo stipendio supera la soglia, aggiungi alla lista dei risultati
            if (d.getStipendio() > soglia) {
                risultati.add(d);
            }
        }

        // Restituisce la lista dei dipendenti filtrati
        return risultati;
    }
}
