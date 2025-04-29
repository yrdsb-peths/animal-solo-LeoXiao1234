import greenfoot.*;

public class MyWorld extends World {
    Label scoreLabel;
    public int score = 0;
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300,350);
        scoreLabel = new Label(0,80);
        addObject(scoreLabel,50,50);
        createApple();

    }
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
    public void createApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple,x,0);
    }
}
