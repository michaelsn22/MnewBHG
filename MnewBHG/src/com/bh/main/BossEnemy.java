package com.bh.main;

import java.awt.*;

public class BossEnemy extends GameObject{

    private Handler handler;
    private int timer=80;
    private int timer2=50;

    public BossEnemy(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler=handler;
        velX=0;
        velY=2;

    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,96, 96);
    }

    @Override
    public void tick() {
        x+=velX;
        y+=velY;
        if (timer<= 0) {
            velY=0;
        }else {
            timer--;
        }

        if (timer<= 0) {
            timer2--;
        }
        if (timer2<= 0){
            if(velX == 0) {
                velX=2;
            }
        }

        if(x <= 0 || x >= Game.WIDTH - 96) velX *= -1;



        //handler.addObject(new Trail(x, y, ID.Trail, Color.BLUE, 96, 96, 0.1f, handler)); //trail spawn

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x,y,96,96);
    }
}
