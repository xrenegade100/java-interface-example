package it.unisa.lp2.containers.contenitore;

public class ContenitoreCubico extends Contenitore {
    private double lato;

    public ContenitoreCubico(String nome, int codice, double prezzo, double capienza, double lato) {
        super(nome, codice, prezzo, capienza);
        this.lato = lato;
    }

    @Override
    public String toString() {
        String parent = super.toString();
        String result = parent.substring(0, parent.indexOf('}'));
        result += ", lato=" + lato + "}";
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            if (this == o) return true;
            else if (getClass() == o.getClass()) {
                ContenitoreCubico that = (ContenitoreCubico) o;
                return Double.compare(this.lato, that.lato) == 0;
            }
        }
        return false;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
