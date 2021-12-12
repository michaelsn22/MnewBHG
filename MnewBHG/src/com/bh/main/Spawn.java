package com.bh.main;

import java.util.Random;

public class Spawn {


    private Handler handler;
    private HUD hud;
    private Random r = new Random();

    private int scoreKeep = 0;
    private int count = 1;

    public Spawn(Handler handler, HUD hud){
        this.handler = handler;
        this.hud = hud;
    }

    public void tick(){
        scoreKeep++;

        if(scoreKeep >= 250){
            scoreKeep=0;
            count+=1;
            hud.setLevel(hud.getLevel()+1);
            System.out.println("Debug: Level up to level: " + count);
            //handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH-50), r.nextInt(Game.HEIGHT-50), ID.BasicEnemy, handler));

            if(hud.getLevel() == 1){
                handler.addObject(new BossEnemy(r.nextInt(Game.WIDTH-50), r.nextInt(Game.HEIGHT-50), ID.BossEnemy, handler));
            }
            /*
            handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH-50), r.nextInt(Game.HEIGHT-50), ID.BasicEnemy, handler));
            if(hud.getLevel() == 2){
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH-50), r.nextInt(Game.HEIGHT-50), ID.BasicEnemy, handler));
            }
            else if(hud.getLevel() == 3){
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH-50), r.nextInt(Game.HEIGHT-50), ID.BasicEnemy, handler));
            }
            else if(hud.getLevel() == 4){
                handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH-50), r.nextInt(Game.HEIGHT-50), ID.FastEnemy, handler));
            }
            else if(hud.getLevel() == 5){
                handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH-50), r.nextInt(Game.HEIGHT-50), ID.SmartEnemy, handler));
            }


             */

        }
    }


}
