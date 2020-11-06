package it.unisa.lp2.containers.comparer;

import it.unisa.lp2.containers.contenitore.Contenitore;

public class NomeComparer implements IComparer {

    @Override
    public int compare(Object a, Object b) {
        if (a instanceof Contenitore && b instanceof Contenitore) {
            Contenitore cont1 = (Contenitore) a;
            Contenitore cont2 = (Contenitore) b;
            return cont1.getNome().compareToIgnoreCase(cont2.getNome());
        }
        /*return a.compareTo(b);*/ //se a < b negativo, se a == b 0, se a > b positivo
        return 0;
    }
}
