import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.Graphics;

/**
 * Write a description of class Opdracht here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Task extends Actor
{
    /**
     * Act - do whatever the Opdracht wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String tekst="";
    
    public Task()
    {
        setImage(new GreenfootImage(150, 50));
        updateImage();     
    }
    
    public String getName()
    {
        return tekst;
    }
    
    public void show(String tekst)
    {
        this.tekst=tekst;
    }
        
    public void act() 
    {
        updateImage();
    }  
    
    public void resetInput()
    {
        GreenfootImage image = getImage();
       
        image.setColor(Color.YELLOW);
        image.setFont(new Font("Arial",false,false, 18));
        image.fill();
        image.setColor(Color.BLACK);
        image.drawRect(0,0,149,49);
        
    }
    private void updateImage()
    {
        resetInput();
        GreenfootImage image = getImage();
        image.setColor(Color.BLACK);
        image.drawString(tekst, 3, 40);
    }
}
