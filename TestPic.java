import java.io.File;
import java.io.IOException;

public class TestPic
{
    public static void main(String[] args)
    {
        // Get a reference to the canvas for this drawing and set its title.
        Canvas pic = Canvas.getCanvas();
        pic.setTitle("Shapes Constructor Test Picture");
        
        
        // Draws the background of the picture
        Rect sky = new Rect(800, 600, 0, 0, 23, 0, 83);
        sky.makeVisible();
        Rect ground = new Rect(800, 300, 0, 450, 0, 0, 0);
        ground.makeVisible();
        
        //Draws moon and stars
        pic.Stars();
        Arc moon = new Arc(150, 75, 40, 100, 220, 243, 243, 243);
        moon.makeVisible();
        
        //Calls other elements of the picture from Canvas class
        pic.Buildings();
        pic.Roofs();
        

        // Save the picture to a file
        String filename = "testpic.png";
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}