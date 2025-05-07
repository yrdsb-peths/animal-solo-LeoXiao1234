import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("sounds/elephantcub.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    String faceing = "Right";
    public Elephant(){
        for(int i = 0; i<8;i++){
            idleRight[i]=new GreenfootImage("images/elephant_idle/idle"+i+".png");
            idleRight[i].scale(100,100);
        }

        for(int i = 0; i<8;i++){
            idleLeft[i]=new GreenfootImage("images/elephant_idle/idle"+i+".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100,100);
        }
        setImage("images/elephant_idle/idle0.png");
    }
    int imageIndex=0;
    public void animateElephant(){
        if (faceing.equals("Right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex +1)%idleRight.length;
        }
        else{
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex +1)%idleRight.length;
        }
        
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
          move(-5);  
          faceing="Left";
        }
        if(Greenfoot.isKeyDown("Right"))
        {
          move(5); 
          faceing="Right";
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
