package snake;

import java.util.List;

public class Body {
    private Position position;
    private boolean isHead;
    private int id;

    public Body(Position position, boolean isHead, int id) {
        this.position = position;
        this.isHead = isHead;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Body createFrom(Body body){
        var newPosition = new Position(body.getPositionX()-1, body.getPositionY());
        return new Body(newPosition, false, body.getId() +1);

    }

    public Position getPosition() {
        return position;
    }

    public int getPositionX() {
        return position.getX();
    }
    public int getPositionY() {
        return position.getY();
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isHead() {
        return isHead;
    }

    public void setHead(boolean head) {
        isHead = head;
    }
}
