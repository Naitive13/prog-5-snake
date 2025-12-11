package snake;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private int size;
    private Direction direction;
    private List<Body> body;

    private Snake(int size, Direction direction, List<Body> body) {
        this.size = size;
        this.direction = direction;
        this.body = body;
    }

    public static Snake createSnake(){
        var head = new Body(new Position(10,10), true, 1);
        var firstBody = Body.createFrom(head);
        var secondBody = Body.createFrom(firstBody);
        var body = List.of(head, firstBody, secondBody);
        return new Snake(body.size(), Direction.RIGHT, new ArrayList<>(body));
    }

    public void move(){
        switch (this.direction){
            case UP -> this.body.forEach(element -> element.setPosition(new Position(element.getPositionY() + 1, element.getPositionX())) );
            case DOWN -> this.body.forEach(element -> element.setPosition(new Position(element.getPositionY() - 1, element.getPositionX())) );
            case LEFT -> this.body.forEach(element -> element.setPosition(new Position(element.getPositionY() , element.getPositionX() -1)) );
            case RIGHT -> this.body.forEach(element -> element.setPosition(new Position(element.getPositionY() , element.getPositionX() +1)) );
        }
    }

    public void updateDirection(char key){
        switch (key){
            case 'd' -> this.direction = Direction.RIGHT;
            case 'a' -> this.direction = Direction.LEFT;
            case 'w' -> this.direction = Direction.UP;
            case 's' -> this.direction = Direction.DOWN;
        }
    }

}
