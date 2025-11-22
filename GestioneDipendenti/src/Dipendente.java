import java.util.Objects;

// Classe astratta che rappresenta un dipendente generico
public abstract class Dipendente {

    // Attributo nome, non modificabile dopo l'inizializzazione
    private final String nome;

    // Attributo cognome, non modificabile dopo l'inizializzazione
    private final String cognome;

    // Attributo età, non modificabile dopo l'inizializzazione
    private final int eta;

    // Attributo stipendio, non modificabile dopo l'inizializzazione
    private final double stipendio;

    // Costruttore parametrizzato per inizializzare tutti gli attributi
    public Dipendente(String nome, String cognome, int eta, double stipendio) {

        // Assegna il valore del nome
        this.nome = nome;

        // Assegna il valore del cognome
        this.cognome = cognome;

        // Assegna il valore dell'età
        this.eta = eta;

        // Assegna il valore dello stipendio
        this.stipendio = stipendio;
    }

    // Metodo astratto da implementare nelle sottoclassi per calcolare il bonus
    public abstract double calcolaBonus();

    // Getter per il nome
    public String getNome() {

        // Restituisce il nome del dipendente
        return nome;
    }

    // Getter per il cognome
    public String getCognome() {

        // Restituisce il cognome del dipendente
        return cognome;
    }

    // Getter per l'età
    public int getEta() {

        // Restituisce l'età del dipendente
        return eta;
    }

    // Getter per lo stipendio
    public double getStipendio() {

        // Restituisce lo stipendio del dipendente
        return stipendio;
    }

    // Override di equals per confrontare oggetti Dipendente
    @Override
    public boolean equals(Object o) {

        // Se è lo stesso riferimento, sono uguali
        if (this == o) return true;

        // Se l'oggetto non è un Dipendente, non sono uguali
        if (!(o instanceof Dipendente that)) return false;

        // Confronta nome, cognome ed età
        return eta == that.eta
                && Objects.equals(nome, that.nome)
                && Objects.equals(cognome, that.cognome);
    }

    // Override di hashCode coerente con equals
    @Override
    public int hashCode() {

        // Restituisce hash basato su nome, cognome ed età
        return Objects.hash(nome, cognome, eta);
    }

    // Metodo per stampare le informazioni del dipendente
    public void info() {

        // Stampa nome, cognome, età e stipendio formattato a 2 decimali
        System.out.printf("Dipendente: %s %s, età: %d, stipendio: %.2f%n",
                nome, cognome, eta, stipendio);
    }

    // Override di toString per rappresentazione testuale del dipendente
    @Override
    public String toString() {

        // Restituisce stringa con nome, cognome, età e stipendio formattato
        return String.format("%s %s, età: %d, stipendio: %.2f",
                nome, cognome, eta, stipendio);
    }
}
