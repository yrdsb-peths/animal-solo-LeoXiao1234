import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
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
        eat();
    }
    
    public void eat(){
        if (isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
