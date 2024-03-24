import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stad extends Actor
{
    /**
     * Act - do whatever the Stad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String naam;
    
    public Stad(String naam)
    {
        this.naam=naam;
        GreenfootImage i=getImage();
         i.scale(30,30);
    }
    
    public void act() 
    {
        // Add your action code here.
    }  
    public String geefNaam()
    {
        return naam;
    }
}
