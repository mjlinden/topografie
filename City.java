import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class City extends Actor
{
    /**
     * Act - do whatever the Stad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String name;
    
    public City(String name)
    {
        this.name=name;
        GreenfootImage i=getImage();
         i.scale(30,30);
    }
    
    public void act() 
    {
        // Add your action code here.
    }  
    public String getName()
    {
        return name;
    }
}
