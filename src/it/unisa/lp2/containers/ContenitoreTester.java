package it.unisa.lp2.containers;

import it.unisa.lp2.containers.contenitore.Contenitore;
import it.unisa.lp2.containers.contenitore.ContenitoreCilindrico;
import it.unisa.lp2.containers.comparer.CodiceComparer;
import it.unisa.lp2.containers.comparer.NomeComparer;

public class ContenitoreTester {

    public static void main(String[] args) {
        NomeComparer m = new NomeComparer();
        CodiceComparer c = new CodiceComparer();
        DataSet ds = new DataSet(c); //o passare m per ordinare per nome
        ds.add(new ContenitoreCilindrico("one", 11, 2,3,4,5));
        ds.add(new ContenitoreCilindrico("another", 100, 2,3,4,5));
        ds.add(new ContenitoreCilindrico("A", 21, 2,3,4,5));
        ds.add(new ContenitoreCilindrico("ab", 40, 2,3,4,5));
        System.out.println(((Contenitore) ds.getMinimum()).getNome());
    }
}
