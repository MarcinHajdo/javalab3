package agh.cs.lab2;
import java.util.ArrayList;
import java.util.List;
public class OptionParser {
    List<MoveDirection> parse(String args){
        String[] a=args.split(" ");
        int flag=0;
        List<MoveDirection> moves  = new ArrayList<MoveDirection>();
        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case "f", "forward" -> moves.add(MoveDirection.FORWARD);
                case "b", "backward" -> moves.add(MoveDirection.BACKWARD);
                case "r", "right" -> moves.add(MoveDirection.RIGHT);
                case "l", "left" -> moves.add(MoveDirection.LEFT);
                default ->{}
            }
        }
        return moves;
    }
}
