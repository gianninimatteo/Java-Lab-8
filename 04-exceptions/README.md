# Area di prova delle eccezioni

### Verifica della correttezza degli argomenti e generazione di RuntimeException

All’interno del costruttore `ServiceBehindUnstableNetwork(double, int)`,
aggiungi una verifica che la probabilità sia compresa tra 0 (incluso) e 1 (escluso).
Se la verifica fallisce, deve generare un’`IllegalArgumentException` con un messaggio appropriato.

### Gestire le eccezioni esistenti

Implementare i metodi `UseArithmeticService.retrySendOnNetworkError`
e `UseArithmeticService.retryReceiveOnNetworkError`
come descritto nel codice sorgente.

### Progettare nuove eccezioni

Creare una classe `NetworkException che estende IOException` con due costruttori.
Il costruttore 0-ario deve creare un’eccezione il cui messaggio sia “Errore di rete: nessuna risposta”.
Il costruttore 1-ario deve accettare una stringa come input e generare il messaggio “Errore di rete durante l’invio del messaggio: <messaggio>”

Modificare `ServiceBehindUnstableNetwork.accessTheNetwork()`
in modo tale che generi la nuova eccezione.
Si noti che i blocchi che in precedenza intercettavano `IOException` continuano a funzionare.

### Verificare la correttezza degli argomenti e preservare lo stack trace in caso di re-lancio

Modificare `ServiceBehindUnstableNetwork.sendData` in modo tale che,
anziché stampare, generi un’`IllegalArgumentException` con lo stesso messaggio.

**Nota:** l’eccezione appena generata deve *conservare* lo stack trace della
`NumberFormatException` originale (che deve essere impostata come causa dell’eccezione).

### Utilizzare le eccezioni per segnalare uno stato anomalo

Rimuovere tutti i `println` da `ArithmeticService`: quando il sistema entra in uno stato incoerente,
deve essere generata un’`IllegalStateException` con lo stesso messaggio della stampa.
Ricordarsi di preservare lo stack trace delle eccezioni all’origine, se presenti.

### Utilizzare `finally` per eseguire calcoli anche dopo il `return`

Modificare `ArithmeticService.process()`:
in ogni caso, una volta che il flusso di controllo esce dal metodo,
deve essere eseguito `commandQueue.clear()`.

Suggerimento: utilizzare `finally` in modo appropriato.