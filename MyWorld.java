import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300,350);
        Label scoreLable = new Label(0,80);
        addObject(scoreLable,50,50);
        createApple();

    }
    
    public void createApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple,x,0);
    }
}
