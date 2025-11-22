import com.github.javafaker.Faker;

// Classe principale con il metodo main per eseguire il programma
// Metodo main: punto di ingresso del programma
void main() {

    // Crea un oggetto GestioneDipendenti per gestire tutti i dipendenti
    GestioneDipendenti<Dipendente> gestione = new GestioneDipendenti<>();

    // Crea un oggetto Faker per generare nomi casuali in lingua italiana
    Faker faker = new Faker(Locale.ITALIAN);

    // Ciclo per creare 5 Manager e 5 Sviluppatori
    for (int i = 0; i < 5; i++) {

        // Creazione di un Manager con valori casuali
        Manager m = new Manager(
                faker.name().firstName(),                         // nome casuale
                faker.name().lastName(),                          // cognome casuale
                (int) (30 + Math.random() * (60 - 30)),          // età casuale tra 30 e 60
                2500 + Math.random() * (5000 - 2500),            // stipendio casuale tra 2500 e 5000
                (int) (5 + Math.random() * (20 - 5))            // teamSize casuale tra 5 e 20
        );

        // Creazione di uno Sviluppatore con valori casuali
        Sviluppatore s = new Sviluppatore(
                faker.name().firstName(),                         // nome casuale
                faker.name().lastName(),                          // cognome casuale
                (int) (22 + Math.random() * (40 - 22)),          // età casuale tra 22 e 40
                1500 + Math.random() * (3500 - 1500),            // stipendio casuale tra 1500 e 3500
                "Java"                                           // linguaggio preferito
        );

        // Uso di try/catch per gestire eventuali eccezioni
        try {
            gestione.aggiungiDipendente(m); // aggiunge il manager
            gestione.aggiungiDipendente(s); // aggiunge lo sviluppatore
        } catch (DipendenteException e) {
            // Stampa messaggio di errore se il dipendente è nullo
            IO.println("Errore: " + e.getMessage());
        }
    }

    // Stampa di tutti i dipendenti usando info()
    IO.println("=== Tutti i dipendenti ===");
    for (Dipendente d : gestione.trovaDipendentiConStipendioMaggioreDi(0)) {
        d.info(); // stampa le informazioni del dipendente
    }

    // Calcolo e stampa del bonus per dipendenti con stipendio > 3000
    IO.println("\n=== Bonus per stipendi > 3000 ===");
    for (Dipendente d : gestione.trovaDipendentiConStipendioMaggioreDi(3000)) {
        // Stampa bonus formattato a 2 decimali
        System.out.printf("%s %s - Bonus: %.2f%n",
                d.getNome(), d.getCognome(), d.calcolaBonus());
    }

    // Esempio di array e classi wrapper
    IO.println("\n=== Esempio array e wrapper ===");
    Integer[] arrayNumeri = {1, 2, 3, 4, 5}; // array di numeri interi
    for (Integer num : arrayNumeri) {
        // Stampa il quadrato di ogni numero
        IO.println("Quadrato di " + num + " = " + (num * num));
    }
}
