import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class topografie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Topografie extends World
{
    private Plane myPlane;
    
    private Task myTask;
    private ScoreBoard myScore;
    
    /**
     * Constructor for objects of class topografie.
     * 
     */
    public Topografie()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(440, 565, 1); 
        this.setBackground("nederland.jpg");
       
     
        this.addObject(new City("Amsterdam"),250,250);
        this.addObject(new City("Den Haag"),130,300);
        this.addObject(new City("Leeuwarden"),300,100);
        
        myTask=new Task();
        this.addObject(myTask,100,40);
        
        myScore=new ScoreBoard();
        this.addObject(myScore,50,100);
        
        myPlane=new Plane(myTask,myScore);
        this.addObject(myPlane,100,200);
        
        makeTask();
    }
    
    public boolean makeTask()
    {
        List cities = getObjects(City.class);
        
        int count = cities.size();
        if(count ==0)
        {
              myTask.show("Klaar");
              return false;
        }
        
        else
        {    
            int randomCity = Greenfoot.getRandomNumber(count);
            City city = (City)cities.get(randomCity);
            String name = city.getName();
            myTask.show(name);
            return true;
       }
        
    }
}
