package mo.jinseop.gameoflife.index;

public final class TwoDimensionalIndex implements Index {

    private final int column;
    private final int row;

    public TwoDimensionalIndex(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    @Override
    public int getDepth() {
        return 2;
    }
}
