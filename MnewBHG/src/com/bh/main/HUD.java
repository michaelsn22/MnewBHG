package com.bh.main;

import java.awt.*;

public class HUD {

    public static int HEALTH = 100;
    public int greenVal = 255; //rgb value

    private int score = 0;
    private int level = 1;


    public void tick(){
        HEALTH=Game.clamp((int)HEALTH, 0,100);
        greenVal = Game.clamp(greenVal, 0, 255);

        greenVal = HEALTH*2;
        score++;

    }

    public void render(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(15,15,200,32);
        g.setColor(new Color(75, greenVal, 0));
        g.fillRect(15,15,HEALTH*2,32);
        g.setColor(Color.WHITE);
        g.drawRect(15,15,HEALTH*2,32);

        g.drawString("Score: " + score, 15, 64);
        g.drawString("Level: " + level, 15, 80);
        //g.drawString("Highscore: " + score2, 10, 80);
    }

    public void score(int score){
        this.score=score;
    }
    public int getScore(){
        return score;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

}
