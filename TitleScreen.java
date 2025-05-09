import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void act(){
        if (Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,422,142);
        elephant.setLocation(432,110);
        elephant.setLocation(537,105);
        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label,252,201);
        label.setLocation(333,207);
        label.setLocation(298,204);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,294,267);
        label2.setLocation(353,261);
        label2.setLocation(295,273);
        Label label3 = new Label("The Elephant", 80);
        addObject(label3,208,105);
        label3.setLocation(293,117);
        label3.setLocation(246,108);
    }
}
