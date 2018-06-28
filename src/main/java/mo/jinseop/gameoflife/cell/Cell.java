package mo.jinseop.gameoflife.cell;

public interface Cell {

    boolean isAlive();

    void setAlive(boolean isAlive);

    int getNumberOfNeighborsAlive();

    void onNeighborStateChange(boolean isAlive, boolean isNextTick);

    void onNextTick();
}
