import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("sounds/elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    public Elephant(){
        for(int i = 0; i<8;i++){
            idle[i]=new GreenfootImage("images/elephant_idle/idle"+i+".png");
            idle[i].scale(100,100);
        }
        setImage("images/elephant_idle/idle0.png");
    }
    int imageIndex=0;
    public void animateElephant(){
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex +1)%idle.length;
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
          move(-5);  
        }
        if(Greenfoot.isKeyDown("Right"))
        {
          move(5);  
        }    
        eat();
        animateElephant();
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
