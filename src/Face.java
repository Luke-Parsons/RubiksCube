import java.util.HashMap;
import java.util.Vector;

/**
 * Created by Luke Parsons on 11/01/2016.
 */
public class Face {
    Colour MyColour;
    HashMap<Integer, Peace> MyPeaces;

    public Face(Colour myColour) {
        MyColour = myColour;
        MyPeaces = new HashMap<>();
    }

    public void addPeace(Peace p, int Position) {
        MyPeaces.put(Position, p);
    }

    public void Clockwise() {
    }

    public void AntiClockwise() {
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < 10; i++) {

            if(i%3==0&&i!=0){out+="\n";}

            if(MyPeaces.containsKey(i)){
            Peace p = MyPeaces.get(i);
            out += "|" + p.getColour(this);
            }
        }
        return out;
    }


    public static void main(String[] args) {

        Cube C = new Cube();


        System.out.println(C);

    }


}