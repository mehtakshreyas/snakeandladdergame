package dto;

import java.util.ArrayList;
import java.util.List;

public class SnakeAndLadderBoard {
    private int size;
    private List<Snake> snakes;
    public SnakeAndLadderBoard(int size) {
        this.size = size;
        this.snakes = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }
}
