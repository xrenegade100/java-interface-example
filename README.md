# Java Interface Example

Questo esempio utilizza una classe DataSet che gestisce oggetti 
tramite l'interfaccia `IComparer`, e resituisce il minimo tra gli oggetti relativamente
al modo in cui il comparatore che le è stato passato decide di comparare 2 oggetti.

## TODO
- [ ] Migliorare `IComparer` con generiche `<T>`
    - [ ] Rimuovere cast da `Object` a `Contenitore`
- [ ] Utilizzare DataSet con generiche `<T>`
    - [ ] Rimuovere restituzione dell'oggetto minimo come `Object` e resituirlo come `<T>`
    - [ ] Aggiungere un metodo per ottenere l'oggetto massimo (sempre definito dal comparatore)
- [ ] **Eventualmente** tenere traccia di tutti gli elementi inseriti tramite `add`
