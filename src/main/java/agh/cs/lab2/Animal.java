package agh.cs.lab2;

public class Animal {
    private MapDirection orientation = MapDirection.NORTH;
    private Vector2d position = new Vector2d(2,2);
    public MapDirection getOrientation() {
        return orientation;
    }
    public Vector2d getPosition() {
        return position;
    }
    private Vector2d border(Vector2d p){
        if (p.getY()>4)
        {
           p= p.subtract(new Vector2d(0,5));
        }
       if (p.getX()>4)
       {
           p= p.subtract(new Vector2d(5,0));
       }
       if (p.getY()<0)
       {
           p= p.add(new Vector2d(0,5));
       }
       if (p.getX()<0)
       {
           p= p.add(new Vector2d(5,0));
       }
           return p;
    }
    public void move(MoveDirection direction){
        switch(direction) {
            case RIGHT:
                orientation=orientation.next();
                break;
            case LEFT:
                orientation=orientation.previous();
                break;
            case FORWARD:
                position=border(position.add(orientation.toUnitVector()));
                break;
            case BACKWARD:
                position=border(position.subtract(orientation.toUnitVector()));
                break;
        }

    }
    @Override
    public String toString() {
        return "Animal{" +
                "orientation=" + orientation +
                ", position=" + position +
                '}';
    }
}
