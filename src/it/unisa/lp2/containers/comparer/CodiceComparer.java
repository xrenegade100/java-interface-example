package it.unisa.lp2.containers.comparer;

import it.unisa.lp2.containers.contenitore.Contenitore;

public class CodiceComparer implements IComparer {

    @Override
    public int compare(Object a, Object b) {
        if (a instanceof Contenitore && b instanceof Contenitore) {
            Contenitore cont1 = (Contenitore) a;
            Contenitore cont2 = (Contenitore) b;
            return Integer.compare(cont1.getCodice(), cont2.getCodice());
        }
        return 0;
    }
}
