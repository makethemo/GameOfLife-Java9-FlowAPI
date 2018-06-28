package mo.jinseop.gameoflife.grid;

import mo.jinseop.gameoflife.cell.Cell;
import mo.jinseop.gameoflife.index.Index;

public interface Grid<C extends Cell, I extends Index> {

    C getCell(I index);

    I getIndex(C cell);

    I getSize();
}

