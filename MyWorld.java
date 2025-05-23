import greenfoot.*;

public class MyWorld extends World {
    
    Label scoreLabel;
    public int score = 0;
    int level = 0;
    public MyWorld() {
        super(600, 400, 1, false);
        setBackground ("images/background.jpg");
        Elephant elephant = new Elephant();
        addObject(elephant, 300,350);
        scoreLabel = new Label(0,80);
        addObject(scoreLabel,50,50);
        createApple();

    }
    public void gameOver(){
        Label gameOver = new Label("Game Over", 100);
        addObject(gameOver,300,200);
    }
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
        
        if (score%5==0){
            level +=1;
        }
    }
    public void createApple(){
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        addObject(apple,x,0);
    }
}
