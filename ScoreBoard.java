import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.Graphics;


public class ScoreBoard extends Actor
{
    private GreenfootImage image;
    private int score;
    public ScoreBoard()
    {
         this.image= new GreenfootImage(50, 50);
         this.clean();
         setImage(this.image);
         this.score=0;
    }
    
    public void clean()
    {
        image.setColor(Color.PINK);
        image.setFont(new Font("Arial",false,false, 25));
        image.fill();
        image.setColor(Color.BLACK);
        image.drawRect(0,0,49,49);    
    }
    
    public int getScore()
    {
        return this.score;
    }
    
    public void incScore()
    {
        this.score++;
    }
    
    public void act() 
    {
        this.clean();
        GreenfootImage image = getImage();
        image.setColor(Color.BLACK);
        image.drawString(Integer.toString(score), 3, 40);
    }
   
}
