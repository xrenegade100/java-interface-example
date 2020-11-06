package it.unisa.lp2.containers.contenitore;

public abstract class Contenitore implements Cloneable {

    private String nome;
    private int codice;
    private double prezzo;
    private double capienza;

    public Contenitore(String nome, int codice, double prezzo, double capienza) {
        this.nome = nome;
        this.codice = codice;
        this.prezzo = prezzo;
        this.capienza = capienza;
    }

    public String getNome() {
        return nome;
    }

    public int getCodice() {
        return codice;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getCapienza() {
        return capienza;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setCapienza(double capienza) {
        this.capienza = capienza;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "nome='" + nome + '\'' +
                ", codice=" + codice +
                ", prezzo=" + prezzo +
                ", capienza=" + capienza +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Contenitore that = (Contenitore) o;

        if (this.codice != that.codice) return false;
        if (Double.compare(that.prezzo, this.prezzo) != 0) return false;
        if (Double.compare(that.capienza, this.capienza) != 0) return false;
        return this.nome.equals(that.nome);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
