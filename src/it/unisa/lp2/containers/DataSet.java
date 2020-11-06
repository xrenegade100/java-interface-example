package it.unisa.lp2.containers;

import it.unisa.lp2.containers.comparer.IComparer;

public class DataSet {

    private IComparer aComparer;
    private Object minimum = null;

    public DataSet(IComparer aComparer) {
        this.aComparer = aComparer;
        this.minimum = null;
    }

    public void add(Object toAdd) {
        if (this.minimum == null) {
            this.minimum = toAdd;
        } else {
            if (this.aComparer.compare(this.minimum, toAdd) > 0) {
                this.minimum = toAdd;
            }
        }
    }

    public Object getMinimum() {
        return this.minimum;
    }
}
