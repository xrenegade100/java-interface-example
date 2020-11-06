package it.unisa.lp2.containers.contenitore;

public class ContenitoreCilindrico extends Contenitore {

    private double raggio;
    private double altezza;

    public static void main(String[] args) {
        ContenitoreCilindrico c = new ContenitoreCilindrico("C1", 1, 100, 1000, 5, 10);
        ContenitoreCilindrico c2 = (ContenitoreCilindrico) c.clone();
        System.out.println(c);
    }

    public ContenitoreCilindrico(String nome, int codice, double prezzo, double capienza, double raggio, double altezza) {
        super(nome, codice, prezzo, capienza);
        this.raggio = raggio;
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        String parent = super.toString();
        String result = parent.substring(0, parent.indexOf('}'));
        result += ", raggio=" + raggio + ", altezza=" + altezza + "}";
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            if (this == o) return true;
            else if (getClass() == o.getClass()) {
                ContenitoreCilindrico that = (ContenitoreCilindrico) o;
                if (Double.compare(this.raggio, that.raggio) != 0) return false;
                return Double.compare(this.altezza, that.altezza) == 0;
            }
            return false;
        }
        return false;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            // Non succede mai
            return null;
        }
    }
}
