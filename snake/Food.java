package snake;

import java.util.Random;

import static snake.Game.SCREEN_HEIGHT;
import static snake.Game.SCREEN_WIDTH;

public class Food {
    private Position position;

    private Food(Position position) {
        this.position = position;
    }

    public static Food generateFood(){
        var r = new Random();
        var positionX = r.nextInt(SCREEN_WIDTH - 2) + 1;
        var positionY = r.nextInt(SCREEN_HEIGHT - 2) + 1;

        var position = new Position(positionX, positionY);

        return new Food(position);
    }
}
