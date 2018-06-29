package mo.jinseop.gameoflife.cell;

public interface Cell {

    boolean isAlive();

    void setAlive(boolean isAlive);

    int getNeighborsAliveCount();

    void onNeighborStateChange(boolean isAlive);

    void onNeighborStateChangeNextTick(boolean isAlive);

    void onNextTick();
}
