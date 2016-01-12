import java.util.HashMap;
import java.util.Vector;

/**
 * Created by Luke Parsons on 11/01/2016.
 */
public class Cube {
    private HashMap<Colour,Face> Faces;

    public Cube() {
        Faces = new HashMap<>();
        BuildCube();
    }


    private void BuildCube(){

        // Faces
        Face YellowFace = new Face(Colour.yellow);
        Faces.put(Colour.yellow, YellowFace);
        Face BlueFace = new Face(Colour.blue);
        Faces.put(Colour.blue, BlueFace);
        Face OrangeFace = new Face(Colour.orange);
        Faces.put(Colour.orange, OrangeFace);
        Face GreenFace = new Face(Colour.green);
        Faces.put(Colour.green, GreenFace);
        Face RedFace = new Face(Colour.red);
        Faces.put(Colour.red, RedFace);
        Face WhiteFace = new Face(Colour.White);
        Faces.put(Colour.White, WhiteFace);




        // Middle pieces
        Peace Middle = new Middle(new Square(Colour.yellow),YellowFace);
        YellowFace.addPeace(Middle,4);

        Middle = new Middle(new Square(Colour.blue),BlueFace);
        BlueFace.addPeace(Middle, 4);

        Middle = new Middle(new Square(Colour.orange),OrangeFace);
        OrangeFace.addPeace(Middle, 4);

        Middle = new Middle(new Square(Colour.green),GreenFace);
        GreenFace.addPeace(Middle, 4);

        Middle = new Middle(new Square(Colour.red),RedFace);
        RedFace.addPeace(Middle, 4);

        Middle = new Middle(new Square(Colour.White), WhiteFace);
        WhiteFace.addPeace(Middle, 4);


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
        OrangeFace.addPeace(five,7);

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


        // Layer 2
        Peace bOne = new Side(new Square(Colour.blue),BlueFace,new Square(Colour.red),RedFace);
        BlueFace.addPeace(bOne,3);
        RedFace.addPeace(bOne,5);

        Peace bTwo = new Side(new Square(Colour.blue),BlueFace,new Square(Colour.orange),OrangeFace);
        BlueFace.addPeace(bTwo,5);
        OrangeFace.addPeace(bTwo,3);


        Peace gOne = new Side(new Square(Colour.green),GreenFace,new Square(Colour.orange),OrangeFace);
        GreenFace.addPeace(gOne,3);
        OrangeFace.addPeace(gOne,5);

        Peace gTwo = new Side(new Square(Colour.green),GreenFace,new Square(Colour.red),RedFace);
        GreenFace.addPeace(gTwo,5);
        RedFace.addPeace(gTwo,3);


        // Layer 3
        Peace a = new Corner(new Square(Colour.White),WhiteFace,new Square(Colour.red),RedFace, new Square(Colour.green),GreenFace);
        WhiteFace.addPeace(a,0);
        RedFace.addPeace(a,0);
        GreenFace.addPeace(a,2);

        Peace b = new Side(new Square(Colour.White),WhiteFace,new Square(Colour.green),GreenFace);
        WhiteFace.addPeace(b,1);
        GreenFace.addPeace(b,1);

        Peace c = new Corner(new Square(Colour.White),WhiteFace,new Square(Colour.green),GreenFace,new Square(Colour.orange),OrangeFace);
        WhiteFace.addPeace(c,2);
        GreenFace.addPeace(c,0);
        OrangeFace.addPeace(c,2);

        Peace d = new Side(new Square(Colour.White),WhiteFace,new Square(Colour.red),RedFace);
        WhiteFace.addPeace(d,3);
        RedFace.addPeace(d,1);

        Peace e = new Side(new Square(Colour.White),WhiteFace,new Square(Colour.orange),OrangeFace);
        WhiteFace.addPeace(e,5);
        OrangeFace.addPeace(e,1);

        Peace f = new Corner(new Square(Colour.White),WhiteFace,new Square(Colour.red),RedFace,new Square(Colour.blue),BlueFace);
        WhiteFace.addPeace(f,6);
        RedFace.addPeace(f,2);
        BlueFace.addPeace(f,0);

        Peace g = new Side(new Square(Colour.White),WhiteFace,new Square(Colour.blue),BlueFace);
        WhiteFace.addPeace(g,7);
        BlueFace.addPeace(g,1);

        Peace h = new Corner(new Square(Colour.White),WhiteFace,new Square(Colour.orange),OrangeFace,new Square(Colour.blue),BlueFace);
        WhiteFace.addPeace(h,8);
        OrangeFace.addPeace(h,0);
        BlueFace.addPeace(h,2);
    }

    @Override
    public String toString() {
        String out = "";
        out += "-----------------\n"+Faces.get(Colour.White);
        out += "-----------------\n"+Faces.get(Colour.blue);
        out += "-----------------\n"+Faces.get(Colour.red);
        out += "-----------------\n"+Faces.get(Colour.orange);
        out += "-----------------\n"+Faces.get(Colour.green);
        out += "-----------------\n"+Faces.get(Colour.yellow);
         return out;
    }

}
