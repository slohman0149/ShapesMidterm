
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Sydney Lohman)
 * @version: (1/7/21)
 * 
 */
import java.io.File;
import java.io.IOException;

public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("white");

        // Draws the background of the picture
        Rect sky = new Rect(800, 600, 0, 0, 23, 0, 83);
        sky.makeVisible();
        Rect ground = new Rect(800, 300, 0, 450, 16, 16, 16);
        ground.makeVisible();
        
        //Draws moon and stars
        pic.Stars();
        Arc moon = new Arc(150, 75, 40, 100, 220, 243, 243, 243);
        moon.makeVisible();
        
        //Calls other elements of the picture from Canvas class
        pic.Buildings();
        pic.Roofs();
        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        
        
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "MyPicture.png";
        }

        // Save the picture to a file
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}