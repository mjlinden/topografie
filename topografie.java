import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class topografie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class topografie extends World
{
    private Vliegtuig myPlane;
    
    private Opdracht myOpdracht;
    private ScoreBord myScore;
    
    /**
     * Constructor for objects of class topografie.
     * 
     */
    public topografie()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(440, 565, 1); 
        this.setBackground("nederland.jpg");
       
     
        this.addObject(new Stad("Amsterdam"),250,250);
        this.addObject(new Stad("Den Haag"),130,300);
        this.addObject(new Stad("Leeuwarden"),300,100);
        
        myOpdracht=new Opdracht();
        this.addObject(myOpdracht,100,40);
        
        myScore=new ScoreBord();
        this.addObject(myScore,50,100);
        
        myPlane=new Vliegtuig(myOpdracht,myScore);
        this.addObject(myPlane,100,200);
        
        maakOpdracht();
    }
    
    public boolean maakOpdracht()
    {
        List steden = getObjects(Stad.class);
        
        int aantalSteden = steden.size();
        if(aantalSteden ==0)
        {
              myOpdracht.toon("Klaar");
              return false;
        }
        
        else
        {    
            int teKiezen = Greenfoot.getRandomNumber(aantalSteden);
            Stad deStad = (Stad)steden.get(teKiezen);
            String stadNaam = deStad.geefNaam();
            myOpdracht.toon(stadNaam);
            return true;
       }
        
    }
}
