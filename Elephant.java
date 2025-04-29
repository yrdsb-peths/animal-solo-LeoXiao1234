import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void image()
    {
        setImage("images/elephant.png");
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
          move(-1);  
        }
        if(Greenfoot.isKeyDown("Right"))
        {
          move(1);  
        }        
    }
}
