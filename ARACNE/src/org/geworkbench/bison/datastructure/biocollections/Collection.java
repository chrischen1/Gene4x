package org.geworkbench.bison.datastructure.biocollections;

import java.util.ArrayList;

/**
 * <p>Title: Bioworks</p>
 * <p/>
 * <p>Description: Modular Application Framework for Gene Expession, Sequence and Genotype Analysis</p>
 * <p/>
 * <p>Copyright: Copyright (c) 2003 -2004</p>
 * <p/>
 * <p>Company: Columbia University</p>
 *
 * @author not attributable
 * @version 1.0
 *
 * @todo - watkin - This is redundant. Developers should just use ArrayList<T> instead.
 */
public class Collection <T> extends ArrayList<T> implements DSCollection<T> {
    public Collection() {
    }
}
