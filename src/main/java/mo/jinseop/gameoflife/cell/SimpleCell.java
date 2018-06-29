package mo.jinseop.gameoflife.cell;

public class SimpleCell implements Cell {

    private boolean isAlive;
    private int neighborsAliveCount;
    private int neighborsAliveNextTickCount;

    @Override
    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public int getNeighborsAliveCount() {
        return neighborsAliveCount;
    }

    @Override
    public void onNeighborStateChange(boolean isAlive) {
        neighborsAliveCount = isAlive
                ? neighborsAliveCount + 1
                : neighborsAliveCount - 1;
    }

    @Override
    public void onNeighborStateChangeNextTick(boolean isAlive) {
        neighborsAliveNextTickCount = isAlive
                ? neighborsAliveNextTickCount + 1
                : neighborsAliveNextTickCount - 1;
    }

    @Override
    public void onNextTick() {
        // TODO impl.
    }
}
