import java.util.HashMap;
import java.util.Vector;

/**
 * Created by Luke Parsons on 11/01/2016.
 */
public class Peace {
    protected HashMap<Face,Square> mySquares = new HashMap<>();

    public Colour getColour(Face f){
        if(mySquares.get(f).getMyColour() == null){return Colour.Blank;}
        return mySquares.get(f).getMyColour();
    }

}

class Middle extends Peace{
    public Middle(Square a,Face f) {
        mySquares.put(f,a);
    }
}

class Side extends Peace{
    public Side(Square a,Face aa,Square b,Face bb) {
        mySquares.put(aa,a);
        mySquares.put(bb,b);
    }
}

class Corner extends Peace{
    public Corner(Square a,Face aa,Square b,Face bb,Square c,Face cc) {
        mySquares.put(aa,a);
        mySquares.put(bb,b);
        mySquares.put(cc,c);
    }
}