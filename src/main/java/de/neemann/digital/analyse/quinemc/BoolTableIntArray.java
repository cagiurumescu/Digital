package de.neemann.digital.analyse.quinemc;


/**
 * A int array.
 * Zero and one behave as expected, any other value represents "don't care"
 *
 * @author hneemann
 */
public class BoolTableIntArray implements BoolTable {

    private final int[] table;

    /**
     * Creates a new instance
     *
     * @param rows the number of rows
     */
    public BoolTableIntArray(int rows) {
        this(new int[rows]);
    }

    /**
     * Creates a new instance
     *
     * @param table the int values
     */
    public BoolTableIntArray(int[] table) {
        this.table = table;
    }

    @Override
    public int size() {
        return table.length;
    }

    @Override
    public ThreeStateValue get(int i) {
        return ThreeStateValue.value(table[i]);
    }
}
