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

        // Faces
        Face YellowFace = new Face(Colour.yellow);
        Face BlueFace = new Face(Colour.blue);
        Face OrangeFace = new Face(Colour.orange);
        Face GreenFace = new Face(Colour.green);
        Face RedFace = new Face(Colour.red);
        Face WhiteFace = new Face(Colour.White);



        // Middle pieces
        Peace Middle = new Middle(new Square(Colour.yellow),YellowFace);
        YellowFace.addPeace(Middle,4);

        Middle = new Middle(new Square(Colour.blue),BlueFace);
        BlueFace.addPeace(Middle, 4);

        Middle = new Middle(new Square(Colour.orange),OrangeFace);
        OrangeFace.addPeace(Middle,4);

        Middle = new Middle(new Square(Colour.green),GreenFace);
        GreenFace.addPeace(Middle,4);

        Middle = new Middle(new Square(Colour.red),RedFace);
        RedFace.addPeace(Middle,4);

        Middle = new Middle(new Square(Colour.White), WhiteFace);
        WhiteFace.addPeace(Middle,4);


        // Layer 1

        Peace zero = new Corner(new Square(Colour.yellow),YellowFace, new Square(Colour.blue),BlueFace,new Square(Colour.red),RedFace);
        YellowFace.addPeace(zero,0);
        BlueFace.addPeace(zero,6);
        RedFace.addPeace(zero,8);

        Peace one = new Side(new Square(Colour.yellow),YellowFace,new Square(Colour.blue),BlueFace);
        YellowFace.addPeace(one,1);
        BlueFace.addPeace(one,7);

        Peace two = new Corner(new Square(Colour.yellow),YellowFace, new Square(Colour.blue),BlueFace,new Square(Colour.orange),OrangeFace);
        YellowFace.addPeace(two,2);
        BlueFace.addPeace(two,8);
        OrangeFace.addPeace(two,6);

        Peace three = new Side(new Square(Colour.yellow),YellowFace, new Square(Colour.red),RedFace);
        YellowFace.addPeace(three,3);
        RedFace.addPeace(three,7);

        Peace five = new Side(new Square(Colour.yellow),YellowFace,new Square(Colour.orange),OrangeFace);
        YellowFace.addPeace(five,5);
        OrangeFace.addPeace(five,6);

        Peace six = new Corner(new Square(Colour.yellow),YellowFace, new Square(Colour.red),RedFace,new Square(Colour.green),GreenFace);
        YellowFace.addPeace(six,6);
        RedFace.addPeace(six,6);
        GreenFace.addPeace(six,8);

        Peace seven = new Side(new Square(Colour.yellow),YellowFace,new Square(Colour.green),GreenFace);
        YellowFace.addPeace(seven,7);
        GreenFace.addPeace(seven,7);

        Peace eight = new Corner(new Square(Colour.yellow),YellowFace,new Square(Colour.orange),OrangeFace,new Square(Colour.green),GreenFace);
        YellowFace.addPeace(eight,8);
        OrangeFace.addPeace(eight,8);
        GreenFace.addPeace(eight,6);

        System.out.println(OrangeFace);

    }


}