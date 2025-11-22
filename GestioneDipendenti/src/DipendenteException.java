import java.io.Serial;

// Classe per rappresentare eccezioni specifiche dei dipendenti
public class DipendenteException extends Exception {

    // serialVersionUID per compatibilità della serializzazione
    @Serial
    private static final long serialVersionUID = 1L;

    // Costruttore parametrizzato che richiede un messaggio
    public DipendenteException(String message) {

        // Chiamata al costruttore della superclasse Exception
        super(message);
    }
}
